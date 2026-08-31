# Agenda de Contatos em Java

Projeto didático desenvolvido em Java para acompanhar a evolução dos conceitos trabalhados na disciplina de Programação Orientada a Objetos (POO).

O sistema é desenvolvido de forma incremental. Cada versão introduz novos conceitos, estruturas de dados e melhorias sobre a versão anterior.

## Objetivo

Construir uma Agenda de Contatos completa, iniciando com uma solução procedural simples e evoluindo até uma aplicação orientada a objetos com interface gráfica e banco de dados.

 Versão  Conceito Principal  Descrição 
---------
 v0.0.0  Variáveis simples  Permite armazenar apenas um contato 
 v0.1.0  Arrays  Permite vários contatos com capacidade fixa 
 v0.2.0  List + ArrayList  Permite vários contatos com tamanho dinâmico 

---

### v0.0.0 — Programação Procedural Básica

Primeira versão da aplicação.

Principais características
- Uso de variáveis primitivas e `String` para cada atributo de um único contato;
- Estrutura de código procedural simples em um único arquivo;
- Inserção e exibição direta dos dados no console.

Nesta versão, um novo contato substitui o contato armazenado anteriormente.

---

### v0.1.0 — Arrays e Capacidade Fixa

Segunda versão da Agenda.

Principais características
- Uso de arrays simples (`String[]`) para cada atributo de contato;
- Controle de capacidade máxima pré-definida;
- Manipulação através de índices e estruturas de repetição (`for`);
- Busca sequencial nos arrays;
- Remoção de elementos com reorganização física do array (deslocamento manual de itens).

---

### v0.2.0 — Coleções e Tamanho Dinâmico (Versão Atual)

Nesta versão, a Agenda de Contatos passou a utilizar a API de Coleções do Java (`List` e `ArrayList`) para o armazenamento dinâmico.

Principais conceitos aplicados
- Interface `List` e classe concreta `ArrayList`;
- Tipos genéricos com Generics (`ListString`);
- Alocação e redimensionamento dinâmico de memória;
- Utilização dos métodos nativos da API (`add`, `get`, `remove`, `size`);
- Simplificação e otimização das operações de inserção, busca e remoção.

---

## Próximas Versões

O projeto continuará evoluindo conforme a progressão da disciplina

- v0.3.0 e posteriores Introdução da Programação Orientada a Objetos (classes, objetos e encapsulamento), modularização do código, padrões de arquitetura (DAO e MVC), interfaces gráficas com Swing e persistência de dados com JDBC e Banco de Dados.

---

## Controle de Versões

As versões estáveis do projeto são identificadas e organizadas por tags Git.

Para alternar entre as versões no repositório

```bash
git checkout v0.2.0
```
