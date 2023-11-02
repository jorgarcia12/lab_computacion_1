public class ejercicio_12 {
        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] matrizRotada = rotarMatriz90Grados(matriz);

            System.out.println("Matriz original:");
            mostrarMatriz(matriz);

            System.out.println("\nMatriz rotada 90 grados en sentido horario:");
            mostrarMatriz(matrizRotada);
        }

        public static int[][] rotarMatriz90Grados(int[][] matriz) {
            int filasOriginales = matriz.length;
            int columnasOriginales = matriz[0].length;

            int[][] matrizRotada = new int[columnasOriginales][filasOriginales];

            for (int i = 0; i < filasOriginales; i++) {
                for (int j = 0; j < columnasOriginales; j++) {
                    matrizRotada[j][filasOriginales - 1 - i] = matriz[i][j];
                }
            }

            return matrizRotada;
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
