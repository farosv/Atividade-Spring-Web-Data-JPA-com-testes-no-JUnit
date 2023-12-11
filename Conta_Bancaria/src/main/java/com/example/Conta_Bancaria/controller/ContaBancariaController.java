package com.example.Conta_Bancaria.controller;

import java.util.List;
import java.util.Optional;
import com.example.Conta_Bancaria.domain.ContaBancaria;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Conta_Bancaria.domain.ContaBancariaRepository;

@RestController
@RequestMapping(value = "/conta")
public class ContaBancariaController {

    @Autowired
    private ContaBancariaRepository contaRepo;

    public ContaBancariaController() {
    }

    @GetMapping("/todos")
    public List<ContaBancaria> pesquisarConta() {
        return contaRepo.findAll();
    }

    @GetMapping("/buscar/{id}")
    public ContaBancaria buscarConta(@PathVariable Long id) {
        System.out.println("Buscando o ID = " + id);
        return contaRepo.findById(id).orElse(new ContaBancaria());
    }

    @PutMapping("/deposita/{id}")
    public ResponseEntity<String> depositaNaConta(@PathVariable Long id, @RequestParam float valor) {
        System.out.println("ID da conta para depósito: " + id);
        System.out.println("Valor do depósito: " + valor);

        Optional<ContaBancaria> contaOptional = contaRepo.findById(id);

        if (contaOptional.isPresent()) {
            ContaBancaria conta = contaOptional.get();
            float novoSaldo = conta.getSaldo() + valor;
            conta.setSaldo(novoSaldo);
            contaRepo.save(conta);
            return ResponseEntity.ok("Depósito de R$ " + valor + " realizado com sucesso. Novo saldo: R$" + novoSaldo);
        } else {
            System.out.println("Conta não encontrada para o ID: " + id);
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/retirada/{id}")
    public ResponseEntity<String> retiradaNaConta(@PathVariable Long id, @RequestParam float valor) {
        System.out.println("ID da conta para retirada: " + id);
        System.out.println("Valor da retirada: " + valor);

        Optional<ContaBancaria> contaOptional = contaRepo.findById(id);

        if (contaOptional.isPresent()) {
            ContaBancaria conta = contaOptional.get();

            if (conta.getSaldo() >= valor) {
                float novoSaldo = conta.getSaldo() - valor;
                conta.setSaldo(novoSaldo);
                contaRepo.save(conta);
                return ResponseEntity.ok("Retirada de R$ " + valor + " realizada com sucesso. Novo saldo: R$" + novoSaldo);
            } else {
                System.out.println("Saldo insuficiente para a retirada. Saldo atual: R$" + conta.getSaldo());
                return ResponseEntity.badRequest().body("Saldo insuficiente para a retirada.");
            }
        } else {
            System.out.println("Conta não encontrada para o ID: " + id);
            return ResponseEntity.notFound().build();
        }
    }
}
