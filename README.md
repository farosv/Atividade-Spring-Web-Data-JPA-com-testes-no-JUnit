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
VALUES (1,'Vitor Faro', 2001.30);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (2, 'Savio Franca', 3500.55);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (3, 'Cleber Silva', 400.60);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (4, 'Simone Lourenço', 1050.33);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (5, 'Luna Maia', 200.00);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (6, 'Helena Dutra', 5500.00);
  ```


