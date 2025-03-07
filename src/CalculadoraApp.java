import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        while (true) {

            System.out.println("**** Aplicación Calculadora ****");

            mostrarMenu();

            try {

                Scanner scanner = new Scanner(System.in);
                var operacion = Integer.parseInt(scanner.nextLine());

                if(operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, scanner);
                }else if(operacion == 5) {
                    System.out.println("Hasta Pronto");
                    break;
                }else {
                    System.out.println("Operacion Erronea: " + operacion);
                }

                System.out.println();

            }catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }

    }

    private static void mostrarMenu() {
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.println();
        System.out.println("Operación a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner console) {
        System.out.print("Proporciona Operando 1: ");
        var operando1 = Double.parseDouble(console.nextLine());
        System.out.print("Proporciona Operando 2: ");
        var operando2 = Double.parseDouble(console.nextLine());

        double resultado = 0;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado: " + resultado);
            }
            default -> {
                System.out.println("Operacion Erronea: " + operacion);
            }
        }
    }
}
