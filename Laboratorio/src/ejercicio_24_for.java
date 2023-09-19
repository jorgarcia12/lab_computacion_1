import java.util.Scanner;
public class ejercicio_24_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para contar desde 1 hasta el: ");
        int n = scanner.nextInt();
        for (int i = 1;i <= n; i++){
            System.out.println(i);
        }
    }
}
