import java.util.Random;
import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        if (esMatrizSimetrica(matriz)) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }
    public static boolean esMatrizSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}


