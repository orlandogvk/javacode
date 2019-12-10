
package Modelo.Interfaces;

import Modelo.Bin.Empleado;

public interface IEmpleado {
    public boolean ingresar(Empleado objIng);
    public boolean modificar(Empleado objMod);
    public boolean eliminar(Empleado objEli);
    public boolean buscar(Empleado objBus);
}
