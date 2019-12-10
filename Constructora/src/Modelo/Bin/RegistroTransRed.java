
package Modelo.Bin;

public class RegistroTransRed  {
    public String IdTransDed;
    public String IdEmpleado;
    public String IdTipoDedi;
    public String Fecha;
    public int Monto;

    public RegistroTransRed() {
    }

    public RegistroTransRed(String IdTransDed, String IdEmpleado, String IdTipoDedi, String Fecha, int Monto) {
        this.IdTransDed = IdTransDed;
        this.IdEmpleado = IdEmpleado;
        this.IdTipoDedi = IdTipoDedi;
        this.Fecha = Fecha;
        this.Monto = Monto;
    }

    @Override
    public String toString() {
        return "RegistroTransRed{" + "IdTransDed=" + IdTransDed + ", IdEmpleado=" + IdEmpleado + ", IdTipoDedi=" + IdTipoDedi + ", Fecha=" + Fecha + ", Monto=" + Monto + '}';
    }

    public String getIdTransDed() {
        return IdTransDed;
    }

    public void setIdTransDed(String IdTransDed) {
        this.IdTransDed = IdTransDed;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getIdTipoDedi() {
        return IdTipoDedi;
    }

    public void setIdTipoDedi(String IdTipoDedi) {
        this.IdTipoDedi = IdTipoDedi;
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
