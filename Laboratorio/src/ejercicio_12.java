import java.util.Scanner;
public class ejercicio_12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese un numero: ");
        int b = scanner.nextInt();
        if (b==0){
            System.out.print("El divisor no puede ser cero");
        }else{
            System.out.print("El resultado de al division es: " + a/b);
        }
    }
}
