
package Modelo;

import java.util.List;

public interface IEstudiante {
    
    public boolean ingresar(Estudiante objIng);
    public boolean modificar(Estudiante objMod);
    public boolean eliminar(Estudiante objEli);
    public boolean buscar(Estudiante objBus);
}

