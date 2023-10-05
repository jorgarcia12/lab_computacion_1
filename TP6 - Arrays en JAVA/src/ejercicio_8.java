import java.util.Scanner;
public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nombres;
        nombres = new String[5];
        int [] sueldo;
        sueldo = new int[5];
        int mayor_sueldo = 0;
        String nombre = "";

        for (int i=0 ; i<nombres.length ; i++){
            System.out.println("Ingrese el nombre del empleado: ");
            nombres[i] = sc.nextLine();

        }
        for (int j=0; j< nombres.length ; j++) {
            System.out.println("Ingrese el sueldo del empleado en posicion: " + j);
            sueldo[j] = sc.nextInt();

            if (sueldo[j] > mayor_sueldo) {
                nombre = nombres[j];
                mayor_sueldo = sueldo[j];
            }
        }
        System.out.println("El sueldo mas grande es de "+mayor_sueldo+" y lo cobra "+nombre);
    }
}

