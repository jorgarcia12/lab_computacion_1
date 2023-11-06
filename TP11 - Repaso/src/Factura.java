import java.util.ArrayList;

public class Factura {
    int id;
    String fecha;
    String cliente;
    ArrayList<String> articulos;
    ArrayList <Double> precio_unidad;
    ArrayList <Integer> cantidad;
    double subtotal;
    double IVA;
    double total;
    public Factura(int id, String fecha, String cliente, double IVA) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.IVA = IVA;
        this.articulos = new ArrayList<>();
        this.precio_unidad = new ArrayList<>();
        this.cantidad = new ArrayList<>();
        this.subtotal = 0.0;
    }

    public void agregarArticulos(String articulo) {
        articulos.add(articulo);
    }
    public double calcularSubtotal(){
        subtotal = 0.0;
        for (int i = 0; i < articulos.size(); i++){
            subtotal +=  precio_unidad.get(i) * cantidad.get(i);
        }
        return subtotal;
    }
    public double calcularIVA(){
        return  subtotal*IVA;
    }
    public double calcularTotal(){
        subtotal = calcularSubtotal();
        return subtotal+subtotal*IVA;
    }
}
