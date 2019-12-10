
package Modelo.DAO;

import Modelo.Bin.RegistroTransIng;
import Modelo.Interfaces.IRti;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RegistroTransIngDAO implements IRti {

        Conexion conexion;
    public RegistroTransIngDAO() {
        
        conexion=new Conexion();
    }
    
    @Override
    public boolean ingresar(RegistroTransIng objIng) {
         try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO registro_transaccion_ingreso VALUES(?,?,?,?,?)");
            
            ps.setString(1,objIng.getIdTransIng());
            ps.setString(2,objIng.getIdEmpleado());
            ps.setString(3,objIng.getIdTipoIng());
            ps.setString(4,objIng.getFecha());
            ps.setInt(5,objIng.getMonto());
            
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
    public boolean modificar(RegistroTransIng objMod) {
          Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE registro_transaccion_ingreso SET ID_EMPLEADO=?,ID_TIPO_ING=?,FECHA=?,MONTO=? WHERE ID_TRANS_ING=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
           
            ps.setString(1,objMod.getIdEmpleado());
            ps.setString(2,objMod.getIdTipoIng());
            ps.setString(3,objMod.getFecha());
            ps.setInt(4,objMod.getMonto());
            ps.setString(5,objMod.getIdTransIng());
            
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar el registro de ingreso", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
    }

    @Override
    public boolean eliminar(RegistroTransIng objEli) {
        try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM registro_transaccion_ingreso WHERE ID_TRANS_ING=?");
           //Valor al interrogante
            ps.setString(1,objEli.getIdTransIng());
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
    public boolean buscar(RegistroTransIng objBus) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM registro_transaccion_ingreso WHERE ID_TRANS_ING = ?");
            ps.setString(1, objBus.getIdTransIng());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 objBus.setIdTransIng(rs.getString("ID_TRANS_ING"));
                 objBus.setIdEmpleado(rs.getString("ID_EMPLEADO"));
                 objBus.setIdTipoIng(rs.getString("ID_TIPO_ING"));
                 objBus.setFecha(rs.getString("FECHA"));
                 objBus.setMonto(rs.getInt("MONTO"));
                
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
