
/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;
import java.util.Map;

public class ModeloHashMap extends ModeloAbs
{
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }
    public boolean insertarProducto (Producto p) {
    	lista.put(p.getCodigo(), p);
    	return true;
    }
    
    public boolean borrarProducto (int codigo) {
    	return (lista.remove(codigo) != null);
    }
    
    public producto buscarProducto (int codigo) {
    	return lista.get(codigo);
    }
    
    public void listarProductos () {
    	int cont = 1;
    	for (Map.Entry valor : lista.entrySet()) {
    		System.out.println("nº" + cont + valor.getValue());
    		cont++;
    	}
    }
    
    public boolean modificarProducto (Producto nuevo) {
    	return (lista.containsValue(nuevo));
    }
}
