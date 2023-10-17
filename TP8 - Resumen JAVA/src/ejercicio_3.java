import java.util.Scanner;

public class ejercicio_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int [][] matriz;
            int[][] matriz_t;

            System.out.println("Ingrese la cantidad de filas: ");
            int f = sc.nextInt();

            System.out.println("Ingrese la cantidad de columnas: ");
            int c = sc.nextInt();
            matriz = new int[f][c];
            matriz_t = new int [c][f];

            for (int i=0 ; i<f ; i++){
                for (int j=0 ; j<c ; j++){
                    System.out.println("Matriz ["+i+"]["+j+"]= ");
                    matriz[i][j]= sc.nextInt();
                }
            }
            for (int i=0 ; i< matriz_t.length ; i++){
                for (int j=0 ; j< matriz_t.length ; j++){
                    matriz_t[i][j] = matriz [j][i];
                }
            }
            System.out.println("Matriz: ");
            for (int i=0 ; i<f ; i++){
                for (int j=0 ; j<c ; j++){
                    System.out.print("| ["+matriz[i][j]+"] |");
                }
                System.out.println(" ");
            }
            System.out.println("Matriz Transpuesta: ");
            for (int i=0 ; i< matriz_t.length ; i++){
                for (int j=0 ; j< matriz_t.length ; j++){
                    System.out.print("| ["+matriz_t[i][j]+"] |");
                }
                System.out.println(" ");
            }

        }
    }

