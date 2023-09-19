import java.util.Scanner;
public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un mes para saber cuantos dias tiene: ");
        int mes = scanner.nextInt();
        if (mes > 0 && mes < 13){
            if(mes==4 || mes==6 || mes==9 || mes==11){
                System.out.println("El mes ingresado tiene 30 dias");
            } else if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
                System.out.println("El mes ingresado tiene 31 dias");
            } else if (mes==2) {
                System.out.println("El mes ingresado tiene 28 dias");
            }else {
                System.out.println("Ingrese un numero de mes valido");
            }
        }
    }
}
