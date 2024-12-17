import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Menu menuSelecao = new Menu();

        try {
            String base_code = menuSelecao.base_code_menu();
            String target_code = menuSelecao.target_code_menu();
            double valorConversao = menuSelecao.valor_inicial();

            ConversaoMoeda novaConversao = new ConversaoMoeda(base_code, target_code);

            DadosUsados dadosConversao = novaConversao.novaConversao(base_code, target_code);
            double resultadoConversao = dadosConversao.conversion_rate() * valorConversao;

            NumberFormat formatterBase = NumberFormat.getCurrencyInstance(getCurrencyLocale(base_code));
            NumberFormat formatterTarget = NumberFormat.getCurrencyInstance(getCurrencyLocale(target_code));

            System.out.printf("Conversão: %s = %s%n",
                    formatterBase.format(valorConversao),
                    formatterTarget.format(resultadoConversao)
            );

        } catch (IOException | InterruptedException e) {
            System.err.println("Erro na conversão de moeda: " + e.getMessage());
            e.printStackTrace();
        } finally {
            menuSelecao.fecharScanner();
        }
    }

    private static Locale getCurrencyLocale(String currencyCode) {
        return switch (currencyCode) {
            case "BRL" -> new Locale("pt", "BR");
            case "USD" -> Locale.US;
            case "EUR" -> Locale.GERMANY;
            case "JPY" -> Locale.JAPAN;
            case "ARS" -> new Locale("es", "AR");
            case "CLP" -> new Locale("es", "CL");
            case "CNY" -> Locale.CHINA;
            default -> Locale.US;
        };
    }
}