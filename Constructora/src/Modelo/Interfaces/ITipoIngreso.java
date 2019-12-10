
package Modelo.Interfaces;

import Modelo.Bin.TipoIngreso;


public interface ITipoIngreso {
    public boolean ingresar(TipoIngreso objIng);
    public boolean modificar(TipoIngreso  objMod);
    public boolean eliminar(TipoIngreso  objEli);
    public boolean buscar(TipoIngreso  objBus);
}
