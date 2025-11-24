# Bichinho Virtual 🐾

Sistema de gerenciamento de pets virtuais desenvolvido em Java seguindo os princípios de POO.

## 📋 Estrutura do Projeto

```
src/
├── DAO/                          # Camada de acesso a dados
│   ├── IDAO.java                # Interface genérica DAO
│   └── DAO.java                 # Implementação DAO com ArrayList
├── Enums/
│   └── EspecieEnum.java         # Enum com espécies de pets
├── Modules/
│   ├── User/                    # Módulo de usuários
│   │   ├── Errors/
│   │   │   └── UsuarioErros.java
│   │   ├── Exceptions/
│   │   │   └── UsuarioException.java
│   │   ├── UsuarioModel.java
│   │   └── UsuarioController.java
│   └── VirtualPet/              # Módulo de pets virtuais
│       ├── Errors/
│       │   └── VirtualPetErros.java
│       ├── Exceptions/
│       │   └── VirtualPetException.java
│       ├── VirtualPetModel.java
│       └── VirtualPetController.java
├── Utils/
│   └── MenuUtil.java            # Utilitários de menu
├── AppView.java                 # Interface visual do app
└── Main.java                    # Classe principal

```

## 🚀 Como Executar

### Compilar

```bash
cd src
javac Main.java
```

### Executar

```bash
java Main
```

## 🎮 Funcionalidades

### Gerenciamento de Usuários

- ✅ Cadastro de usuário com validações:
  - Email deve conter @
  - Senha deve ter no mínimo 8 caracteres
  - Email deve ser único
- ✅ Login com credenciais criptografadas (Base64)
- ✅ Logout

### Gerenciamento de Pets Virtuais

- ✅ Adotar pet (escolher nome e espécie)
- ✅ Alimentar pet
- ✅ Limpar pet
- ✅ Brincar com pet
- ✅ Visualizar status do pet
- ✅ Sistema de validações (não pode abandonar, não alimentar se já comeu, etc.)

### Espécies Disponíveis

- 🐱 GATO
- 🐶 CACHORRO
- 🐰 COELHO
- 🐦 PÁSSARO
- 🐠 PEIXE

## 🛡️ Validações Implementadas

### Usuário

- Email inválido (sem @)
- Senha fraca (menos de 8 caracteres)
- Email já cadastrado
- Credenciais incorretas no login

### Pet Virtual

- Já possui pet (não pode adotar outro)
- Não pode abandonar pet
- Pet já está limpo
- Pet já comeu

## 🏗️ Padrões e Boas Práticas

- ✅ Padrão DAO (Data Access Object)
- ✅ Separação em camadas (Model, Controller, View)
- ✅ Tratamento de exceções personalizadas
- ✅ Encapsulamento adequado
- ✅ Classes de erros com constantes finais
- ✅ Uso de Enums para tipos fixos
- ✅ Criptografia de senha (Base64)
- ✅ Nomenclatura seguindo convenções Java

## 📊 Diagrama UML

O projeto segue rigorosamente o diagrama UML fornecido, incluindo:

- Interfaces genéricas (IDAO<T>)
- Classes de modelo (UsuarioModel, VirtualPetModel)
- Controllers com validações
- Enumeradores
- Hierarquia de exceções
