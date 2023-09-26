import java.util.Scanner;
public class repaso_parcial_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese otro numero: ");
        int n2 = scanner.nextInt();
        int last_n1 = n1 % 10;
        int last_n2 = n2 % 10;
        if (last_n1 == last_n2){
            System.out.println("Las ultimas cifras de ambos numeros son iguales");
        }else {
            System.out.println("La ultimas cifras de los numeros son distintos");
        }
    }
}
