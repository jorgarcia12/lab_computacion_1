import java.util.ArrayList;

public class ejercicio_18 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(14);
        numeros.add(22);
        numeros.add(345);
        numeros.add(22);
        numeros.add(14);
        numeros.add(5);
        numeros.add(345);
        numeros.add(5);

        int suma_pares = 0;

        for (int i=0 ; i<numeros.size(); i++) {
            if(i%2==0){
                suma_pares = suma_pares + numeros.get(i);
            }
        }
        System.out.println("La suma de los numeros en indice par es: "+suma_pares);
    }
}
