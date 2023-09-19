import java.util.Scanner;
public class ejercicio_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para saber si multiplo de 2 o de 3: ");
        int a = scanner.nextInt();
        if (a % 2 == 0){
            System.out.print("Es multiplo de 2");
        } else if (a % 3 == 0) {
            System.out.print("Es multiplo de 3");
        } else {
            System.out.print("No es multiplo de ninguno");
        }
    }
}
