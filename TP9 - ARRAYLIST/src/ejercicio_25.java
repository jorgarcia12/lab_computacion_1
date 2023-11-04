import java.util.ArrayList;
import java.util.Collections;
public class ejercicio_25 {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("dias");
        cadenas.add("buenas");
        cadenas.add("noches");
        cadenas.add("tardes");
        cadenas.add("estancia");

        System.out.println("Lista sin ordenar:");
        for (String cad: cadenas) {
            System.out.println(cad);
        }
        System.out.println("Lista ordenada alfabeticamente: ");

        Collections.sort(cadenas);

        for (String cad: cadenas) {
            System.out.println(cad);
        }
    }
}
