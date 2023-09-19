import java.util.Scanner;
public class ejercicio_11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un caracter para saber si es un numero: ");
        char a = scanner.next().charAt(0);
        if (Character.isDigit(a)){
            System.out.print("Es un numero");
        }else {
            System.out.print("No es un numero");
        }
    }
}
