
package Modelo.DAO;

import Modelo.Bin.Puesto;
import Modelo.Interfaces.IPuesto;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PuestoDAO implements IPuesto {
    
    Conexion conexion;
    public PuestoDAO(){
          conexion=new Conexion();
    }
    @Override
    public boolean ingresar(Puesto objIng) {
         try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO puesto VALUES(?,?,?,?,?)");
            
            ps.setString(1,objIng.getIdPuesto());
            ps.setString(2,objIng.getNombrePuesto());
            ps.setString(3,objIng.getNivelRiesgo());
            ps.setInt(4,objIng.getNivelSalariomin());
            ps.setInt(5,objIng.getNivelSalariomax());
            
            int res = ps.executeUpdate();
            
            if(res > 0){
               
                return true;
                
            } else {
              
                 return false;
            }      
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al ingresar el puesto", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean modificar(Puesto objMod) {
         Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE puesto SET NOMBRE_PUESTO=?,ID_NIVEL_RIESGO=?,NIVEL_SALARIO_MIN=?,NIVEL_SALARIO_MAX=? WHERE ID_PUESTO=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
           
            ps.setString(1,objMod.getNombrePuesto());
            ps.setString(2,objMod.getNivelRiesgo());
            ps.setInt(3,objMod.getNivelSalariomin());
            ps.setInt(4,objMod.getNivelSalariomax());
            ps.setString(5,objMod.getIdPuesto());
            
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar el puesto", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
    }

    @Override
    public boolean eliminar(Puesto objEli) {
        try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM puesto WHERE ID_PUESTO=?");
           //Valor al interrogante
            ps.setString(1,objEli.getIdPuesto());
            ps.execute();
            //Filas afectadas al ejecutar la sentencia
            return true;
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al eliminar puesto", "Error",JOptionPane.ERROR_MESSAGE); 
             return false;
        }
    }

    @Override
    public boolean buscar(Puesto objBus) {
       try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM puesto WHERE ID_PUESTO = ?");
            ps.setString(1, objBus.getIdPuesto());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 objBus.setIdPuesto(rs.getString("ID_PUESTO"));
                 objBus.setNombrePuesto(rs.getString("NOMBRE_PUESTO"));
                 objBus.setNivelRiesgo(rs.getString("ID_NIVEL_RIESGO"));
                 objBus.setNivelSalariomin(rs.getInt("NIVEL_SALARIO_MIN"));
                 objBus.setNivelSalariomin(rs.getInt("NIVEL_SALARIO_MAX"));
                
                 return true;
            } 
            
             return false;
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscar el puesto", "Error",JOptionPane.ERROR_MESSAGE);  
            return false;
        }
    }
    
}
