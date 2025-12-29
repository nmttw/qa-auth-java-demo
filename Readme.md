# QA Auth Demo – Projeto Java para Testes

Este projeto tem como objetivo servir como base para **testes manuais e automatizados**, simulando um fluxo simples de cadastro e login.

## 🎯 Objetivo
- Validar fluxos de autenticação
- Identificar falhas funcionais e de segurança
- Apoiar estudos em QA e Segurança da Informação

## 🚨 Falhas Intencionais
- Não há bloqueio por múltiplas tentativas de login
- Senhas fracas são aceitas
- Não há sanitização de entradas

## 🛠️ Tecnologias
- Java 17
- Maven
- JUnit 5

## ▶️ Como executar
```bash
mvn clean install
mvn exec:java
