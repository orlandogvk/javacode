
package Modelo.Interfaces;

import Modelo.Bin.TipoDeduccion;

public interface ITipoDeduccion {
    public boolean ingresar(TipoDeduccion objIng);
    public boolean modificar(TipoDeduccion  objMod);
    public boolean eliminar(TipoDeduccion  objEli);
    public boolean buscar(TipoDeduccion  objBus);
}
