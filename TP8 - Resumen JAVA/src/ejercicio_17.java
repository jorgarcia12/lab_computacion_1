public class ejercicio_17 {
    public static void main(String[] args) {
        int[][] matriz = {
                {3, 1, 4},
                {2, 5, 8},
                {6, 0, 9}
        };

        int[] minimosPorFila = encontrarValorMinimoPorFila(matriz);

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        System.out.println("\nValores mínimos por fila:");
        mostrarArreglo(minimosPorFila);
    }

    public static int[] encontrarValorMinimoPorFila(int[][] matriz) {
        int filas = matriz.length;
        int[] minimosPorFila = new int[filas];

        for (int i = 0; i < filas; i++) {
            int minimo = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
            minimosPorFila[i] = minimo;
        }

        return minimosPorFila;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.println(num);
        }
    }
}

