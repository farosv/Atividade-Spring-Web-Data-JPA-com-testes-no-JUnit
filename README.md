# Atividade-Spring-Web-Data-JPA-com-testes-no-JUnitAtividade Spring Web + Data (JPA) com testes no JMeter

Desenvolvido por: Eduarda Reis e Eduardo Cordovil

O projeto é composto pelas massas:

ifpa.appjpa.domain que contém os arquivos: Conta.java e ContaRepo.java;

ifpa.apppjpa.controller que contém o arquivo: ContaController.java;

A classe seguinte é: AppJpaApplication.java

Você encontra o caso de teste na pasta: /src/main/java/casodeteste/ casodeteste.jmx

Comando SQL para criar uma tabela popular:

CREATE TABLE CONTA (
   ID INT AUTO_INCREMENT PRIMARY KEY, 
   NOME_CLIENTE VARCHAR, 
   SALDO FLOAT
);

```sql()
(INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (1,'João Silva', 1000.50);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (2, 'Maria Oliveira', 1500.75);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (3, 'Carlos Pereira', 800.20);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (4, 'Ana Souza', 2000.00);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (5, 'Luana Santos', 300.90);)
  ```
