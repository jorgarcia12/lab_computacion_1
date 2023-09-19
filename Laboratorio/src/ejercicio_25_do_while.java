import java.util.Scanner;
public class ejercicio_25_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para contar desde el hasta 1: ");
        int n = scanner.nextInt();
        do{
            System.out.println(n);
            n--;
        }while (n != 0);
    }
}
