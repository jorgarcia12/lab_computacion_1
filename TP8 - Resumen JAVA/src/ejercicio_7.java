public class ejercicio_7 {

        public static void main(String[] args) {
            int[][] matriz = {
                    {1, 2, 3},
                    {4, 9, 6},
                    {7, 8, 5}
            };

            int[] posicionMaximo = encontrarMaximoElemento(matriz);

            int maximo = matriz[posicionMaximo[0]][posicionMaximo[1]];
            int fila = posicionMaximo[0];
            int columna = posicionMaximo[1];

            System.out.println("El elemento máximo en la matriz es " + maximo);
            System.out.println("Se encuentra en la posición [" + fila + "][" + columna + "]");
        }

        public static int[] encontrarMaximoElemento(int[][] matriz) {
            int[] posicionMaximo = {0, 0};
            int maximo = matriz[0][0];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] > maximo) {
                        maximo = matriz[i][j];
                        posicionMaximo[0] = i;
                        posicionMaximo[1] = j;
                    }
                }
            }

            return posicionMaximo;
        }
    }


