
package Modelo.Bin;

public class Empleado {
    public String IdEmpleado;
    public String CodEmpleado;
    public String Cedula;
    public String NombreEmp;
    public int Salario;
    public String AreaResp;

    public Empleado(String IdEmpleado, String CodEmpleado, String Cedula, String NombreEmp, int Salario, String AreaResp) {
        this.IdEmpleado = IdEmpleado;
        this.CodEmpleado = CodEmpleado;
        this.Cedula = Cedula;
        this.NombreEmp = NombreEmp;
        this.Salario = Salario;
        this.AreaResp = AreaResp;
    }

    @Override
    public String toString() {
        return "Empleado{" + "IdEmpleado=" + IdEmpleado + ", CodEmpleado=" + CodEmpleado + ", Cedula=" + Cedula + ", NombreEmp=" + NombreEmp + ", Salario=" + Salario + ", AreaResp=" + AreaResp + '}';
    }
    
    
    public Empleado() {
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getCodEmpleado() {
        return CodEmpleado;
    }

    public void setCodEmpleado(String CodEmpleado) {
        this.CodEmpleado = CodEmpleado;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombreEmp() {
        return NombreEmp;
    }

    public void setNombreEmp(String NombreEmp) {
        this.NombreEmp = NombreEmp;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getAreaResp() {
        return AreaResp;
    }

    public void setAreaResp(String AreaResp) {
        this.AreaResp = AreaResp;
    }
    
    
}
