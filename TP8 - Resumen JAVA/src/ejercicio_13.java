import java.util.Scanner;
public class ejercicio_13 {
    public static void main(String[] args) {
        int count = 0;
        int[][] matriz = {
                {1, 2, 5},
                {4, 5, 5},
                {7, 8, 9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println(("Ingrese un numero para buscarlo en la matriz: "));
        int n = sc.nextInt();
        for(int i=0 ; i< matriz.length ; i++){
            for (int j= 0 ; j< matriz.length ; j++){
                if(n==matriz[i][j]){
                    count++;
                }
            }
        }
        System.out.println(("El numero "+n+" aparecio "+count+" veces en la matriz"));
    }
}
