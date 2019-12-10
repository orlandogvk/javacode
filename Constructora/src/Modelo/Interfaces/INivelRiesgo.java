
package Modelo.Interfaces;

import Modelo.Bin.NivelRiesgo;

public interface INivelRiesgo {
    public boolean ingresar(NivelRiesgo objIng);
    public boolean modificar(NivelRiesgo objMod);
    public boolean eliminar(NivelRiesgo objEli);
    public boolean buscar(NivelRiesgo objBus);
}
