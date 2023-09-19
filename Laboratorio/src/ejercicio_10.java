import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un caracter: ");
        char a = scanner.next().charAt(0);
        System.out.print("Ingresa un caracter: ");
        char b = scanner.next().charAt(0);
        if (Character.isLowerCase(a) && Character.isLowerCase(b)){
            System.out.print("ambos caracteres son minusculas");
        }else {
            System.out.print("Uno o ninguno de los dos son minusculas");
        }
    }
}
