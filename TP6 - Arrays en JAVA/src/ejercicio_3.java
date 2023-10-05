import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos de la clase: ");
        int n = sc.nextInt();
        double [] clase;
        clase = new double[n];
        double prom = 0;
        for (int i = 0; clase.length > i; i++){
            System.out.println("Ingrese la nota del alumno "+i+" ");
            clase[i]= sc.nextInt();
            prom= prom + clase[i];
        }
        double media = prom/n;
        System.out.println("La media de la clase es de: "+media);

        for (int j = 0 ; j< clase.length ; j++) {
            if (clase[j]>media) {
                System.out.println("Este alumno esta por encima de la media con: " + clase[j]);
            }
        }
    }
}
