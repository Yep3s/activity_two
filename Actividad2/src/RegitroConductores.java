
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RegitroConductores {

    private static Map<Integer, Conductor> conductores = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Registrar conductor");
            System.out.println("2. Asignar vehículo a conductor");
            System.out.println("3. Ver vehículos de un conductor");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarConductor(scanner);
                    break;
                case 2:
                    asignarVehiculoAConductor(scanner);
                    break;
                case 3:
                    verVehiculosDeConductor(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

    }

  private static void registrarConductor(Scanner scanner) {
    System.out.print("Ingrese el nombre del conductor: ");
    scanner.nextLine(); // Limpiar el buffer del scanner
    String nombre = scanner.nextLine();
    System.out.print("Ingrese la cédula del conductor: ");
    int cedula = scanner.nextInt();
    System.out.print("Ingrese la edad del conductor: ");
    int edad = scanner.nextInt();

    Conductor conductor = new Conductor(nombre, cedula, edad);
    conductores.put(cedula, conductor);

    System.out.println("Conductor registrado exitosamente: " + conductor);
}

    private static void asignarVehiculoAConductor(Scanner scanner) {
        System.out.print("Ingrese la cédula del conductor: ");
        int cedula = scanner.nextInt();

        if (conductores.containsKey(cedula)) {
            Conductor conductor = conductores.get(cedula);

            System.out.print("Ingrese la placa del vehículo: ");
            String placa = scanner.next();
            System.out.print("Ingrese el tipo de vehículo (automóvil/camión): ");
            String tipo = scanner.next();

            Vehiculo vehiculo = new Vehiculo(placa, tipo);
            conductor.agregarVehiculo(vehiculo);

            System.out.println("Vehículo asignado al conductor exitosamente.");
        } else {
            System.out.println("No se encontró ningún conductor con esa cédula.");
        }
    }

    private static void verVehiculosDeConductor(Scanner scanner) {
        System.out.print("Ingrese la cédula del conductor: ");
        int cedula = scanner.nextInt();

        if (conductores.containsKey(cedula)) {
            Conductor conductor = conductores.get(cedula);
            List<Vehiculo> vehiculos = conductor.getVehiculos();

            if (vehiculos.isEmpty()) {
                System.out.println("El conductor no tiene asignado ningún vehículo.");
            } else {
                System.out.println("Vehículos asignados al conductor:");
                for (Vehiculo vehiculo : vehiculos) {
                    System.out.println(vehiculo);
                }
            }
        } else {
            System.out.println("No se encontró ningún conductor con esa cédula.");
        }
    }
    
    
}
