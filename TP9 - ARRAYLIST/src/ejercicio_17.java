import javax.xml.transform.sax.SAXSource;
import java.util.ArrayList;
public class ejercicio_17 {
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
        System.out.println("Lista original: ");
        for (int num: numeros) {
            System.out.println(num);
        }
        for (int i = 0 ;i< numeros.size() ; i++){
            for (int j = i+1; j< numeros.size() ; j++){
                if (numeros.get(i).equals(numeros.get(j))){
                    numeros.remove(j);
                }
            }
        }
        System.out.println("Lista sin repeticiones: ");

        for (int num: numeros) {
            System.out.println(num);
        }
    }
}

