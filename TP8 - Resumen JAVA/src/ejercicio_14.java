public class ejercicio_14 {
        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] matrizInvertida = invertirFilasMatriz(matriz);

            System.out.println("Matriz original:");
            mostrarMatriz(matriz);

            System.out.println("\nMatriz con filas invertidas:");
            mostrarMatriz(matrizInvertida);
        }

        public static int[][] invertirFilasMatriz(int[][] matriz) {
            int filas = matriz.length;
            int columnas = matriz[0].length;

            int[][] matrizInvertida = new int[filas][columnas];

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matrizInvertida[i][j] = matriz[filas - 1 - i][j];
                }
            }

            return matrizInvertida;
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


