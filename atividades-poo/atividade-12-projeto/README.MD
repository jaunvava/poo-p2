## Projeto: Gestão de Veículos

### Descrição

Sistema para cadastro, venda e manutenção de veículos, além de cadastro de clientes e funcionários. Utiliza abstração, herança, interfaces, enums e menu interativo.

### Estrutura

- **2 classes abstratas:**
  - `Veiculo` (base para veículos)
  - `Pessoa` (base para pessoas)
- **4 classes concretas:**
  - `Carro`, `Moto` (herdam de Veiculo)
  - `Cliente`, `Funcionario` (herdam de Pessoa)
- **3 interfaces:**
  - `Registravel`, `Vendavel`, `Manutencao`
- **3 enums:**
  - `TipoCombustivel`, `CategoriaVeiculo`, `CargoFuncionario`

### Funcionalidades

- Cadastro de carros e motos
- Cadastro de clientes e funcionários
- Listagem de veículos e pessoas
- Venda de veículos
- Realização de manutenção
- Menu interativo

### Como executar

1. Compile todos os arquivos Java da pasta `src`.
2. Execute o arquivo `Main.java`.
3. Siga as opções do menu.

