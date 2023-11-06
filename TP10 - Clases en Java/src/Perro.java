
public class Perro {
    String raza;
    String nombre;
    int edad;
    public Perro(String raza, String nombre, int edad){
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getRaza(){
        return raza;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }

    public void ladrar(){
        System.out.println("Guau, Guau!");
    }
}
