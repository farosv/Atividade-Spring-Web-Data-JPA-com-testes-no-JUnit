# Atividade Spring Web + Data (JPA) com testes no JUnit

Atividade desenvolvida por: Marcelo Faro e Savio Franca

O projeto é composto pelas seguintes pastas:

com.example.domain que contém os arquivos: ContaBancaria.java, ContaBancariaRepository.java e ContaBancariaVersionada.java;

com.example.controller que contém o arquivo: ContaBancariaController.java;

A classe seguinte é a executável: ContaBancariaApplication.java;

Você pode encontrar o caso teste no seguinte caminho: /src/main/java/CasoDeteste/Teste_ContaBancaria.jmx

Comando SQL para criar uma tabela popular:

```sql
CREATE TABLE CONTA (
   ID INT AUTO_INCREMENT PRIMARY KEY, 
   NOME_CLIENTE VARCHAR, 
   SALDO FLOAT
);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (1,'João Silva', 1000.50);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (2, 'Maria Oliveira', 1500.75);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (3, 'Carlos Pereira', 800.20);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (4, 'Ana Souza', 2000.00);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (5, 'Luana Santos', 300.90);
  ```


