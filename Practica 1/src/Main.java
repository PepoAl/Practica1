import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree<String, Automovil> bst = new BinarySearchTree<>(new PlacaComparator());

        System.out.println("Bienvenido al sistema de gestión de automóviles.");

        // Loop para ingresar automóviles hasta que el usuario escriba "SALIR"
        while (true) {
            System.out.println("Ingrese la información del automóvil (Marca, Modelo, Línea, Precio, Placa):");
            System.out.print("Marca: ");
            String marca = scanner.next();
            if (marca.equalsIgnoreCase("SALIR")) break;
            System.out.print("Modelo: ");
            String modelo = scanner.next();
            System.out.print("Línea: ");
            String linea = scanner.next();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Placa: ");
            String placa = scanner.next();

            Automovil automovil = new Automovil(marca, modelo, linea, precio, placa);
            bst.insert(placa, automovil);
        }

        // Buscar automóviles por placa
        while (true) {
            System.out.println("\nIngrese la placa del automóvil que desea buscar (o escriba 'SALIR' para salir):");
            String placaBuscar = scanner.next();
            if (placaBuscar.equalsIgnoreCase("SALIR")) break;

            Automovil automovilEncontrado = bst.find(placaBuscar);
            if (automovilEncontrado != null) {
                System.out.println("Automóvil encontrado:");
                System.out.println("Marca: " + automovilEncontrado.getMarca());
                System.out.println("Modelo: " + automovilEncontrado.getModelo());
                System.out.println("Línea: " + automovilEncontrado.getLinea());
                System.out.println("Precio: " + automovilEncontrado.getPrecio());
                System.out.println("Placa: " + automovilEncontrado.getPlaca());
            } else {
                System.out.println("El automóvil con la placa '" + placaBuscar + "' no existe.");
            }
        }

        System.out.println("¡Hasta luego!");
    }
}
