import java.util.Scanner;
public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros;
        numeros = new int [10];
        int negativos = 0;
        int cont_neg = 0;
        int positivos = 0;
        int cont_pos = 0;
        for (int i=0 ; i<numeros.length ; i++){
            System.out.println("Ingrese un numero positivo o negativo: ");
            numeros[i] = sc.nextInt();
        }
        for (int j=0 ; j<numeros.length ; j++){
            if (numeros[j]<0){
                negativos = negativos + numeros[j];
                cont_neg++;
            } else if (numeros[j]>0) {
                positivos = positivos + numeros[j];
                cont_pos++;
            }
        }
        System.out.println("Usted ingreso "+cont_pos+" numeros positivos y la media de estos es de: "+positivos/cont_pos);
        System.out.println("Usted ingreso "+cont_neg+" numeros negativos y la media de estos es de: "+negativos/cont_neg);
    }
}
