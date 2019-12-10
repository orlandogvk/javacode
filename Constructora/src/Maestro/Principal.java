
package Maestro;

//import Modelo.conexionBD.Conexion;

import Vista.VSesion;
import vista.Splash;



public class Principal {
    public static void main(String[] args) {
       // Conexion objcon=new Conexion();
       // objcon.conectar();
       VSesion obj= new VSesion();
       Splash miSplash=new Splash(obj,true);
       miSplash.setVisible(true);
        
    }
}
