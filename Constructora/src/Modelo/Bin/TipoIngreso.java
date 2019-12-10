
package Modelo.Bin;


public class TipoIngreso {
     public String IdTipoIng;
     public String NomTipoIng;

    public TipoIngreso() {
    }

    public TipoIngreso(String IdTipoIng, String NomTipoIng) {
        this.IdTipoIng = IdTipoIng;
        this.NomTipoIng = NomTipoIng;
    }

    @Override
    public String toString() {
        return "TipoIngreso{" + "IdTipoIng=" + IdTipoIng + ", NomTipoIng=" + NomTipoIng + '}';
    }

    public String getIdTipoIng() {
        return IdTipoIng;
    }

    public void setIdTipoIng(String IdTipoIng) {
        this.IdTipoIng = IdTipoIng;
    }

    public String getNomTipoIng() {
        return NomTipoIng;
    }

    public void setNomTipoIng(String NomTipoIng) {
        this.NomTipoIng = NomTipoIng;
    }
     
     
}
