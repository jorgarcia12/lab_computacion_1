import java.util.Scanner;
public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arreglo;
        arreglo = new int[10];
        int c;
        for (int h=0 ; h<arreglo.length ; h++ ){
            System.out.println("Ingrese numeros al arreglo: ");
            arreglo[h] = sc.nextInt();
        }
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j + 1] < arreglo[j]) {
                    c = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = c;
                }
            }
        }
        System.out.println("Arreglo ordenado:");
        for (int k=0 ; k<arreglo.length ; k++ ){
            System.out.print(" |["+arreglo[k]+"]| ");
        }
    }
}
