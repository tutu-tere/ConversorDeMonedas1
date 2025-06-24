import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Convertidor convertidor = new Convertidor();
        List<RegistroConversion> historial = new ArrayList<>();
        int opcion;

        do {
            System.out.println("""
            🪙 Bienvenido al Conversor de Monedas 🪙
            1) Realizar una conversión
            2) Ver historial de conversiones
            3) Salir
            Elige una opción:
            """);

            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Moneda origen (ej: USD): ");
                    String origen = teclado.nextLine().toUpperCase();

                    var datos = convertidor.obtenerDatosMoneda(origen);

                    System.out.print("Moneda destino (ej: CLP): ");
                    String destino = teclado.nextLine().toUpperCase();

                    if (!datos.conversion_rates.containsKey(destino)) {
                        System.out.println("⚠️ Moneda no disponible.");
                        break;
                    }

                    System.out.print("Monto a convertir: ");
                    double monto = teclado.nextDouble();
                    teclado.nextLine(); // limpieza

                    double tasa = datos.conversion_rates.get(destino);
                    double resultado = monto * tasa;

                    System.out.printf("✅ %.2f %s = %.2f %s\n", monto, origen, resultado, destino);

                    historial.add(new RegistroConversion(origen, destino, monto, resultado));
                }

                case 2 -> {
                    if (historial.isEmpty()) {
                        System.out.println("📂 Historial vacío.");
                    } else {
                        System.out.println("📜 Historial de conversiones:");
                        historial.forEach(System.out::println);
                    }
                }

                case 3 -> System.out.println("👋 ¡Gracias por usar el conversor!");
                default -> System.out.println("❌ Opción inválida. Intenta nuevamente.");
            }

        } while (opcion != 3);

        teclado.close();
    }
}