
package Modelo.Bin;


public class NivelRiesgo {
      public String IdNivelRiesgo;
      public String TipoRiesgo;

    public NivelRiesgo() {
    }

    public NivelRiesgo(String IdNivelRiesgo, String TipoRiesgo) {
        this.IdNivelRiesgo = IdNivelRiesgo;
        this.TipoRiesgo = TipoRiesgo;
    }

    @Override
    public String toString() {
        return "NivelRiesgo{" + "IdNivelRiesgo=" + IdNivelRiesgo + ", TipoRiesgo=" + TipoRiesgo + '}';
    }

    public String getIdNivelRiesgo() {
        return IdNivelRiesgo;
    }

    public void setIdNivelRiesgo(String IdNivelRiesgo) {
        this.IdNivelRiesgo = IdNivelRiesgo;
    }

    public String getTipoRiesgo() {
        return TipoRiesgo;
    }

    public void setTipoRiesgo(String TipoRiesgo) {
        this.TipoRiesgo = TipoRiesgo;
    }
      
      
}
