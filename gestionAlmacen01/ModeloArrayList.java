
/**
 * Implementa la parte de Modelo de Datow
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ModeloArrayList extends ModeloAbs
{
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
        if (!lista.contains(p)){
        lista.add(p);
        return true;
      }
       return false; 
    }
 
    public boolean borrarProducto ( int codigo ){
      if (lista.contains(codigo)){
          lista.remove(codigo);
          return true;
        }
      return false;
    }
    
    public Producto buscarProducto ( int codigo) {
        if (lista.contains(codigo)){
            for (int i = 0; i< lista.size(); i++){
                if (lista.get(i).codigo == codigo){
                    return lista.get(i);
                }
            }
        }
        return null;
    }
    
    public void listarProductos (){
        for (Producto listas:lista){
            System.out.println(listas);
        }
    }
    
    public boolean modificarProducto (Producto nuevo){
        return false;
    }
    
    
}    
