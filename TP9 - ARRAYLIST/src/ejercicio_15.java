import java.util.ArrayList;

public class ejercicio_15 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(14);
        numeros.add(22);
        numeros.add(345);
        numeros.add(41);
        numeros.add(50);
        numeros.add(5);
        numeros.add(15);
        numeros.add(3);

        int suma = 0;
        for (Integer num: numeros) {
            suma = suma +num;
        }
        System.out.println("La suma de todos los elementos del arreglo es: "+suma);
    }
}
