import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMonedas {
      public Moneda dolarAPesoArgentino(double cantidad) {
          URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c7574a4973c0e772552e95eb/pair/" + "USD/" + "ARS/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse
                    .BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No fue posible convertir la moneda");
        }
     }
     public Moneda pesoArgentinoADolar (double cantidad) {
         URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c7574a4973c0e772552e95eb/pair/" + "ARS/" + "USD/" + cantidad);
         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
         try {
             HttpResponse<String> response = client.send(request, HttpResponse
                     .BodyHandlers.ofString());
             return new Gson().fromJson(response.body(), Moneda.class);
         } catch (Exception e) {
             throw new RuntimeException("No fue posible convertir la moneda");
         }
     }
    public Moneda dolarAReal(double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c7574a4973c0e772552e95eb/pair/" + "USD/" + "BRL/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse
                    .BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No fue posible convertir la moneda");
        }
    }
    public Moneda realADolar(double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c7574a4973c0e772552e95eb/pair/" + "BRL/" + "USD/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse
                    .BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No fue posible convertir la moneda");
        }
    }
    public Moneda dolarAPesoColombiano (double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c7574a4973c0e772552e95eb/pair/" + "USD/" + "COP/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse
                    .BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No fue posible convertir la moneda");
        }
    }
    public Moneda pesoColombianoADolar (double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c7574a4973c0e772552e95eb/pair/" + "COP/" + "USD/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse
                    .BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No fue posible convertir la moneda");
        }
    }
    public Moneda divisaEspecifica (String divisaUno, String divisaDos, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c7574a4973c0e772552e95eb/pair/" + divisaUno + "/" + divisaDos + "/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse
                    .BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No fue posible convertir la moneda");
        }
    }
}
