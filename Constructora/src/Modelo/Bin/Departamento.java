
package Modelo.Bin;


public class Departamento {
    public String IdDepto;
    public String nombreDepto;
    public String ubiDepto;

    public Departamento() {
    }

    @Override
    public String toString() {
        return "Departamento{" + "IdDepto=" + IdDepto + ", nombreDepto=" + nombreDepto + ", ubiDepto=" + ubiDepto + '}';
    }

    
    public Departamento(String IdDepto, String nombreDepto, String ubiDepto) {
        this.IdDepto = IdDepto;
        this.nombreDepto = nombreDepto;
        this.ubiDepto = ubiDepto;
    }

    public String getIdDepto() {
        return IdDepto;
    }

    public void setIdDepto(String IdDepto) {
        this.IdDepto = IdDepto;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    public String getUbiDepto() {
        return ubiDepto;
    }

    public void setUbiDepto(String ubiDepto) {
        this.ubiDepto = ubiDepto;
    }

    
}
