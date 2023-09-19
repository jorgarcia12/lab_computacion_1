import java.text.DecimalFormat;
import java.util.Scanner;
public class ejercicio_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double millas = 1;
        while (millas!=0){
            System.out.println("Ingrese una cantidad de millas para saber cuantos kilometros son: ");
            millas = scanner.nextDouble();
            double km = millas * 1.6093;
            System.out.println(millas+" millas, son: "+km+" kilometros");
        }
        System.out.println("programa terminado");
    }
}
