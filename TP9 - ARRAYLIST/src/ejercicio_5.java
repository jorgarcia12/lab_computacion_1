import java.util.ArrayList;

public class ejercicio_5 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Matias");

        for (String n:nombres) {
            System.out.println("||"+n+"||");
        }
        System.out.println(" ");
        nombres.remove("Juan");
        for (String n:nombres) {
            System.out.println("||"+n+"||");
        }
    }
}
