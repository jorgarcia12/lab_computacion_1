public class ejercicio_18 {
        public static void main(String[] args) {
            int[][] matrizA = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] matrizB = {
                    {7, 8},
                    {9, 10},
                    {11, 12}
            };

            int[][] resultado = productoMatrices(matrizA, matrizB);

            if (resultado == null) {
                System.out.println("No se puede calcular el producto de matrices.");
            } else {
                System.out.println("Producto de matrices:");
                mostrarMatriz(resultado);
            }
        }

        public static int[][] productoMatrices(int[][] matrizA, int[][] matrizB) {
            int filasA = matrizA.length;
            int columnasA = matrizA[0].length;
            int filasB = matrizB.length;
            int columnasB = matrizB[0].length;

            if (columnasA != filasB) {
                return null; 
            }

            int[][] resultado = new int[filasA][columnasB];

            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    int suma = 0;
                    for (int k = 0; k < columnasA; k++) {
                        suma += matrizA[i][k] * matrizB[k][j];
                    }
                    resultado[i][j] = suma;
                }
            }

            return resultado;
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
