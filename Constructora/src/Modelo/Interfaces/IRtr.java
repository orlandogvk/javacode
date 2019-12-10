
package Modelo.Interfaces;

import Modelo.Bin.RegistroTransRed;


public interface IRtr {
    public boolean ingresar(RegistroTransRed objIng);
    public boolean modificar(RegistroTransRed  objMod);
    public boolean eliminar(RegistroTransRed  objEli);
    public boolean buscar(RegistroTransRed  objBus);
}
