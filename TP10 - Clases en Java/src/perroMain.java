public class perroMain {
    public static void main(String[] args) {
        Perro perro1 = new Perro("labrador","India",12 );

        perro1.ladrar();

        System.out.println("El perro se llama: "+perro1.getNombre());
        System.out.println("Su raza es: "+perro1.getRaza());
        System.out.println("Tiene: "+perro1.getEdad()+" años");
    }
}
