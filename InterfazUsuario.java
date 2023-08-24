import java.util.Scanner;

public class InterfazUsuario {
    private Hotel hotel;

    public InterfazUsuario(Hotel hotel) {
        this.hotel = hotel;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Agregar cliente a lista de espera");
            System.out.println("2. Mostrar lista de espera");
            System.out.println("3. Asignar cliente a habitación");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombreCliente = scanner.nextLine();
                    Cliente nuevoCliente = new Cliente(nombreCliente, 0);
                    hotel.agregarClienteListaEspera(nuevoCliente);
                    break;
                case 2:
                    hotel.mostrarListaEspera();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombreClienteAsignar = scanner.nextLine();
                    Cliente clienteAsignar = new Cliente(nombreClienteAsignar, 0);
                    System.out.println("Ingrese el tipo de habitación (ESTANDAR/DELUXE/SUITE):");
                    String tipoHabitacionStr = scanner.nextLine();
                    TipoHabitacion tipoHabitacion = TipoHabitacion.valueOf(tipoHabitacionStr.toUpperCase());
                    hotel.asignarClienteHabitacion(clienteAsignar, tipoHabitacion);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, ingrese nuevamente.");
                    break;
            }
        }

        System.out.println("Gracias por usar el sistema de gestión de reservas de Hotel");
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de gestión de reservas de Hotel");
        System.out.println("Ingrese el número de habitaciones disponibles:");
        int numHabitaciones = new Scanner(System.in).nextInt();
        Hotel hotel = new Hotel(numHabitaciones);
        InterfazUsuario interfazUsuario = new InterfazUsuario(hotel);
        interfazUsuario.mostrarMenu();
    }
}
