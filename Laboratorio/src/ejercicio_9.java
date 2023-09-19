import java.util.Scanner;
public class ejercicio_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Ingrese un caracter: ");
        char a = scanner.next().charAt(0);
        System.out.print ("Ingrese un caracter: ");
        char b = scanner.next().charAt(0);
        if (a==b){
            System.out.print("Los caracteres son iguales");
        }else {
            System.out.print("Los caracteres NO son iguales");
        }
    }
}
