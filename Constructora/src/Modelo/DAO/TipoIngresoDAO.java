
package Modelo.DAO;

import Modelo.Bin.TipoIngreso;
import Modelo.Interfaces.ITipoIngreso;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TipoIngresoDAO implements ITipoIngreso {
         Conexion conexion;
    public TipoIngresoDAO() {
          conexion=new Conexion();
    }

    @Override
    public boolean ingresar(TipoIngreso objIng) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO tipo_ingreso VALUES(?,?)");
            
            ps.setString(1,objIng.getIdTipoIng());
            ps.setString(2,objIng.getNomTipoIng());
         
            
            int res = ps.executeUpdate();
            
            if(res > 0){
               
                return true;
                
            } else {
              
                 return false;
            }      
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al ingresar el registro de ingreso", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean modificar(TipoIngreso objMod) {
         Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE tipo_ingreso SET NOMBRE_TIPO_ING=? WHERE ID_TIPO_ING=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
           
            ps.setString(1,objMod.getNomTipoIng());
            ps.setString(2,objMod.getIdTipoIng());
           
            
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar el registro de ingreso", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
    }

    @Override
    public boolean eliminar(TipoIngreso objEli) {
        try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM tipo_ingreso  WHERE ID_TIPO_ING=?");
           //Valor al interrogante
            ps.setString(1,objEli.getIdTipoIng());
            ps.execute();
            //Filas afectadas al ejecutar la sentencia
            return true;
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al eliminar el registro de ingreso", "Error",JOptionPane.ERROR_MESSAGE); 
             return false;
        }
    }

    @Override
    public boolean buscar(TipoIngreso objBus) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tipo_ingreso WHERE ID_TIPO_ING = ?");
            ps.setString(1, objBus.getIdTipoIng());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 objBus.setIdTipoIng(rs.getString("ID_TIPO_ING"));
                 objBus.setNomTipoIng(rs.getString("NOMBRE_TIPO_ING"));
                 
                
                 return true;
            } 
            
             return false;
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscar el registro de ingreso", "Error",JOptionPane.ERROR_MESSAGE);  
            return false;
        }
    }
    
}
