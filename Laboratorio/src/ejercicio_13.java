import java.util.Scanner;
public class ejercicio_13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año para comprobar si es bisiesto: ");
        int a = scanner.nextInt();
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
            System.out.print("Es bisiesto");
        }else {
            System.out.print("No es bisiesto");
        }
    }
}
