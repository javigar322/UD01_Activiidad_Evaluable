package java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author javier garcia
 * Clase principal que gestiona la aplicación de reserva de libros en la biblioteca.
 */
public class Main {
    private static List<Libro> listaLibros = new ArrayList<>();
    private static List<Reserva> listaReservas = new ArrayList<>();

    /**
     * Método principal que inicia la aplicación de reserva de libros.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        cargarDatosIniciales();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Biblioteca de Reservas de Libros");
            System.out.println("1. Listar Libros");
            System.out.println("2. Crear Reserva");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Listar Reservas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    listarLibros();
                    break;
                case 2:
                    crearReserva(scanner);
                    break;
                case 3:
                    cancelarReserva(scanner);
                    break;
                case 4:
                    listarReservas();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar la aplicación!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    /**
     * Carga datos iniciales de libros y reservas para pruebas.
     */
    private static void cargarDatosIniciales() {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307350482", EstadoLibro.DISPONIBLE);
        Libro libro2 = new Libro("1984", "George Orwell", "978-0451524935", EstadoLibro.DISPONIBLE);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8420412146", EstadoLibro.DISPONIBLE);

        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
    }

    /**
     * Muestra una lista de todos los libros disponibles y reservados.
     */
    private static void listarLibros() {
        System.out.println("Lista de Libros:");
        for (Libro libro : listaLibros) {
            System.out.println(libro.toString());
        }
    }

    /**
     * Permite a un usuario reservar un libro si está disponible.
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     */
    private static void crearReserva(Scanner scanner) {
        // Implementa la lógica para crear una reserva aquí
    }

    /**
     * Permite a un usuario cancelar una reserva que haya hecho.
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     */
    private static void cancelarReserva(Scanner scanner) {
        // Implementa la lógica para cancelar una reserva aquí
    }

    /**
     * Muestra una lista de todas las reservas activas, con detalles del libro y del usuario.
     */
    private static void listarReservas() {
        System.out.println("Lista de Reservas:");
        for (Reserva reserva : listaReservas) {
            System.out.println(reserva.toString());
        }
    }



}