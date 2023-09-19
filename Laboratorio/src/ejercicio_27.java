import java.util.Scanner;
public class ejercicio_27 {
    public static void main(String[] args) {
        int menor = 0;
        int mayor = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese otro numero mayor al anterior: ");
        int b = scanner.nextInt();
        if (b>a){
            menor = a;
            mayor = b;
            for(int i = a; i <= b;i++){
                if (i % 2==0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("El primer numero debe ser menor al segundo");
        }

    }
}
