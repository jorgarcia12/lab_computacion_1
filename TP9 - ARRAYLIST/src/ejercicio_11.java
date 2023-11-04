import java.util.ArrayList;

public class ejercicio_11 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        System.out.println("Arreglo original");
        for (Integer numer: numeros
             ) {
            System.out.println(numer);
        }
        numeros.removeIf(num -> num % 2 == 0);
        System.out.println("Arreglo sin numeros pares: ");
        for (Integer numero: numeros) {
            System.out.println(numero);
        }
    }
}
