
package Modelo;


public class Producto {
    private int codpro;
    private String nompro;
    private String categ;
    private int valor;

    public Producto() {
    }

    public Producto(int codpro, String nompro, String categ, int valor) {
        this.codpro = codpro;
        this.nompro = nompro;
        this.categ = categ;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto{" + "codpro=" + codpro + ", nompro=" + nompro + ", categ=" + categ + ", valor=" + valor + '}';
    }

    public int getCodpro() {
        return codpro;
    }

    public void setCodpro(int codpro) {
        this.codpro = codpro;
    }

    public String getNompro() {
        return nompro;
    }

    public void setNompro(String nompro) {
        this.nompro = nompro;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
