import java.util.Scanner;
public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nota para concer su equivalente en nota alfabetica: ");
        int nota = scanner.nextInt();
        if (nota >= 0 || nota <= 10){
            if (nota >= 0 && nota < 5){
                System.out.println("Usted obtuvo un 'Insuficiente'");
            } else if (nota >= 5 && nota < 6) {
                System.out.println("Usted obtuvo un ''Suficiente");
            } else if (nota >= 6 && nota < 7) {
                System.out.println("Usted obtuvo un 'Bien'");
            } else if (nota >= 7 && nota < 9) {
                System.out.println("Usted obtuvo un ´Notable´");
            } else if (nota >=9 && nota <=10){
                System.out.println("Usted obtuvo un ´Sobresaliente´");
            }
        }else {
            System.out.println("Ingrese una nota valida");
        }
    }
}
