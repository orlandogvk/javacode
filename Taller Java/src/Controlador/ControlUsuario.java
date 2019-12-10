
package Controlador;

import Modelo.Dao.UsuarioDAO;
import Modelo.Usuario;
import javax.swing.JOptionPane;


public class ControlUsuario {
    String documento;
    String nombre;
    String apellido;
    String usuario;
    String clave;

    public ControlUsuario(String documento, String nombre, String apellido, String usuario, String clave) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
    }
 
    public void insertarUsuario(){
        
        if ("".equals(this.documento)){
            JOptionPane.showMessageDialog(null, "El documento no debe estar en blanco");
        }
        if ("".equals(this.nombre)){
            JOptionPane.showMessageDialog(null, "El nombre no debe estar en blanco");
        }
        if ("".equals(this.apellido)){
            JOptionPane.showMessageDialog(null, "El apellido no debe estar en blanco");
        }
        if ("".equals(this.usuario)){
            JOptionPane.showMessageDialog(null, "El usuario no debe estar en blanco");
        }
        if ("".equals(this.clave)){
            JOptionPane.showMessageDialog(null, "La clave no debe estar en blanco");
        }
        
        UsuarioDAO objInsertardao=new UsuarioDAO();
        if(objInsertardao.ingresar(new Usuario(this.documento,this.nombre,this.apellido,this.usuario,this.clave))){
              JOptionPane.showMessageDialog(null, "Ha ingresado correctamente");
        }
        
    }
   
}
