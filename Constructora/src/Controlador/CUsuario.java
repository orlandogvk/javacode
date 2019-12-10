
package Controlador;

import Modelo.Bin.Usuario;
import Modelo.DAO.UsuarioDAO;
import javax.swing.JOptionPane;
public class CUsuario {
    
    String usuario;
    String clave;

    public CUsuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public void insertarUsuario(){
        
        if ("".equals(this.usuario)){
            JOptionPane.showMessageDialog(null, "El usuario no debe estar en blanco");
        }
        if ("".equals(this.clave)){
            JOptionPane.showMessageDialog(null, "La clave no debe estar en blanco");
        }
        
        UsuarioDAO objInsertardao=new UsuarioDAO();
        if(objInsertardao.ingresar(new Usuario(this.usuario,this.clave))){
              JOptionPane.showMessageDialog(null, "Ha ingresado correctamente");
        }
        
    }

}
