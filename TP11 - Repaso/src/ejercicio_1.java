import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Marcas_de_autos = new ArrayList<>();
        String marcas = "0";
        do {
            System.out.println("Ingrese una marca de autos, para finalizar ingrese 1: ");
            marcas = sc.nextLine();
            if (!Objects.equals(marcas, "1")) {
                Marcas_de_autos.add(marcas);
            } else {
                break;
            }
        }while (marcas!="1");
        System.out.println("Lista de marcas de autos");
        for (String marca: Marcas_de_autos) {
            System.out.println(marca);
        }
    }
}
