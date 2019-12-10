
package Modelo.Bin;


public class TipoDeduccion {
    public String IdTipoDed;
    public String NomDed;

    public TipoDeduccion() {
    }

    public TipoDeduccion(String IdTipoDed, String NomDed) {
        this.IdTipoDed = IdTipoDed;
        this.NomDed = NomDed;
    }

    @Override
    public String toString() {
        return "TipoDeduccion{" + "IdTipoDed=" + IdTipoDed + ", NomDed=" + NomDed + '}';
    }

    public String getIdTipoDed() {
        return IdTipoDed;
    }

    public void setIdTipoDed(String IdTipoDed) {
        this.IdTipoDed = IdTipoDed;
    }

    public String getNomDed() {
        return NomDed;
    }

    public void setNomDed(String NomDed) {
        this.NomDed = NomDed;
    }
    
    
             
}
