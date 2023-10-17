import java.util.Scanner;
public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arreglo;
        arreglo = new int[10];
        int j;
        int aux;

        for (int h=0 ; h<arreglo.length ; h++ ) {
            System.out.println("Ingrese numeros al arreglo: ");
            arreglo[h] = sc.nextInt();
        }
        
        for (int p = 1; p < arreglo.length; p++){
            aux = arreglo[p];
            j = p - 1;
            while (( j >= 0) && (aux < arreglo[j])){

                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
        System.out.println("Arreglo ordenado:");
        for (int k=0 ; k<arreglo.length ; k++ ){
            System.out.print(" |["+arreglo[k]+"]| ");
        }
    }
}
