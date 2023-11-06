public class Circulo {
    int radio;

    public Circulo(int radio){
        this.radio = radio;
    }
    public double circunferencia() {
        return 2*3.14*radio;
    }
    public double area(){
        return 3.14 * radio*radio;
    }
}
