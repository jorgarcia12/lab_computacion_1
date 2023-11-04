import java.util.ArrayList;

public class ejercicio_13 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        ArrayList<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        numeros1.add(4);
        numeros1.add(5);

        boolean sonIguales = true;

        if (numeros.size() != numeros1.size()) {
            sonIguales = false;
        } else {
            for (int i = 0; i < numeros.size(); i++) {
                if (!numeros.get(i).equals(numeros1.get(i))) {
                    sonIguales = false;
                    break;
                }
            }
        }

        if (sonIguales) {
            System.out.println("Los ArrayLists son iguales.");
        } else {
            System.out.println("Los ArrayLists no son iguales.");
        }
    }
}
