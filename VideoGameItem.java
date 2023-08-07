package Prueba1;

public class VideoGameItem extends BlockBusterItem{
    private String consola;
    private static final String consola1="PlayStation", consola2="XBox", consola3="Wii";
    
    public VideoGameItem(int codigo, String nombre, String consola){
        super(codigo,nombre,30);
        this.consola=consola;
    }
    
    public String toString(){
        return super.toString()+" - Game";
    }
    
    public double pagoRenta(int dias){
        return precio*dias;
    }
    
}
