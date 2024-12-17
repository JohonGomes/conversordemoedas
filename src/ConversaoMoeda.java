import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversaoMoeda {
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/ff54cd4f684a1a07d777e0a8/pair/";
    private static final Gson gson = new Gson();
    private static final HttpClient httpClient = HttpClient.newHttpClient();

    private String baseCode;
    private String targetCode;

    public ConversaoMoeda(String baseCode, String targetCode) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
    }

    public DadosUsados novaConversao(String baseCode, String targetCode) throws IOException, InterruptedException {
        URI conversaoUri = URI.create(API_BASE_URL + baseCode + "/" + targetCode);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(conversaoUri)
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return gson.fromJson(response.body(), DadosUsados.class);
    }

    public DadosUsados novaConversao() throws IOException, InterruptedException {
        return novaConversao(this.baseCode, this.targetCode);
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setCodigos(String baseCode, String targetCode) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
    }
}