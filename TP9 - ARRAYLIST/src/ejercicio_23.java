import java.util.ArrayList;


public class ejercicio_23 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(16);
        numeros.add(13);
        numeros.add(12);
        numeros.add(100);
        ArrayList<Integer> filtro = new ArrayList<>();
        int max = 15;
        System.out.println("Arreglo original:");

        for (int num: numeros) {
            System.out.println(num);
        }
        System.out.println("Numeros menores a "+max+" en el arreglo:");
        for (int num: numeros) {
            if (num<max){
                filtro.add(num);
            }

        }
        for (int num: filtro) {
            System.out.println(num);
        }
    }
}
