public class ejercicio_11 {
        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[] resultados = contarParesEImpares(matriz);

            int pares = resultados[0];
            int impares = resultados[1];

            System.out.println("Cantidad de números pares: " + pares);
            System.out.println("Cantidad de números impares: " + impares);
        }

        public static int[] contarParesEImpares(int[][] matriz) {
            int pares = 0;
            int impares = 0;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                }
            }

            int[] resultados = {pares, impares};
            return resultados;
        }
}
