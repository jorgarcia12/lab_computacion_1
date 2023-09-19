import java.util.Scanner;
public class ejercicio_25_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para contar desde el hasta 1: ");
        int n = scanner.nextInt();

        while (n != 0){
            System.out.println(n);
            n--;
        }
    }
}
