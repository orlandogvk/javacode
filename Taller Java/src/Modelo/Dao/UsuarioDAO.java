
package Modelo.Dao;

import Modelo.Conexion;
import Modelo.IUsuario;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class UsuarioDAO implements IUsuario {
    Conexion conexion;
    
    public UsuarioDAO(){
        conexion=new Conexion();
    }
    
    public Usuario verificaUsuario(String id, String contraseña){
        Usuario usuario=null;
        Connection accesoDB=conexion.conectar();
        try {
            PreparedStatement ps=accesoDB.prepareStatement("select * from usuario where Usr_Id=? and Usr_Con=?");
            ps.setString(1, id);
            ps.setString(2, contraseña);
            
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                usuario=new Usuario();
                usuario.setCodigo(rs.getString(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellido(rs.getString(3));
                usuario.setUsuario(rs.getString(4));
                usuario.setClave(rs.getString(5));
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
     
      String sql="insert into usuario values(?,?,?,?,?)";
        try {
            //Ejecutamos la sentencia sql
            stm=accesoDB.prepareStatement(sql);
            stm.setString(1,objIng.getCodigo());
            stm.setString(2,objIng.getNombre());
            stm.setString(3,objIng.getApellido());
            stm.setString(4,objIng.getUsuario());
            stm.setString(5,objIng.getClave());
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

