import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra para saber si es mayuscula:  ");
        char a = scanner.next().charAt(0);
        String msg = Character.isUpperCase(a) ? "Es mayuscula" : "No es mayuscula";
        System.out.print(msg);
    }
}
