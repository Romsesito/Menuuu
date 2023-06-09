import java.util.Scanner;

public class Dashboard {
    private Scanner scanner;
    private Transaccion transaccion;

    public Dashboard() {
        scanner = new Scanner(System.in);
        transaccion = new Transaccion();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("========== DASHBOARD ==========");
            System.out.println("1. Transaccion");
            System.out.println("2. Financial Report");
            System.out.println("3. Customer");
            System.out.println("4. Supplier");
            System.out.println("5. Invoice");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    transaccion.mostrarMenu();
                    break;
                case 2:
                    System.out.println("Opción: Financial Report");
                    break;
                case 3:
                    System.out.println("Opción: Customer");
                    break;
                case 4:
                    System.out.println("Opción: Supplier");
                    break;
                case 5:
                    System.out.println("Opción: Invoice");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 6);
    }

    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();
        dashboard.mostrarMenu();
    }
}
