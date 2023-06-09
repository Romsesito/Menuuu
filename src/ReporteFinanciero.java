import java.util.List;
import java.util.Scanner;

public class ReporteFinanciero {
    private List<String> ingresos;
    private List<String> egresos;
    private List<String> clientesProveedores;
    private Scanner scanner;

    public ReporteFinanciero(List<String> ingresos, List<String> egresos, List<String> clientesProveedores) {
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.clientesProveedores = clientesProveedores;
        scanner = new Scanner(System.in); // Inicializar el objeto Scanner
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("========== REPORTE FINANCIERO ==========");
            System.out.println("1. Lista de Ingresos");
            System.out.println("2. Lista de Egresos");
            System.out.println("3. Lista de Clientes/Proveedores");
            System.out.println("4. Volver al Dashboard");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarListaIngresos();
                    break;
                case 2:
                    mostrarListaEgresos();
                    break;
                case 3:
                    mostrarListaClientesProveedores();
                    break;
                case 4:
                    System.out.println("Volviendo al Dashboard...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 4);
    }

    private void mostrarListaIngresos() {
        System.out.println("========== LISTA DE INGRESOS ==========");
        if (ingresos.isEmpty()) {
            System.out.println("No hay ingresos registrados.");
        } else {
            for (String ingreso : ingresos) {
                System.out.println(ingreso);
            }
        }
    }

    private void mostrarListaEgresos() {
        System.out.println("========== LISTA DE EGRESOS ==========");
        if (egresos.isEmpty()) {
            System.out.println("No hay egresos registrados.");
        } else {
            for (String egreso : egresos) {
                System.out.println(egreso);
            }
        }
    }

    private void mostrarListaClientesProveedores() {
        System.out.println("========== LISTA DE CLIENTES/PROVEEDORES ==========");
        if (clientesProveedores.isEmpty()) {
            System.out.println("No hay clientes/proveedores registrados.");
        } else {
            for (String clienteProveedor : clientesProveedores) {
                System.out.println(clienteProveedor);
            }
        }
    }
}
