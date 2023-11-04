import java.util.ArrayList;
public class ejercicio_21 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(16);
        numeros.add(13);
        numeros.add(12);
        numeros.add(100);

        int suma = 0;

        for (int num: numeros) {
            suma=+num;
        }
        int prom = suma/numeros.size();

        System.out.println("El promedio del arreglo es: "+prom);
    }
}
