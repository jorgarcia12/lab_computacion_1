import java.util.ArrayList;
public class ejercicio_19 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(14);
        numeros.add(22);
        numeros.add(45);
        numeros.add(21);
        numeros.add(41);
        numeros.add(5);
        numeros.add(35);
        numeros.add(50);

        int num = 5;
        int i = 0;
        for (i=0 ; i<numeros.size(); i++) {
            if (numeros.get(i)==num){
                break;
            }
        }
        System.out.println("El numero "+num+" se encuentra en la posicion "+i);
    }
}
