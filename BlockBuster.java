package Prueba1;
import java.util.ArrayList;

public class BlockBuster {
    static ArrayList<BlockBusterItem> item = new ArrayList();

    public BlockBusterItem buscarItem(int codigo, String tipo){
        for(BlockBusterItem Item: item){
            if(codigo==Item.codigo){
                if (tipo.equals("Juego")){
                    if(Item instanceof VideoGameItem){
                        return Item;
                    }
                }
                if (tipo.equals("Pelicula")){
                    if(Item instanceof MovieItem){
                        return Item;
                    }
                }
            }
        }
        return null;
    }
    
    public void agregarItem(int codigo, String nombre, String tipo){
        if(tipo.equals("Juego")){
            if(buscarItem(codigo, "Juego")==null){
            VideoGameItem juego = new VideoGameItem(codigo, nombre, "Play");
            item.add((BlockBusterItem)juego);
            }
        } else if (tipo.equals("Pelicula")){
            if(buscarItem(codigo, "Pelicula")==null){
             MovieItem pelicula = new MovieItem(codigo, nombre, 4);
            item.add((BlockBusterItem)pelicula);
            }
        }
    }
}
