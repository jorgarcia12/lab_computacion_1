import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;
public class ejercicio_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese otro numero: ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.print(n1 + " Es mayor");
        } else if (n2 > n1) {
            System.out.print(n2+" Es mayor");
        }else {
            System.out.print("Son iguales");
        }

    }
}
