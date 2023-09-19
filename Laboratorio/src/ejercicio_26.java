import java.util.Scanner;
public class ejercicio_26 {
    public static void main(String[] args) {
        int menor = 0;
        int mayor = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese otro numero: ");
        int n2 = scanner.nextInt();
        if (n1>n2){
            mayor = n1;
            menor = n2;
        }else {
           mayor = n2;
           menor = n1;
        }
        if (n1==n2){
            System.out.println("Los numeros son iguales, pruebe nuevamente ");
        }else {
            for (int i = menor;i<=mayor;i++){
                System.out.println(i);
            }
        }
    }
}
