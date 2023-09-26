import java.util.Scanner;
public class repaso_parcial_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 cifras para saber si es capicua: ");
        int n = scanner.nextInt();
        if (n>99 && n<1000){
            if (n % 10 == n/100){
                System.out.println("El numero es capicua");
            }else{
                System.out.println("El numero no es capicua");
            }
        }else {
            System.out.println("Error, Ingrese un numero de 3 cifras");
        }
    }
}
