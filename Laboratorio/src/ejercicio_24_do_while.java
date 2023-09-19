import java.util.Scanner;
public class ejercicio_24_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para contar hasta el: ");
        int n = scanner.nextInt();
        int i = 0;
        do{
            i=i+1;
            System.out.println("numero: "+i);

        }while (i<n);
    }
}
