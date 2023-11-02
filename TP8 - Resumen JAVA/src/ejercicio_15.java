public class ejercicio_15 {
        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 9, 6},
                    {7, 8, 10}
            };

            int sumaDiagonales = sumarDiagonales(matriz);

            System.out.println("Matriz:");
            mostrarMatriz(matriz);

            System.out.print("La suma de todas las diagonales es: " + sumaDiagonales);
        }

        public static int sumarDiagonales(int[][] matriz) {
            int suma = 0;
            int n = matriz.length;

            for (int i = 0; i < n; i++) {
                suma += matriz[i][i];
                suma += matriz[i][n - 1 - i];
            }


            if (n % 2 == 1) {
                suma -= matriz[n / 2][n / 2];
            }

            return suma;
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


