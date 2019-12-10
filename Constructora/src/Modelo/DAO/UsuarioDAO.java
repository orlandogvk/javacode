
package Modelo.DAO;

import Modelo.Bin.Usuario;
import Modelo.Interfaces.IUsuario;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO implements IUsuario {
        Conexion conexion;
    public UsuarioDAO() {
         conexion=new Conexion();
    }
    
     public Usuario verificaUsuario(String id, String contraseña){
        Usuario usuario=null;
        Connection accesoDB=conexion.conectar();
        try {
            PreparedStatement ps=accesoDB.prepareStatement("SELECT * FROM usuario where USUARIO=? and CLAVE=?");
            ps.setString(1, id);
            ps.setString(2, contraseña);
            
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                usuario=new Usuario();
                usuario.setUsuario(rs.getString(1));
                usuario.setClave(rs.getString(2));
                return usuario;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El error es: "+e.getMessage());
        }
        return usuario;
    }
    
    @Override
    public boolean ingresar(Usuario objIng) {
      Connection accesoDB=conexion.conectar();
      PreparedStatement  stm = null; 
     
      String sql="INSERT INTO usuario VALUES(?,?)";
        try {
            //Ejecutamos la sentencia sql
            stm=accesoDB.prepareStatement(sql);
            stm.setString(1,objIng.getUsuario());
            stm.setString(2,objIng.getClave());
            stm.executeUpdate();
            return true;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Ocurrio el siguiente error: "+e.getMessage());
        }
        return false;
    }

    @Override
    public boolean cancelar(Usuario objIng) {
        
       return false;
    }
    
}
