import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario extends CuentaUsuario {
    private List<Usuario> usuariosRegistrados;
    private Scanner scanner;

    public Usuario(String nombre, String contraseña) {
        super(nombre, contraseña);
        usuariosRegistrados = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        int opcion;
        do {
            System.out.println(" ===================");
            System.out.println("Ministerio de Salud");
            System.out.println("    Bienvenido");
            System.out.println(" ===================");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Borrar Cuentas");
            System.out.println("4. Salir");
            System.out.print("==================: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrar();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    borrarCuentas();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (opcion != 4);
    }

    private void registrar() {
        System.out.println("Registrando una cuenta...");

        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(nombreUsuario, contraseña);
        usuariosRegistrados.add(nuevoUsuario);

        System.out.println("¡Registro exitoso!");
    }

    private void iniciarSesion() {
        System.out.println("Cargando...");

        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        boolean usuarioEncontrado = false;
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                usuarioEncontrado = true;
                if (usuario.getContraseña().equals(contraseña)) {
                    System.out.println("Inicio de sesión exitoso");
                } else {
                    System.out.println("Error al escribir usuario/contraseña");
                }
                break;
            }
        }

        if (!usuarioEncontrado) {
            System.out.println("Usuario no registrado");
        }
    }

    private void borrarCuentas() {
        System.out.println("Cargando Menu");

        if (usuariosRegistrados.isEmpty()) {
            System.out.println("No hay cuentas registradas para borrar.");
            return;
        }

        System.out.println("Cuentas registradas:");
        for (int i = 0; i < usuariosRegistrados.size(); i++) {
            Usuario usuario = usuariosRegistrados.get(i);
            System.out.println((i + 1) + ". " + usuario.getNombre());
        }

        System.out.print("Seleccione el número de cuenta que desea borrar: ");
        int seleccion = scanner.nextInt();
        scanner.nextLine();

        if (seleccion < 1 || seleccion > usuariosRegistrados.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Usuario usuarioBorrado = usuariosRegistrados.remove(seleccion - 1);
        System.out.println("Se ha borrado la cuenta de usuario: " + usuarioBorrado.getNombre());
    }
}

