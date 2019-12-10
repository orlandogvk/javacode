
package Modelo.Interfaces;

import Modelo.Bin.Departamento;


public interface IDepartamento {
    public boolean ingresar(Departamento objIng);
    public boolean modificar(Departamento objMod);
    public boolean eliminar(Departamento objEli);
    public boolean buscar(Departamento objBus);
}
