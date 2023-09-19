import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese otro numero para ver si es igual al anterior");
        int b = scanner.nextInt();
        String msg = (a==b) ? "Son iguales" : "Son distintos";
        System.out.println(msg);
    }
}
