import java.util.Scanner;
public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 Cifras para saber si es capicua: ");
        int a = scanner.nextInt();
        if (a % 10 == a/100){
            System.out.println("Es capicua");
        }else {
            System.out.println("No es capicua");
        }
    }
}
