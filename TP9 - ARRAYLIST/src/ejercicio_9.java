import java.util.ArrayList;
import java.util.Collections;
public class ejercicio_9 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println("array original");
        for (Integer num: numeros) {
            System.out.println(num);
        }
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("array invertido");

            for (Integer num: numeros) {
                System.out.println(num);
            }
    }
}
