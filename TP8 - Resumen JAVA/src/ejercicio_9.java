public class ejercicio_9 {
        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 0, 0},
                    {0, 2, 0},
                    {0, 0, 3}
            };

            if (esMatrizDiagonal(matriz)) {
                System.out.println("La matriz es diagonal.");
            } else {
                System.out.println("La matriz no es diagonal.");
            }
        }

        public static boolean esMatrizDiagonal(int[][] matriz) {
            int filas = matriz.length;
            int columnas = matriz[0].length;


            if (filas != columnas) {
                return false;
            }


            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (i != j && matriz[i][j] != 0) {
                        return false;
                    }
                }
            }

            return true;
        }


}
