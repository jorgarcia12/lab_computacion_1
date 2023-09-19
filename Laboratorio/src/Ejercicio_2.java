import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para saber si es multiplo de 10");
        int n = scanner.nextInt();
        String msg = ((n % 10) == 0) ? "Es multiplo de 10" : "No es multiplo de 10";
        System.out.print(msg);
    }
}
