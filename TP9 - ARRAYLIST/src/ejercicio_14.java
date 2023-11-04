import java.util.ArrayList;

public class ejercicio_14 {
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
        int min = 1000;
        for (Integer num: numeros) {
            if (num<min){
                min=num;
            }
        }
        System.out.println("El numero mas chico es: "+min);
    }
}
