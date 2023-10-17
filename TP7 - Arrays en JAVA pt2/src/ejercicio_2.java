import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] array = new Integer[10];
        for (int i=0 ; i< array.length ; i++){
            System.out.println("Ingrese numeros en el arreglo para ordenarlos de mayor a menor: ");
            array[i]= sc.nextInt();
        }
        System.out.println("Arreglo sin ordenar");
        for (int j=0 ; j< array.length ; j++){
            System.out.print(" |["+array[j]+"]| ");
        }
        System.out.println(" ");
        System.out.println("Arreglo ordenado");
        Arrays.sort(array, Collections.reverseOrder());
        for (int h=0 ; h< array.length ; h++){
            System.out.print(" |["+array[h]+"]| ");
        }
    }
}