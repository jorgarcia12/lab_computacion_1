import java.util.Scanner;
public class ejercicio_25_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para contar desde el hasta 1: ");
        int n = scanner.nextInt();
        for (int i = n;i > 0; i--){
            System.out.println(i);
        }
    }
}