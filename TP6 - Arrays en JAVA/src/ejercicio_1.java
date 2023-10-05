import java.util.Scanner;
public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prom = 0;
        int[] media;
        media = new int[10];
        for (int i = 0;i< media.length;i++){
            System.out.println("Ingrese un numero en la posicion "+ i);
            media[i]= sc.nextInt();
        }
        for (int i = 0;i< media.length;i++){
            prom = prom + media[i];
        }
        System.out.println("La media de los numeros ingresados es de: "+prom/ media.length);
    }
}