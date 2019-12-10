
package Modelo.DAO;

import Modelo.Bin.Departamento;
import Modelo.Interfaces.IDepartamento;
import Modelo.conexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DepartamentoDAO implements IDepartamento {
      Conexion conexion;
      public DepartamentoDAO(){
           conexion=new Conexion();
      }
    @Override
    public boolean ingresar(Departamento objIng) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO departamento VALUES(?,?,?)");
            ps.setString(1,objIng.getIdDepto());
            ps.setString(2,objIng.getNombreDepto());
            ps.setString(3,objIng.getUbiDepto());
          
            int res = ps.executeUpdate();
            
            if(res > 0){
               
                return true;
                
            } else {
              
                 return false;
            }      
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al ingresar departamento", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
      
    }

    @Override
    public boolean modificar(Departamento objMod) {
       Connection con=conexion.conectar();
         PreparedStatement ps =null;
         String sql="UPDATE departamento SET NOMBRE_DEPART=?,UBICACION_DEPAR=? WHERE ID_DEPART=?";
        try {
            ps=con.prepareStatement(sql);           
            //Ejecutamos la sentencia sql
            ps.setString(1,objMod.getNombreDepto());
            ps.setString(2,objMod.getUbiDepto());
            ps.setString(3,objMod.getIdDepto());
            ps.execute();
            return true;  
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al modificar departamento", "Error",JOptionPane.ERROR_MESSAGE);   
             return false;
        }
      
    }

    @Override
    public boolean eliminar(Departamento objEli) {
       try {
            Connection con=conexion.conectar();
            //Ejecutamos la sentencia sql
            PreparedStatement ps=con.prepareStatement("DELETE FROM departamento WHERE ID_DEPART=?");
           //Valor al interrogante
            ps.setString(1,objEli.getIdDepto());
            ps.execute();
            //Filas afectadas al ejecutar la sentencia
            return true;
        } catch (SQLException e) {
             System.err.println(e);
             JOptionPane.showMessageDialog(null, "Error al eliminar departamento", "Error",JOptionPane.ERROR_MESSAGE); 
             return false;
        }
    }

    @Override
    public boolean buscar(Departamento objBus) {
        try{
            Connection con=conexion.conectar();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM departamento WHERE ID_DEPART = ?");
            ps.setString(1, objBus.getIdDepto());
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                  objBus.setIdDepto(rs.getString("ID_DEPART"));
                  objBus.setNombreDepto(rs.getString("NOMBRE_DEPART"));
                  objBus.setUbiDepto(rs.getString("UBICACION_DEPAR"));
                 
                 return true;
            } 
             return false;
        } catch(SQLException e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al buscar el departamento", "Error",JOptionPane.ERROR_MESSAGE);  
            return false;
        }
    }
      
}
