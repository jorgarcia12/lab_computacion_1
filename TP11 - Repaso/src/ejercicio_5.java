import java.util.ArrayList;
import java.util.Random;

public class ejercicio_5 {
    public static void main(String[] args) {
        Random n = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        int vueltas = 0;
        int suma = 0;
        double prom;

        while (vueltas < 20) {
            int num = n.nextInt(1000) + 1;
            numeros.add(num);
            suma += num;
            vueltas++;
        }

        prom = (double) suma / numeros.size();
        System.out.println("El promedio de los números ingresados es: " + prom);

        int prom_mas = 0;
        int prom_menos = 0;
        int prom_igual = 0;

        for (int cont : numeros) {
            if (cont > prom) {
                prom_mas++;
            } else if (cont < prom) {
                prom_menos++;
            } else {
                prom_igual++;
            }
        }

        System.out.println("Hubo " + prom_mas + " números mayores al promedio.");
        System.out.println("Hubo " + prom_menos + " números menores al promedio.");
        System.out.println("Hubo " + prom_igual + " números iguales al promedio.");
    }
}
