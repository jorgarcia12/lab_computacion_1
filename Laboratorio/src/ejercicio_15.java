import java.util.Scanner;
public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese una hora: ");
         int H = scanner.nextInt();
        System.out.println("Ingrese unos minutos: ");
        int M = scanner.nextInt();
        System.out.println("Ingrese los segundos: ");
        int S = scanner.nextInt();
        if (H < 24 && H >= 0 &&  M < 60 && M >= 0 && S < 60 && S >= 0){
            System.out.println("La hora ingresada es correcta, son las "+H+":"+M+":"+S);
        }else {
            System.out.println("Hora invalida, pruebe de nuevo");
        }
    }
}
