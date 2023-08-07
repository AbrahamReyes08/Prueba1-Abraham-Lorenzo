package Prueba1;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MovieItem extends BlockBusterItem{
    private String estado;
    
    public MovieItem(int codigo, String nombre, double precio) {
        super(codigo,nombre,precio);
        this.estado="Estreno";
    }
    
    public String toString(){
        return super.toString()+"(Estado: "+estado+") - Movie";
    }
    
    public double pagoRenta(int dias){
        if(estado.equals("Estreno") && dias>2){
            return precio+((dias-2)*50);
        } else if (estado.equals("Normal") && dias>5){
            return precio+((dias-5)*30);
        } else
            return precio;
    }
    
    public void evaluarEstado(LocalDateTime fechaactual){
        long mesespasados=ChronoUnit.MONTHS.between(fechaAd, fechaactual);
        if(mesespasados>=5){
            estado="Normal";
        }
    }
    
}
