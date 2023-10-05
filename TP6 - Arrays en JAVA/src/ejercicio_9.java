import java.util.Random;
public class ejercicio_9 {
    public static void main(String[] args) {
        int hasta = 35;
        int desde = 1;
        int tam = 15;
        System.out.println(llenarArrayAleatorio(hasta,desde,tam));

    }
    public static int [] llenarArrayAleatorio(int hasta, int desde, int tam){
        int[] numeros = new int[tam];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }
        for (int j=0 ; j< numeros.length ; j++){
            System.out.println(numeros[j]+" ");
        }
        return numeros;
    }
}

