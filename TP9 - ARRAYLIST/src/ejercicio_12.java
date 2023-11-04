import java.util.ArrayList;
public class ejercicio_12 {
    public static void main(String[] args) {
        ArrayList <String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("java");
        palabras.add("dias");
        palabras.add("tardes");
        palabras.add("buenas");
        palabras.add("adios");

        String buscar = "tardes";
        int indice = palabras.indexOf(buscar);

        System.out.println("La palabra '"+buscar+"' se encuentra en la posicion "+indice );


    }
}
