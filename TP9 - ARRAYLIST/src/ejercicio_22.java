import java.util.ArrayList;
import java.util.Collections;
public class ejercicio_22 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(16);
        numeros.add(13);
        numeros.add(12);
        numeros.add(100);

        System.out.println("Arreglo sin ordenar: ");
        for (int num: numeros) {
            System.out.println(num);
        }
        System.out.println("Arreglo ordenado:");
        Collections.sort(numeros);
        for (int num: numeros) {
            System.out.println(num);
        }
    }
}
