public class ejercicio_3 {
    public static void main(String[] args) {
        int[][] matrizOriginal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    int[][] matrizTranspuesta = calcularTranspuesta(matrizOriginal);

        System.out.println("Matriz Original:");
    mostrarMatriz(matrizOriginal);

        System.out.println("\nMatriz Transpuesta:");
    mostrarMatriz(matrizTranspuesta);
}

    public static int[][] calcularTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}