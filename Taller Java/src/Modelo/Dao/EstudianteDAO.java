
package Modelo.Dao;

import Modelo.Conexion;
import Modelo.Estudiante;
import Modelo.IEstudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import javax.swing.JOptionPane;



public class EstudianteDAO implements IEstudiante {
     Conexion conexion;
    public EstudianteDAO(){
         conexion=new Conexion();
    }

    @Override
    public boolean ingresar(Estudiante objIng) {
        
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO estudiante VALUES(?,?,?,?,?)");
            ps.setString(1,objIng.getDoc());
            ps.setString(2,objIng.getNombre());
            ps.setString(3,objIng.getApellido());
            ps.setString(4,objIng.getCorreo());
            ps.setString(5,objIng.getPrograma());
          
            int res = ps.executeUpdate();
            
            if(res > 0){
               
                return true;
                
            } else {
              
                 return false;
            }      
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al ingresar", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
      
        
        
    }
    
    @Override
    public boolean modificar(Estudiante objMod) {
         Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE estudiante SET Est_Nom=?,Est_Ape=?,Est_Ema=?,Est_Pro=? WHERE Est_Ndoc=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
            ps.setString(1,objMod.getNombre());
            ps.setString(2,objMod.getApellido());
            ps.setString(3,objMod.getCorreo());
            ps.setString(4,objMod.getPrograma());
            ps.setString(5,objMod.getDoc());
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
      
        
    }

    @Override
    public boolean eliminar(Estudiante objEli) {
     
        try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM estudiante WHERE Est_Ndoc=?");
           //Valor al interrogante
            ps.setString(1,objEli.getDoc());
            ps.execute();
            //Filas afectadas al ejecutar la sentencia
            return true;
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al eliminar", "Error",JOptionPane.ERROR_MESSAGE); 
             return false;
        }
           
    }

    @Override
    public boolean buscar(Estudiante objBus) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM estudiante WHERE Est_Ndoc = ?");
            ps.setString(1, objBus.getDoc());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                  objBus.setDoc(rs.getString("Est_Ndoc"));
                  objBus.setNombre(rs.getString("Est_Nom"));
                  objBus.setApellido(rs.getString("Est_Ape"));
                  objBus.setCorreo(rs.getString("Est_Ema"));
                  objBus.setPrograma(rs.getString("Est_Pro"));
                 return true;
            } 
             return false;
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscar", "Error",JOptionPane.ERROR_MESSAGE);  
            return false;
        }
       
    }
}
