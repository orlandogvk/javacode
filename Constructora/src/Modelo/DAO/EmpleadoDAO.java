
package Modelo.DAO;

import Modelo.Bin.Empleado;
import Modelo.Interfaces.IEmpleado;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EmpleadoDAO implements IEmpleado {
    Conexion conexion;
    public EmpleadoDAO(){
          conexion=new Conexion();
    }

    @Override
    public boolean ingresar(Empleado objIng) {
         try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO empleado VALUES(?,?,?,?,?,?)");
            
            ps.setString(1,objIng.getIdEmpleado());
            ps.setString(2,objIng.getCodEmpleado());
            ps.setString(3,objIng.getCedula());
            ps.setString(4,objIng.getNombreEmp());
            ps.setInt(5,objIng.getSalario());
            ps.setString(6,objIng.getAreaResp());
          
            int res = ps.executeUpdate();
            
            if(res > 0){
               
                return true;
                
            } else {
              
                 return false;
            }      
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al ingresar empleado", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean modificar(Empleado objMod) {
       Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE empleado SET COD_EMPLEADO=?,CEDULA_EMPLEADO=?,NOMBRE_EMPLEADO=?,SALARIO_MENSUAL=?,RESPONSABLE_AREA=? WHERE ID_EMPLEADO=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
           
            ps.setString(1,objMod.getCodEmpleado());
            ps.setString(2,objMod.getCedula());
            ps.setString(3,objMod.getNombreEmp());
            ps.setString(4,String.valueOf(objMod.getSalario()));
            ps.setString(5,objMod.getAreaResp());
            ps.setString(6,objMod.getIdEmpleado());
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar el empleado", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
    }

    @Override
    public boolean eliminar(Empleado objEli) {
         try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM empleado WHERE ID_EMPLEADO=?");
           //Valor al interrogante
            ps.setString(1,objEli.getIdEmpleado());
            ps.execute();
            //Filas afectadas al ejecutar la sentencia
            return true;
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al eliminar empleado", "Error",JOptionPane.ERROR_MESSAGE); 
             return false;
        }
    }

    @Override
    public boolean buscar(Empleado objBus) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM empleado WHERE ID_EMPLEADO = ?");
            ps.setString(1, objBus.getIdEmpleado());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 objBus.setIdEmpleado(rs.getString("ID_EMPLEADO"));
                 objBus.setCodEmpleado(rs.getString("COD_EMPLEADO"));
                 objBus.setCedula(rs.getString("CEDULA_EMPLEADO"));
                 objBus.setNombreEmp(rs.getString("NOMBRE_EMPLEADO"));
                 objBus.setSalario(rs.getInt("SALARIO_MENSUAL"));
                 objBus.setAreaResp(rs.getString("RESPONSABLE_AREA"));
                 
                 return true;
            } 
             return false;
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscar el empleado", "Error",JOptionPane.ERROR_MESSAGE);  
            return false;
        }
    }
}
