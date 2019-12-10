
package Modelo.DAO;

import Modelo.Bin.RegistroTransRed;
import Modelo.Interfaces.IRtr;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RegistroTransRedDAO implements IRtr {
            
        Conexion conexion;
    public RegistroTransRedDAO() {
         conexion=new Conexion();
    }

    @Override
    public boolean ingresar(RegistroTransRed objIng) {
       try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO registro_transaccion_reduccion VALUES(?,?,?,?,?)");
            
            ps.setString(1,objIng.getIdTransDed());
            ps.setString(2,objIng.getIdEmpleado());
            ps.setString(3,objIng.getIdTipoDedi());
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
            JOptionPane.showMessageDialog(null, "Error al ingresar el registro de reduccion", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean modificar(RegistroTransRed objMod) {
        Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE registro_transaccion_reduccion SET ID_EMPLEADO=?,ID_TIPO_DEDI=?,FECHA=?,MONTO=? WHERE ID_TRANS_DED=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
           
            ps.setString(1,objMod.getIdEmpleado());
            ps.setString(2,objMod.getIdTipoDedi());
            ps.setString(3,objMod.getFecha());
            ps.setInt(4,objMod.getMonto());
            ps.setString(5,objMod.getIdTransDed());
            
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar el registro de reduccion", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
    }

    @Override
    public boolean eliminar(RegistroTransRed objEli) {
        try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM registro_transaccion_reduccion WHERE ID_TRANS_DED=?");
           //Valor al interrogante
            ps.setString(1,objEli.getIdTransDed());
            ps.execute();
            //Filas afectadas al ejecutar la sentencia
            return true;
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al eliminar el registro de reduccion", "Error",JOptionPane.ERROR_MESSAGE); 
             return false;
        }
    }

    @Override
    public boolean buscar(RegistroTransRed objBus) {
         try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM registro_transaccion_reduccion WHERE ID_TRANS_DED = ?");
            ps.setString(1, objBus.getIdTransDed());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 objBus.setIdTransDed(rs.getString("ID_TRANS_DED"));
                 objBus.setIdEmpleado(rs.getString("ID_EMPLEADO"));
                 objBus.setIdTipoDedi(rs.getString("ID_TIPO_DEDI"));
                 objBus.setFecha(rs.getString("FECHA"));
                 objBus.setMonto(rs.getInt("MONTO"));
                
                 return true;
            } 
            
             return false;
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscar el registro de reduccion", "Error",JOptionPane.ERROR_MESSAGE);  
            return false;
        }
    }
    
}
