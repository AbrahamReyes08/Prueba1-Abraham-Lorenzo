package Prueba1;
import java.time.LocalDateTime;

public abstract class BlockBusterItem {
    protected int codigo;
    protected String nombre;
    protected double precio;
    protected LocalDateTime fechaAd;
    
    public BlockBusterItem (int codigo, String nombre, double precio) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        fechaAd=LocalDateTime.now();
        
    }
    
    public String toString() {
        return "BlockBusterItem{Codigo: "+codigo+"Nombre: "+nombre+"Fecha: "+fechaAd+"}";
    }
    
    public abstract double pagoRenta(int dias); 
        
    
    
    
}
