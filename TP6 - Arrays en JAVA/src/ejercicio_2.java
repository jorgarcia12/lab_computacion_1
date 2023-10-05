import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prom = 0;
        int[] numeros;
        numeros = new int[10];
        for (int i=0 ; i<numeros.length ; i++){
            System.out.println("Ingrese un numero para la posicion "+i);
            numeros[i] = sc.nextInt();
        }
        for (int j=0 ; j<numeros.length ; j++){
            if (j % 2 == 0){
                prom = prom + numeros[j];
            }
        }
        System.out.println("La media de los numeros pares es de: "+ prom/5);
    }
}
