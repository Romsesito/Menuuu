import java.util.List;
import java.util.Scanner;

public class Dashboard {
    private Scanner scanner;
    private Transaccion transaccion;
    private ReporteFinanciero reporteFinanciero;
    private ClienteProveedor clienteProveedor;

    public Dashboard() {
        scanner = new Scanner(System.in);
        transaccion = new Transaccion();
        clienteProveedor = new ClienteProveedor(transaccion);
        reporteFinanciero = new ReporteFinanciero(transaccion.getIngresos(), transaccion.getEgresos(), clienteProveedor.getClientesProveedores());
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
                    reporteFinanciero.mostrarMenu(); // Llamar al método mostrarMenu() de ReporteFinanciero
                    break;
                case 3:
                    System.out.println("Opción: Customer");
                    clienteProveedor.mostrarMenu(); // Llamar al método mostrarMenu() de ClienteProveedor
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
