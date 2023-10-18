import java.util.Scanner;
import java.util.Random;
public class ejercicio_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menor, pos, tmp, c, aux, j, op, op_sort;
        int [] numbers;
        numbers = new int[20];
        System.out.println("LLENE EL ARRAY");
        for(int i = 0 ; i< numbers.length ; i++){
            System.out.println("Ingrese un numero: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("ARRAY");
        for (int i = 0 ; i< numbers.length ; i++){
            System.out.println(" |["+numbers[i]+"]| ");
        }
        do {
            System.out.println("De que manera desea ordenar el array? (1) ASCENDENTE (2) DESCENDENTE");
            op = sc.nextInt();
        }while (op!=1 && op!=2);

        if(op == 1){
            System.out.println("ASCENDENTE");
            do {
                System.out.println("Que metodo desea aplicar?  (1) Burbuja | (2) Insercion | (3) Seleccion ");
                op_sort = sc.nextInt();
            }while (op_sort != 1 && op_sort != 2 && op_sort !=3 );

            switch (op_sort){
                case 1:
                    System.out.println("Metodo burbuja");
                    for (int i = 0; i < numbers.length - 1; i++) {
                        for ( j = 0; j < numbers.length - i - 1; j++) {
                            if (numbers[j + 1] < numbers[j]) {
                                c = numbers[j + 1];
                                numbers[j + 1] = numbers[j];
                                numbers[j] = c;
                            }
                        }
                    }
                    System.out.println("Arreglo ordenado:");
                    for (int k=0 ; k<numbers.length ; k++ ){
                        System.out.print(" |["+numbers[k]+"]| ");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Metodo por insercion");
                    for (int p = 1; p < numbers.length; p++){
                        aux = numbers[p];
                        j = p - 1;
                        while (( j >= 0) && (aux < numbers[j])){

                            numbers[j + 1] = numbers[j];
                            j--;
                        }
                        numbers[j + 1] = aux;
                    }
                    System.out.println("Arreglo ordenado:");
                    for (int k=0 ; k<numbers.length ; k++ ){
                        System.out.print(" |["+numbers[k]+"]| ");
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Metodo por Seleccion");
                    for (int i = 0; i < numbers.length - 1; i++) {
                        menor = numbers[i];
                        pos = i;
                        for ( j = i + 1; j < numbers.length; j++){
                            if (numbers[j] < menor) {
                                menor = numbers[j];
                                pos = j;
                            }
                        }
                        if (pos != i){
                            tmp = numbers[i];
                            numbers[i] = numbers[pos];
                            numbers[pos] = tmp;
                        }
                    }
                    System.out.println("Arreglo ordenado:");
                    for (int k=0 ; k< numbers.length ; k++ ){
                        System.out.print(" |["+numbers[k]+"]| ");
                    }
                    System.out.println(" ");
                    break;
            }
        } else {
            System.out.println("DESCENDENTE");
            do {
                System.out.println("Que metodo desea aplicar?  (1) Burbuja | (2) Insercion | (3) Seleccion ");
                op_sort = sc.nextInt();
            }while (op_sort != 1 && op_sort != 2 && op_sort !=3 );
            switch (op_sort){
                case 1:
                    System.out.println("Metodo Burbuja");
                    int n = numbers.length;
                    for (int i = 0; i < n - 1; i++) {
                        for ( j = 0; j < n - i - 1; j++) {
                            if (numbers[j] < numbers[j + 1]) { // Cambiar '<' a '>' para orden descendente
                                int temp = numbers[j];
                                numbers[j] = numbers[j + 1];
                                numbers[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Arreglo ordenado:");
                    for (int k=0 ; k<numbers.length ; k++ ){
                        System.out.print(" |["+numbers[k]+"]| ");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Metodo Insercion");
                     n = numbers.length;
                    for (int i = 1; i < n; i++) {
                        int key = numbers[i];
                        j = i - 1;
                        while (j >= 0 && numbers[j] < key) {
                            numbers[j + 1] = numbers[j];
                            j = j - 1;
                        }
                        numbers[j + 1] = key;
                    }
                    System.out.println("Arreglo ordenado:");
                    for (int k=0 ; k<numbers.length ; k++ ){
                        System.out.print(" |["+numbers[k]+"]| ");
                    }
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Metodo Seleccion");

                    n = numbers.length;
                    for (int i = 0; i < n - 1; i++) {
                        int maxIndex = i;
                        for ( j = i + 1; j < n; j++) {
                            if (numbers[j] > numbers[maxIndex]) {
                                maxIndex = j;
                            }
                        }
                        int temp = numbers[maxIndex];
                        numbers[maxIndex] = numbers[i];
                        numbers[i] = temp;
                    }
                    System.out.println("Arreglo ordenado:");
                    for (int k=0 ; k<numbers.length ; k++ ){
                        System.out.print(" |["+numbers[k]+"]| ");
                    }
                    System.out.println(" ");
                    break;
            }
        }
    }
}
