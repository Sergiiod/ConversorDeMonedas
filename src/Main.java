import com.google.gson.Gson;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        ConvertirMonedas conversion = new ConvertirMonedas();
        double cantidad = 0;
        try {
            CrearJson json = new CrearJson();
            while (opcion != 9) {

                System.out.println("Bienvenido al conversor de monedas, elija una opción para continuar\n" +
                        "1. Dolar a Peso argentino\n" +
                        "2. Peso argentino a dolar\n" +
                        "3, Dólar a real brasileño\n" +
                        "4. Real brasileño a dólar\n" +
                        "5. Dólar a peso colombiano\n" +
                        "6. Peso colombiano a dólar\n" +
                        "7. Moneda diferente\n" +
                        "9. Salir");
                opcion = scanner.nextInt();
                if (opcion == 1) {
                    System.out.println("ingresa cantidad");
                    cantidad = scanner.nextDouble();
                    Moneda usdArs = conversion.dolarAPesoArgentino(cantidad);
                    System.out.println("El valor de " + cantidad + usdArs.base_code() + " Es igual a: " + usdArs.conversion_result() + usdArs.target_code());
                    json.generarJson(usdArs);
                } else if (opcion == 2) {
                    System.out.println("ingresa cantidad");
                    cantidad = scanner.nextDouble();
                    Moneda arsUsd = conversion.pesoArgentinoADolar(cantidad);
                    System.out.println("El valor de " + cantidad + arsUsd.base_code() + " Es igual a: " + arsUsd.conversion_result() + arsUsd.target_code());
                    json.generarJson(arsUsd);
                } else if (opcion == 3 ) {
                    System.out.println("ingresa cantidad");
                    cantidad = scanner.nextDouble();
                    Moneda usdBrl = conversion.dolarAReal(cantidad);
                    System.out.println("El valor de " + cantidad + usdBrl.base_code() + " Es igual a: " + usdBrl.conversion_result() + usdBrl.target_code());
                    json.generarJson(usdBrl);
                } else if (opcion == 4) {
                    System.out.println("ingresa cantidad");
                    cantidad = scanner.nextDouble();
                    Moneda brlUsd = conversion.realADolar(cantidad);
                    System.out.println("El valor de " + cantidad + brlUsd.base_code() + " Es igual a: " + brlUsd.conversion_result() + brlUsd.target_code());
                    json.generarJson(brlUsd);
                } else if (opcion == 5) {
                    System.out.println("ingresa cantidad");
                    cantidad = scanner.nextDouble();
                    Moneda usdCop = conversion.realADolar(cantidad);
                    System.out.println("El valor de " + cantidad + usdCop.base_code() + " Es igual a: " + usdCop.conversion_result() + usdCop.target_code());
                    json.generarJson(usdCop);
                } else if (opcion == 6) {
                    System.out.println("ingresa cantidad");
                    cantidad = scanner.nextDouble();
                    Moneda copUsd = conversion.realADolar(cantidad);
                    System.out.println("El valor de " + cantidad + copUsd.base_code() + " Es igual a: " + copUsd.conversion_result() + copUsd.target_code());
                    json.generarJson(copUsd);
                } else if (opcion == 7) {
                    System.out.println("Ingresa la divisa de la que quieres convertir");
                    String divisaUno = scanner.next();
                    divisaUno = divisaUno.toUpperCase();
                    System.out.println("Ingresa la divisa a la que quieres convertir");
                    String divisaDos = scanner.next();
                    divisaDos = divisaDos.toUpperCase();
                    System.out.println("ingresa cantidad");
                    cantidad = scanner.nextDouble();
                    Moneda personalizada = conversion.divisaEspecifica(divisaUno, divisaDos, cantidad);
                    System.out.println("El valor de " + cantidad + personalizada.base_code() + " Es igual a: " + personalizada.conversion_result() + personalizada.target_code());
                    json.generarJson(personalizada);
                } else {
                    System.out.println("Opción invalida intenta de nuevo");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Aplicación cerrándose");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}