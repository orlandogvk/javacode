
package Modelo.DAO;

import Modelo.Bin.NivelRiesgo;
import Modelo.Interfaces.INivelRiesgo;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class NivelRiesgoDAO implements INivelRiesgo {
     Conexion conexion;
    public NivelRiesgoDAO(){
        conexion=new Conexion();
    }
    @Override
    public boolean ingresar(NivelRiesgo objIng) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO nivel_riesgo VALUES(?,?)");
            ps.setString(1,objIng.getIdNivelRiesgo());
            ps.setString(2,objIng.getTipoRiesgo());
          
            int res = ps.executeUpdate();
            
            if(res > 0){
               
                return true;
                
            } else {
              
                 return false;
            }      
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al ingresar el nivel de riesgo", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean modificar(NivelRiesgo objMod) {
        Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE nivel_riesgo SET TIPO_RIESGO=? WHERE ID_NIVEL_RIESGO=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
           
            ps.setString(1,objMod.getTipoRiesgo());
            ps.setString(2,objMod.getIdNivelRiesgo());
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar el nivel de riesgo", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
    }

    @Override
    public boolean eliminar(NivelRiesgo objEli) {
         try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM nivel_riesgo WHERE ID_NIVEL_RIESGO=?");
           //Valor al interrogante
            ps.setString(1,objEli.getIdNivelRiesgo());
            ps.execute();
            //Filas afectadas al ejecutar la sentencia
            return true;
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al eliminar el nivel de riesgo", "Error",JOptionPane.ERROR_MESSAGE); 
             return false;
        }
    }

    @Override
    public boolean buscar(NivelRiesgo objBus) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM nivel_riesgo WHERE ID_NIVEL_RIESGO=?");
            ps.setString(1, objBus.getIdNivelRiesgo());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 objBus.setIdNivelRiesgo(rs.getString("ID_NIVEL_RIESGO"));
                 objBus.setTipoRiesgo(rs.getString("TIPO_RIESGO"));
                 
                 return true;
            } 
             return false;
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscar el nivel de riesgo", "Error",JOptionPane.ERROR_MESSAGE);  
            return false;
        }
    }
    
}
