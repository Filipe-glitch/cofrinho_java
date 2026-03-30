# 💰 Cofrinho em Java

Projeto simples desenvolvido na linguagem de programação **java** com o objetivo de simular um cofrinho digital, permitindo adicionar, remover e listar valores armazenados.

## 🚀 Objetivo

Este projeto foi criado com foco em **praticar conceitos básicos de programação em Java**, como:

- Classes e objetos
- Métodos
- Estruturas de repetição (`for`)
- Estruturas condicionais (`if`)
- Organização de código
- Lógica de Programação

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Eclipse(IDE)

## 📂 Estrutura do Projeto

O projeto é composto por classes responsáveis por representar o funcionamento de um cofrinho, incluindo:

- Classe abstrata `Moeda`
- Classes filhas como `Real`, `Euro` e `Dolar`
- Classe `Cofrinho` responsável pelo gerenciamento das moedas
- Classe `Principal` com menu interativo via terminal

## ⚙️ Funcionalidades

✔️ Adicionar moedas (Real, Euro, Dólar)  
✔️ Remover valores de uma moeda específica  
✔️ Listar moedas armazenadas no cofrinho  
✔️ Converter o valor total para Real  

## 💡 Conceitos aplicados

Durante o desenvolvimento foram utilizados:

- **Encapsulamento**
- **Herança**
- **Polimorfismo**
- **Classe abstrata**
- `if` → para validações e decisões  
- `for` → para percorrer listas/valores  
- Métodos → para organizar as funcionalidades  
- Classes → para estruturar o sistema
- Coleções (`ArrayList`)
- Tratamento de exceções (`try/catch`)

## ⚠️ Regras do sistema

- Não é possível adicionar valores menores ou iguais a zero
- Remoções só ocorrem se houver saldo suficiente
- A moeda é removida do cofrinho quando seu valor chega a zero
