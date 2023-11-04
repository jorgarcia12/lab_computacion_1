import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();
        int n ;
        int i = 0;
        while (i<5){
            System.out.println("Ingrese un numero para ingresar al arraylist: ");
            n = sc.nextInt();
            numeros.add(n);
            i++;
        }
        for (Integer num: numeros){
            System.out.print("||"+num+"||");
        }
    }
}
