import java.util.ArrayList;

public class ejercicio_10 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(10);
        numeros2.add(20);
        numeros2.add(30);
        numeros2.add(40);
        numeros2.add(50);
        System.out.println("Array Original: ");
        for (Integer num: numeros) {
            System.out.println(num);
        }
        System.out.println("Array combinado:");
        for (Integer num: numeros) {
            numeros2.add(num);
        }
        for (Integer num1: numeros2) {
            System.out.println(num1);
        }
    }
}
