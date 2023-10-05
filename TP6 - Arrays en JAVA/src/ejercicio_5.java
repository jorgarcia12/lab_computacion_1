import java.util.Scanner;
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int [] numeros;
        numeros = new int [10];
        for (int i=0 ; i< numeros.length ; i++){
            int pos = i+1;
            System.out.println("Ingrese un numero para la posicion "+pos);
            numeros[i]= sc.nextInt();
        }
        for (int j=0 ; j< numeros.length ; j++){
            if (numeros[j]>0) {
                positivos=positivos+1;
            } else if (numeros[j]<0) {
                negativos = negativos+1;
            } else {
                ceros = ceros + 1;
            }
        }
        System.out.println("Se ingresaron "+positivos+" numeros positivos, "+negativos+" numeros negativos y "+ceros+" numeros ceros");
    }
}
