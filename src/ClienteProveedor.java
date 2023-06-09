import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteProveedor {
    private Scanner scanner;
    private Transaccion transaccion;
    private List<String> clientesProveedores;

    public ClienteProveedor(Transaccion transaccion) {
        scanner = new Scanner(System.in);
        this.transaccion = transaccion;
        clientesProveedores = new ArrayList<>();
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("========== CLIENTE/PROVEEDOR ==========");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Agregar Proveedor");
            System.out.println("3. Volver al Dashboard");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    agregarProveedor();
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

    private void agregarCliente() {
        System.out.println("Opción: Agregar Cliente");

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto o servicio: ");
        String nombreProductoServicio = scanner.nextLine();

        System.out.print("Ingrese el precio del producto o servicio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        String cliente = nombreCliente + " - " + nombreProductoServicio + " - Precio: " + precio;
        clientesProveedores.add(cliente);
        System.out.println("Cliente agregado correctamente.");
    }

    private void agregarProveedor() {
        System.out.println("Opción: Agregar Proveedor");

        System.out.print("Ingrese el nombre del proveedor: ");
        String nombreProveedor = scanner.nextLine();

        System.out.print("Ingrese el nombre del producto o servicio: ");
        String nombreProductoServicio = scanner.nextLine();

        System.out.print("Ingrese el precio del producto o servicio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        String proveedor = nombreProveedor + " - " + nombreProductoServicio + " - Precio: " + precio;
        clientesProveedores.add(proveedor);
        System.out.println("Proveedor agregado correctamente.");
    }

    public List<String> getClientesProveedores() {
        return clientesProveedores;
    }
}
