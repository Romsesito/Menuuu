import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transaccion {
    private Scanner scanner;
    private List<String> ingresos;
    private List<String> egresos;

    public Transaccion() {
        scanner = new Scanner(System.in);
        ingresos = new ArrayList<>();
        egresos = new ArrayList<>();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("========== TRANSACCIONES ==========");
            System.out.println("1. Agregar Ingresos");
            System.out.println("2. Agregar Egresos");
            System.out.println("3. Volver al Dashboard");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarIngresos();
                    break;
                case 2:
                    agregarEgresos();
                    break;
                case 3:
                    System.out.println("Volviendo al Dashboard...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 3);
    }

    private void agregarIngresos() {
        System.out.println("Opción: Agregar Ingresos");

        boolean agregarOtro = true;
        do {
            System.out.print("Ingrese el nombre del producto o tratamiento: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            String ingreso = nombre + " - $" + precio;
            ingresos.add(ingreso);

            System.out.println("Ingreso agregado correctamente: " + ingreso);

            System.out.print("¿Desea agregar otro producto o tratamiento? (S/N): ");
            String respuesta = scanner.nextLine();
            agregarOtro = respuesta.equalsIgnoreCase("S");
        } while (agregarOtro);
    }

    private void agregarEgresos() {
        System.out.println("Opción: Agregar Egresos");

        boolean agregarOtro = true;
        do {
            System.out.print("Ingrese el nombre del producto o servicio: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            String egreso = nombre + " - $" + precio;
            egresos.add(egreso);

            System.out.println("Egreso agregado correctamente: " + egreso);

            System.out.print("¿Desea agregar otro egreso? (S/N): ");
            String respuesta = scanner.nextLine();
            agregarOtro = respuesta.equalsIgnoreCase("S");
        } while (agregarOtro);
    }

    public List<String> getIngresos() {
        return ingresos;
    }

    public List<String> getEgresos() {
        return egresos;
    }
}
