import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int menor, pos, tmp;
        int [] arreglo;
        arreglo = new int[10];
        for (int h=0 ; h<arreglo.length ; h++ ) {
            System.out.println("Ingrese numeros al arreglo: ");
            arreglo[h] = sc.nextInt();
        }
            for (int i = 0; i < arreglo.length - 1; i++) {
                menor = arreglo[i];
                pos = i;
                for (int j = i + 1; j < arreglo.length; j++){
                    if (arreglo[j] < menor) {
                        menor = arreglo[j];
                        pos = j;
                    }
                }
                if (pos != i){
                    tmp = arreglo[i];
                    arreglo[i] = arreglo[pos];
                    arreglo[pos] = tmp;
                }
            }
        System.out.println("Arreglo ordenado:");
        for (int k=0 ; k<arreglo.length ; k++ ){
            System.out.print(" |["+arreglo[k]+"]| ");
        }
    }
}
