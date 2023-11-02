import java.util.Scanner;
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector;
        int n;
        vector = new int[5];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un elemento a la posicion [" + i + "]: ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Ingrese el numero por el que desea multiplicar los elementos del array: ");
        n = sc.nextInt();
        int[] vector_final = multiplicacionVector(vector, n);
        System.out.println("El restultado es:");
        for (int j = 0; j < vector_final.length; j++) {
            System.out.print(vector_final[j]+ " ");
        }
    }

    public static int[] multiplicacionVector(int[] vector, int escalar) {
        int n = vector.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = vector[i] * escalar;
        }

        return resultado;
    }
}

