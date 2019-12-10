
package Modelo.Bin;


public class Puesto {
        public String IdPuesto;
        public String NombrePuesto;
        public String NivelRiesgo;
        public int NivelSalariomin;
        public int NivelSalariomax;
    public Puesto() {
    }

    public Puesto(String IdPuesto, String NombrePuesto, String NivelRiesgo, int NivelSalariomin, int NivelSalariomax) {
        this.IdPuesto = IdPuesto;
        this.NombrePuesto = NombrePuesto;
        this.NivelRiesgo = NivelRiesgo;
        this.NivelSalariomin = NivelSalariomin;
        this.NivelSalariomax = NivelSalariomax;
    }

    @Override
    public String toString() {
        return "Puesto{" + "IdPuesto=" + IdPuesto + ", NombrePuesto=" + NombrePuesto + ", NivelRiesgo=" + NivelRiesgo + ", NivelSalariomin=" + NivelSalariomin + ", NivelSalariomax=" + NivelSalariomax + '}';
    }

   
    

    public String getIdPuesto() {
        return IdPuesto;
    }

    public void setIdPuesto(String IdPuesto) {
        this.IdPuesto = IdPuesto;
    }

    public String getNombrePuesto() {
        return NombrePuesto;
    }

    public void setNombrePuesto(String NombrePuesto) {
        this.NombrePuesto = NombrePuesto;
    }

    public String getNivelRiesgo() {
        return NivelRiesgo;
    }

    public void setNivelRiesgo(String NivelRiesgo) {
        this.NivelRiesgo = NivelRiesgo;
    }

    public int getNivelSalariomin() {
        return NivelSalariomin;
    }

    public void setNivelSalariomin(int NivelSalariomin) {
        this.NivelSalariomin = NivelSalariomin;
    }

    public int getNivelSalariomax() {
        return NivelSalariomax;
    }

    public void setNivelSalariomax(int NivelSalariomax) {
        this.NivelSalariomax = NivelSalariomax;
    }

  
        
        
}
