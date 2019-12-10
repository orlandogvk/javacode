
package Modelo.Bin;


public class RegistroTransIng {
    public String IdTransIng;
    public String IdEmpleado;
    public String IdTipoIng;
    public String Fecha;
    public int Monto;

    public RegistroTransIng() {
    }

    public RegistroTransIng(String IdTransIng, String IdEmpleado, String IdTipoIng, String Fecha, int Monto) {
        this.IdTransIng = IdTransIng;
        this.IdEmpleado = IdEmpleado;
        this.IdTipoIng = IdTipoIng;
        this.Fecha = Fecha;
        this.Monto = Monto;
    }

    @Override
    public String toString() {
        return "RegistroTransIng{" + "IdTransIng=" + IdTransIng + ", IdEmpleado=" + IdEmpleado + ", IdTipoIng=" + IdTipoIng + ", Fecha=" + Fecha + ", Monto=" + Monto + '}';
    }

    public String getIdTransIng() {
        return IdTransIng;
    }

    public void setIdTransIng(String IdTransIng) {
        this.IdTransIng = IdTransIng;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getIdTipoIng() {
        return IdTipoIng;
    }

    public void setIdTipoIng(String IdTipoIng) {
        this.IdTipoIng = IdTipoIng;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }


    
    
}
