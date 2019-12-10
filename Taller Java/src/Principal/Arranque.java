
package Principal;


import vista.SesionVista;
import vista.Splash;


public class Arranque {
    public static void main(String[] args) {
       SesionVista obj= new SesionVista();
       Splash miSplash=new Splash(obj,true);
       miSplash.setVisible(true);
    }
}
