import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final String OPCOES_MENU = """
            1- Real Brasileiro (BRL)
            2- Dólar Americano (USD)
            3- Peso Argentino (ARS)
            4- Peso Chileno (CLP)
            5- Iene (JPY)
            6- Yuan (CNY)
            0- Sair do programa
            """;

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public static String menuSelecionado(int selecao) {
        return switch (selecao) {
            case 0 -> {
                System.out.println("Saindo do programa...Até mais!");
                System.exit(0);
                yield null;
            }
            case 1 -> "BRL";
            case 2 -> "USD";
            case 3 -> "ARS";
            case 4 -> "CLP";
            case 5 -> "JPY";
            case 6 -> "CNY";
            default -> {
                System.out.println("Seleção inválida, utilizado valor pré-definido - Dólar Americano (USD)");
                yield "USD";
            }
        };
    }

    public String base_code_menu() {
        return selecionarMoeda("Selecione a moeda em que o valor a converter será inserido:");
    }

    public String target_code_menu() {
        return selecionarMoeda("Selecione a moeda para qual deseja que a conversão seja feita:");
    }

    private String selecionarMoeda(String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                System.out.println(OPCOES_MENU);

                int selecao = scanner.nextInt();
                return menuSelecionado(selecao);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine();
            }
        }
    }

    public double valor_inicial() {
        while (true) {
            try {
                System.out.println("Informe o valor que deseja converter:");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }
    }

    public void fecharScanner() {
        scanner.close();
    }
}