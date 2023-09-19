import java.util.Scanner;
public class ejercicio_28 {
    public static void main(String[] args) {
        int menor = 0;
        int mayor = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = scanner.nextInt();
        System.out.println("Ingrese un numero mayor al anterior: ");
        int m = scanner.nextInt();
        if(n < m){
            menor=n;
            mayor=m;
            System.out.println("Los multiplos de "+n+" desde 1 hasta "+m+" son: ");
            for (int i=1;mayor>i;i++){
                if(i % 4==0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("El primer numero debe ser menor al segundo");
        }
    }
}
