import java.util.Scanner;
public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador_mas = 0;
        int contador_menos = 0;
        int media = 0;
        int total = 0;
        System.out.println("Ingrese la cantidad de personas de las cuales va a ingresar su altura: ");
        int n = sc.nextInt();
        int[] altura;
        altura = new int[n];

        for (int i=0 ; i< altura.length ; i++){
            System.out.println("Ingrese la altura en cm: ");
            altura[i] = sc.nextInt();
            total = total + altura[i];
        }
        media = total / n;

        for (int j=0 ; j< altura.length ; j++){
            if (altura[j]<media){
                contador_menos++;
            } else if (altura[j]>=media) {
                contador_mas++;
            }
        }
        System.out.println("La altura media es: "+media);
        System.out.println("Usted ingreso "+contador_menos+" que estan por debajo de la media");
        System.out.println("Usted ingreso "+contador_mas+" que estan por encima de la media");
    }
}
