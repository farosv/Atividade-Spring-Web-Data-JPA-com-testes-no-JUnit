package com.example.Conta_Bancaria.domain;

import java.util.Date;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Version;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class ContaBancariaVersionada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCliente;

    private float saldo;

    @Version
    private Date dataMovimento;

    public ContaBancariaVersionada() {}

    public ContaBancariaVersionada(String nomeCliente, float saldo) {

        this.nomeCliente = nomeCliente;

        this.saldo = saldo;
    }

    public Date getdataMovimento() {
        return dataMovimento;
    }

    public void setdataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
