
package Modelo.DAO;

import Modelo.Bin.TipoDeduccion;
import Modelo.Interfaces.ITipoDeduccion;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TipoDeduccionDAO implements ITipoDeduccion {
            Conexion conexion;
    public TipoDeduccionDAO() {
            conexion=new Conexion();
    }

    @Override
    public boolean ingresar(TipoDeduccion objIng) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO tipo_deducccion VALUES(?,?)");
            
            ps.setString(1,objIng.getIdTipoDed());
            ps.setString(2,objIng.getNomDed());
         
            
            int res = ps.executeUpdate();
            
            if(res > 0){
               
                return true;
                
            } else {
              
                 return false;
            }      
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al ingresar el registro de deduccion", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean modificar(TipoDeduccion objMod) {
         Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE tipo_deducccion SET NOMBRE_DED=? WHERE ID_TIPO_DED=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
           
            ps.setString(1,objMod.getNomDed());
            ps.setString(2,objMod.getIdTipoDed());
           
            
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar el registro de deduccion", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
    }

    @Override
    public boolean eliminar(TipoDeduccion objEli) {
        try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM tipo_deducccion WHERE ID_TIPO_DED=?");
           //Valor al interrogante
            ps.setString(1,objEli.getIdTipoDed());
            ps.execute();
            //Filas afectadas al ejecutar la sentencia
            return true;
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al eliminar el registro de deduccion", "Error",JOptionPane.ERROR_MESSAGE); 
             return false;
        }
    }

    @Override
    public boolean buscar(TipoDeduccion objBus) {
       try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tipo_deducccion WHERE ID_TIPO_DED = ?");
            ps.setString(1, objBus.getIdTipoDed());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 objBus.setIdTipoDed(rs.getString("ID_TIPO_DED"));
                 objBus.setNomDed(rs.getString("NOMBRE_DED"));
                 
                
                 return true;
            } 
            
             return false;
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscar el registro de deduccion", "Error",JOptionPane.ERROR_MESSAGE);  
            return false;
        }
    }
}
