import java.util.Scanner;
public class ejercicio_24_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para contar hasta el: ");
        int n = scanner.nextInt();
        int i = 0;
        while (i<n){
            i=i+1;
            System.out.println("numero: "+i);

        }
    }
}
