import java.util.ArrayList;

public class ejercicio_8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(0);
        ArrayList<Integer> numeros2 = new ArrayList<>();
        if (numeros2.isEmpty()){
            for (Integer num: numeros) {
                numeros2.add(num);
            }
        }
        System.out.println("Arreglo 1");
        for (Integer num1: numeros) {
            System.out.println(num1);
        }
        System.out.println("Arreglo 2");
        for (Integer num2: numeros2) {
            System.out.println(num2);
        }
    }
}
