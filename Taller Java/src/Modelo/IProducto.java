
package Modelo;

import java.util.List;


public interface IProducto {
    public boolean ingresar(Producto objIng);
    public boolean modificar(Producto objMod);
    public boolean eliminar(Producto objEli);
    public boolean buscar(Producto objBus);
}
