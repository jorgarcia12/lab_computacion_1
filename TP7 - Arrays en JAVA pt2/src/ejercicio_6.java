import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class ejercicio_6 {
    public static void main(String[] args) {
        String [] palabras;
        palabras = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<palabras.length ; i++){
            System.out.print("Ingrese una palabra para guardarla en el arreglo: ");
            palabras[i]= sc.nextLine();
        }
        System.out.println("Palabras ordenadas en orden alfabetico inverso: ");
        Arrays.sort(palabras, Collections.reverseOrder());
        for (int j=0 ; j< palabras.length ; j++){
            System.out.print(" |["+palabras[j]+"]| ");
        }
    }
}