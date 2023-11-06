import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double min = 10000.00;
        double max = 0.0;
        int vueltas = 0;
        while (vueltas < 20) {
            System.out.println("Ingrese un número: ");
            double num = sc.nextDouble();
            numeros.add(num);
            vueltas++;

            if (vueltas == 20) {
                break;
            }
        }
        System.out.println("Los numeros ingresados fueron: ");
        for (double num:numeros) {
            System.out.print("|"+num+"|");
        }
        System.out.println(" ");
        for (double num: numeros) {
            if (num<min){
                min=num;
            }
        }
        System.out.println("El numero minimo Ingresado fue: "+min);

        for (double num: numeros) {
            if (num>max){
                max=num;
            }
        }
        System.out.println("El numero mayor Ingresado fue: "+max);
    }
}
