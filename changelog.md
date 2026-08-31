# CHANGELOG

Todas as alterações notáveis neste projeto serão documentadas neste arquivo.

O formato é baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/),
e este projeto adere ao [Semantic Versioning](https://semver.org/lang/pt-BR/).

---

## [Unreleased] — Próximas Atualizações

### Planejado
- Introdução de conceitos de Programação Orientada a Objetos (POO):
  - Criação da classe `Agenda` para gerenciar a lista de contatos.
- Modularização da estrutura de pacotes.

---

## [v0.2.0] — 2026-08-31

### Adicionado
- Integração da API de Coleções do Java (`List` e `ArrayList`) para armazenamento dinâmico de contatos.
- Uso de **Generics** (`List<String>`) para garantir a segurança de tipos.
- Suporte a redimensionamento automático de capacidade da lista.
- Iteração sobre os elementos com a estrutura `for-each`.
- Apresentação da versão `v0.2.0` do projeto.

### Alterado
- Substituição de arrays de tamanho fixo por estruturas de dados dinâmicas.
- Simplificação da lógica de exclusão e busca utilizando métodos nativos (`remove`, `indexOf`, `get`).

### Removido
- Deslocamento manual de elementos em array durante operações de remoção.

---

## [v0.1.0] — 2026-08-20

### Adicionado
- Armazenamento de múltiplos contatos via arrays simples (`String[]`).
- Controle de capacidade máxima pré-definida no sistema.
- Algoritmo de busca sequencial em arrays.
- Lógica manual de remoção e reorganização física de elementos no array.

---

## [v0.0.0] — 2026-08-10

### Adicionado
- Primeira versão procedural básica da agenda.
- Armazenamento de um único contato em variáveis primitivas / `String`.
- Entrada e saída de dados simples no console.
