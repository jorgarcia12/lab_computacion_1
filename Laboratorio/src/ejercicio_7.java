import java.util.Scanner;
public class ejercicio_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para saber si es multiplo de 3 y de 5: ");
        int a = scanner.nextInt();
        if(a % 3 == 0 && a % 5 == 0){
            System.out.print(a+" es multiplo de 3 y 5");
        } else if (a % 3 == 0) {
            System.out.print(a+" es multiplo de 3");
        } else if (a % 5 == 0) {
            System.out.print(a+" es multiplo de 5");
        }else{
            System.out.print(a+" no es multiplo de ninguno de los 2");
        }
    }
}

