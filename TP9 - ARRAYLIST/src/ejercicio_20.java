import java.util.ArrayList;

public class ejercicio_20 {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("Hola");
        cadenas.add("buenas");
        cadenas.add("noches,");
        cadenas.add("como");
        cadenas.add("estan?");

        String masLargo = cadenas.get(0);

        for (String cad: cadenas) {
            if (cad.length()>masLargo.length()){
                masLargo=cad;
            }
        }
        System.out.println("El elemento mas largo es: "+masLargo);
    }
}
