import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
public class ejercicio_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese un numero: ");
        int b = scanner.nextInt();
        if (a%10 == b%10){
            System.out.print("Las ultimas cifras son iguales");
        }else {
            System.out.print("Las ultimas cifras son distintas");
        }
    }
}
