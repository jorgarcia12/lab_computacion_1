import java.util.ArrayList;
public class ejercicio_16 {
    public static void main(String[] args) {
        ArrayList <String> cadenas = new ArrayList<>();

        cadenas.add("Hola ");
        cadenas.add("buenas ");
        cadenas.add("noches, ");
        cadenas.add("como ");
        cadenas.add("estan?");

        String frase = "";

        for (String cad: cadenas) {
            frase += cad;
        }
        System.out.println(frase);
    }
}
