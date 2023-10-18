import java.util.Scanner;
public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers= {1,4,2,6,4,12,34,10};
        System.out.println("Arreglo original: ");
        for(int i=0 ; i< numbers.length ; i++){
            System.out.print(" |["+numbers[i]+"]| ");
        }
        System.out.println(" ");

        int n = numbers.length;
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int temp = numbers[i];
                int j;
                for (j = i; j >= intervalo && numbers[j - intervalo] > temp; j -= intervalo) {
                    numbers[j] = numbers[j - intervalo];
                }
                numbers[j] = temp;
            }
        }
        System.out.println("Arreglo ordenado por metodo shell: ");
        for (int num : numbers) {
            System.out.print(" |["+num + "]| ");
        }
        System.out.println();
    }
}

