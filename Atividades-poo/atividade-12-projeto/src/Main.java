import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Cadastrar Cliente");
            System.out.println("4. Cadastrar Funcionário");
            System.out.println("5. Listar Veículos");
            System.out.println("6. Listar Pessoas");
            System.out.println("7. Vender Veículo");
            System.out.println("8. Realizar Manutenção");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Combustível (GASOLINA/DIESEL/ELETRICO/FLEX): ");
                    TipoCombustivel combustivel = TipoCombustivel.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Categoria (SEDAN/SUV/HATCH/PICKUP): ");
                    CategoriaVeiculo categoria = CategoriaVeiculo.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Portas: ");
                    int portas = sc.nextInt();
                    sc.nextLine();
                    Carro carro = new Carro(modelo, ano, combustivel, categoria, portas);
                    veiculos.add(carro);
                    carro.registrar();
                    break;
                case 2:
                    System.out.print("Modelo: ");
                    String modeloM = sc.nextLine();
                    System.out.print("Ano: ");
                    int anoM = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Combustível (GASOLINA/DIESEL/ELETRICO/FLEX): ");
                    TipoCombustivel combustivelM = TipoCombustivel.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Cilindradas: ");
                    int cilindradas = sc.nextInt();
                    sc.nextLine();
                    Moto moto = new Moto(modeloM, anoM, combustivelM, cilindradas);
                    veiculos.add(moto);
                    moto.registrar();
                    break;
                case 3:
                    System.out.print("Nome: ");
                    String nomeC = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpfC = sc.nextLine();
                    Cliente cliente = new Cliente(nomeC, cpfC);
                    pessoas.add(cliente);
                    cliente.exibirDados();
                    break;
                case 4:
                    System.out.print("Nome: ");
                    String nomeF = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpfF = sc.nextLine();
                    System.out.print("Cargo (VENDEDOR/MECANICO/GERENTE): ");
                    CargoFuncionario cargo = CargoFuncionario.valueOf(sc.nextLine().toUpperCase());
                    Funcionario funcionario = new Funcionario(nomeF, cpfF, cargo);
                    pessoas.add(funcionario);
                    funcionario.exibirDados();
                    break;
                case 5:
                    System.out.println("--- Veículos ---");
                    for (Veiculo v : veiculos) v.exibirInfo();
                    break;
                case 6:
                    System.out.println("--- Pessoas ---");
                    for (Pessoa p : pessoas) p.exibirDados();
                    break;
                case 7:
                    System.out.print("Digite o modelo do veículo para vender: ");
                    String modeloV = sc.nextLine();
                    boolean achou = false;
                    for (Veiculo v : veiculos) {
                        if (v.modelo.equalsIgnoreCase(modeloV) && !v.vendido) {
                            v.vender();
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) System.out.println("Veículo não encontrado ou já vendido.");
                    break;
                case 8:
                    System.out.print("Digite o modelo do veículo para manutenção: ");
                    String modeloMan = sc.nextLine();
                    boolean ok = false;
                    for (Veiculo v : veiculos) {
                        if (v.modelo.equalsIgnoreCase(modeloMan)) {
                            v.realizarManutencao();
                            ok = true;
                            break;
                        }
                    }
                    if (!ok) System.out.println("Veículo não encontrado.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        sc.close();
    }
}
