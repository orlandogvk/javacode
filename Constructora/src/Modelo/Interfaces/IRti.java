
package Modelo.Interfaces;

import Modelo.Bin.RegistroTransIng;


public interface IRti {
    public boolean ingresar(RegistroTransIng objIng);
    public boolean modificar(RegistroTransIng  objMod);
    public boolean eliminar(RegistroTransIng  objEli);
    public boolean buscar(RegistroTransIng  objBus);
}
