import java.util.ArrayList;

public class ejercicio_7 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(0);
        int max = 0;
        for (Integer n: numeros) {
            if (n>max){
                max=n;
            }
        }
        System.out.println("El numero mas alto del Arraylist es: "+max);
    }
}
