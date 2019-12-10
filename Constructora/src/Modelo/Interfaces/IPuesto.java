
package Modelo.Interfaces;

import Modelo.Bin.Puesto;

public interface IPuesto {
    public boolean ingresar(Puesto objIng);
    public boolean modificar(Puesto objMod);
    public boolean eliminar(Puesto objEli);
    public boolean buscar(Puesto objBus);
}
