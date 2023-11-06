import java.util.ArrayList;
import java.util.Scanner;

public class EquipoDeFutbolMAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EquipoDeFutbol> jugadores = new ArrayList<>();
        int op = 0;

        do {
            System.out.println("(1) Agregar jugadores (2) Eliminar Jugadores (3) Listar los jugadores: ");
            op = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del jugador:");
                    String nombre = sc.nextLine();
                    EquipoDeFutbol jugador = new EquipoDeFutbol(nombre);
                    jugadores.add(jugador);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del jugador para borrarlo del plantel:");
                    String nombreEliminar = sc.nextLine();
                    boolean jugadorEncontrado = false;

                    // Itera sobre la lista de jugadores para buscar al jugador a eliminar
                    for (EquipoDeFutbol jugadorActual : jugadores) {
                        if (jugadorActual.getNombre_jugador().equals(nombreEliminar)) {
                            jugadores.remove(jugadorActual);
                            jugadorEncontrado = true;
                            System.out.println("Jugador eliminado.");
                            break;
                        }
                    }

                    if (!jugadorEncontrado) {
                        System.out.println("El jugador no existe en el plantel.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (op != 3);

        System.out.println("La lista del plantel quedó así:");
        for (EquipoDeFutbol jugador : jugadores) {
            System.out.println(jugador.getNombre_jugador());
        }
    }
}
