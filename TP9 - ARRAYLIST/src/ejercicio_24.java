import java.util.ArrayList;

public class ejercicio_24 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(14);
        numeros.add(14);
        numeros.add(35);
        numeros.add(14);
        numeros.add(14);
        numeros.add(54);
        numeros.add(45);
        numeros.add(5);

        int numL = 14;
        int apariciones = 0;

        for (int num: numeros) {
            if (num==numL){
                apariciones++;
            }
        }
        System.out.println("El numero "+numL+" aparecio "+apariciones+" en el arreglo");
    }
}
