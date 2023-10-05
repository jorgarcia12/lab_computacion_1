import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz_a;
        int [][] matriz_b;
        int [][] matriz_c;
        System.out.println("Ingrese la cantidad de filas de las matrices: ");
        int f = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas de las matrices: ");
        int c = sc.nextInt();
        matriz_a = new int[f][c];
        matriz_b = new int[f][c];
        matriz_c = new int[f][c];
        for (int i=0 ; i<f ; i++){
            for (int j=0 ; j<c ; j++){
                System.out.println("Matriz A ["+i+"]["+j+"]= ");
                matriz_a[i][j]= sc.nextInt();
            }
        }
        System.out.println("----------------------------------");
        for (int i=0 ; i<f ; i++){
            for (int j=0 ; j<c ; j++){
                System.out.println("Matriz B ["+i+"]["+j+"]= ");
                matriz_b[i][j]= sc.nextInt();
            }
        }
        for (int i=0 ; i<f ; i++){
            for (int j=0 ; j<c ; j++){
                matriz_c[i][j]= matriz_a[i][j] + matriz_b[i][j];
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("La suma de las matrices A y B es: ");
        for (int i=0 ; i<f ; i++){
            for (int j=0 ; j<c ; j++){
                System.out.print("| ["+matriz_c[i][j]+"] |");
            }
            System.out.println(" ");
        }
    }
}
