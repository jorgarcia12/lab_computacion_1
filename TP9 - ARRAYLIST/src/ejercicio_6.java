import java.util.ArrayList;

public class ejercicio_6 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(0);
        if (numeros.isEmpty()){
            System.out.println("El array esta vacio");
        }else {
            System.out.println("El array no esta vacio, tiene "+numeros.size()+" elementos");
        }
    }
}
