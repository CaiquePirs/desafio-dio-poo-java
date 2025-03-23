# iPhone - Desafio de Modelagem e Diagramação UML

## Descrição

Este projeto é dedicado ao desafio proposto pelo DIO de modelagem e diagramação UML do **iPhone**. A proposta consiste em modelar e diagramar as funcionalidades do iPhone, representando suas principais características e interações através de um diagrama UML. O desafio inclui a criação de diagramas de classes e interfaces que representam três funcionalidades principais do iPhone:

- **Reprodutor Musical**
- **Aparelho Telefônico**
- **Navegador na Internet**

## Funcionalidades a Modelar

### 1. **Reprodutor Musical**
Métodos:
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 2. **Aparelho Telefônico**
Métodos:
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 3. **Navegador na Internet**
Métodos:
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

## Objetivo

O objetivo deste desafio é criar uma representação UML das funcionalidades descritas e, posteriomente, implementar as classes e interfaces em **Java** para demonstrar seu funcionamento. O diagrama UML será a principal ferramenta de modelagem, servindo como guia para o desenvolvimento das funcionalidades do iPhone.

## Diagrama UML

```mermaid
classDiagram
    class Iphone {
        -String modelo
        -String cor
        +Iphone(String modelo, String cor)
        +String getModelo()
        +String getCor()
        +void atender()
        +void ligar(String numero)
        +void desligar()
        +void adicionarTelefone(String telefone)
        +void excluirTelefone(String telefone)
        +void adicionarNovaAba()
        +void exibirPagina(String url)
        +void pesquisar(String texto)
        +void atualizarPagina()
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
        +void excluirMusica(String musica)
    }

    class Telefone {
        +void atender()
        +void ligar(String numero)
        +void desligar()
        +void adicionarTelefone(String telefone)
        +void excluirTelefone(String telefone)
    }

    class Navegador {
        +void adicionarNovaAba()
        +void exibirPagina(String url)
        +void pesquisar(String texto)
        +void atualizarPagina()
    }

    class ReprodutorMusical {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
        +void excluirMusica(String musica)
    }

    Iphone --> Telefone
    Iphone --> Navegador
    Iphone --> ReprodutorMusical
