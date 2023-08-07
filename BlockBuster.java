package Prueba1;
import java.util.ArrayList;

public class BlockBuster {
    static ArrayList<BlockBusterItem> item = new ArrayList();

    /*public void buscarItem(int codigo, String tipo){
        for(BlockBusterItem Item: item){
            if(codigo==Item.codigo && tipo.equals(Item.))
        }
    }*/
    
    public void agregarItem(int codigo, String nombre, String tipo){
        if(tipo.equals("Juego")){
            item.add(new VideoGameItem(codigo, nombre,"Play"));
        } else if (tipo.equals("Pelicula")){
            
        }
    }
}
