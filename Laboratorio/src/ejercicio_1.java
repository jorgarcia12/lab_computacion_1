import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para saber si es par o impar: ");
        int n = scanner.nextInt();
        String msg = ((n % 2) == 0) ? "Es par" : "Es impar";
        System.out.print("El numero " +n+" "+msg);
    }
}


