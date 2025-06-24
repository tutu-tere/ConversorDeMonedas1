import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Convertidor {
    public DatosConversion obtenerDatosMoneda(String codigoMoneda) {
        String url = "https://v6.exchangerate-api.com/v6/8b706a4cce18203c8586f523/latest/" + codigoMoneda;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DatosConversion.class);

        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener datos para la moneda: " + codigoMoneda);
        }
    }
}