import java.util.Scanner;
public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Ingrese la fila a sumar: ");
        int fila = sc.nextInt();

        int sumaFila = calcularSumaFila(matriz, fila);

        System.out.println("La suma de la fila " + fila + " es: " + sumaFila);
    }

    public static int calcularSumaFila(int[][] matriz, int fila) {
        int suma = 0;

        if (fila >= 0 && fila < matriz.length) {
            for (int j = 0; j < matriz[fila].length; j++) {
                suma += matriz[fila][j];
            }
        } else {
            System.out.println("Fila fuera de los límites de la matriz.");
        }

        return suma;
    }
}

