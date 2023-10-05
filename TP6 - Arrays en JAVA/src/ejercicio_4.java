public class ejercicio_4 {
    public static void main(String[] args) {
        int [] pares;
        pares = new int[20];

        for (int i=0, numero=2 ; i< pares.length ; i++ , numero+=2){
            pares[i] = numero;
        }
        for (int j=0 ; j< pares.length ; j++){
            System.out.println(" |"+pares[j]+"| ");
        }
    }
}

