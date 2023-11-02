import java.util.Scanner;
public class ejercicio_10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la dimension de la matriz identidad: ");
            int n = sc.nextInt();
            int[][] matrizIdentidad = generarMatrizIdentidad(n);

            mostrarMatriz(matrizIdentidad);
        }

        public static int[][] generarMatrizIdentidad(int n) {
            int[][] matriz = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = 0;
                    }
                }
            }

            return matriz;
        }

        public static void mostrarMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
}
