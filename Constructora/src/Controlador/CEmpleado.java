
package Controlador;

import Modelo.Bin.Empleado;
import Modelo.DAO.EmpleadoDAO;
import Vista.VEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class CEmpleado implements ActionListener{
    private Empleado empleado;        //bean
    private EmpleadoDAO DAOEmp;     //DAO
    private VEmpleado vempleado;  //Vist
    
    public CEmpleado() {
    }

    public CEmpleado(Empleado empleado, EmpleadoDAO DAOEmp, VEmpleado vempleado) {
        this.empleado = empleado;
        this.DAOEmp = DAOEmp;
        this.vempleado = vempleado;
        
        this.vempleado.btnIng.addActionListener(this);
        this.vempleado.btnMod.addActionListener(this);
        this.vempleado.btnEli.addActionListener(this);
        this.vempleado.btnLimp.addActionListener(this);
        this.vempleado.btnBus.addActionListener(this);
    }

    public void iniciar(){
        vempleado.setTitle("GESTION DE EMPLEADOS");
      
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vempleado.btnIng){
            
            empleado.setIdEmpleado(vempleado.txtId.getText());
            empleado.setCodEmpleado(vempleado.txtCod.getText());
            empleado.setCedula(vempleado.txtCed.getText());
            empleado.setNombreEmp(vempleado.txtNom.getText());
            empleado.setSalario(Integer.parseInt(vempleado.txtSal.getText()));
            empleado.setAreaResp(vempleado.txtArea.getText());
            
            if(DAOEmp.ingresar(empleado)){
                JOptionPane.showMessageDialog(null,"Registro guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al guardar");
                limpiar();
            }
        }
        
        
        if(e.getSource()==vempleado.btnMod){
            
            empleado.setIdEmpleado(vempleado.txtId.getText());
            empleado.setCodEmpleado(vempleado.txtCod.getText());
            empleado.setCedula(vempleado.txtCed.getText());
            empleado.setNombreEmp(vempleado.txtNom.getText());
            empleado.setSalario(Integer.parseInt(vempleado.txtSal.getText()));
            empleado.setAreaResp(vempleado.txtArea.getText());
         
            
            if(DAOEmp.modificar(empleado)){
                JOptionPane.showMessageDialog(null,"Registro modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar");
                limpiar();
            }
        }
        
        
        if(e.getSource()==vempleado.btnEli){
            
            empleado.setIdEmpleado(vempleado.txtId.getText());
            empleado.setCodEmpleado(vempleado.txtCod.getText());
            empleado.setCedula(vempleado.txtCed.getText());
            empleado.setNombreEmp(vempleado.txtNom.getText());
            empleado.setSalario(Integer.parseInt(vempleado.txtSal.getText()));
            empleado.setAreaResp(vempleado.txtArea.getText());
            
            if(DAOEmp.eliminar(empleado)){
                JOptionPane.showMessageDialog(null,"Registro eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar");
                limpiar();
            }
        }
        
       if(e.getSource()==vempleado.btnLimp){
                     limpiar();
       }
       
       if(e.getSource()==vempleado.btnBus){
            
            empleado.setIdEmpleado(vempleado.txtId.getText());
          
            
            if(DAOEmp.buscar(empleado)){
                vempleado.txtId.setText(empleado.getIdEmpleado());
                vempleado.txtCod.setText(empleado.getCodEmpleado());
                vempleado.txtCed.setText(empleado.getCedula());
                vempleado.txtNom.setText(empleado.getNombreEmp());
                vempleado.txtSal.setText(String.valueOf(empleado.getSalario()));
                vempleado.txtArea.setText(empleado.getAreaResp());
                   
               
                JOptionPane.showMessageDialog(null,"Registro encontrado");
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el registro");
                limpiar();
            }

        } 
        
    }
    
    
    public void limpiar() {
          
	vempleado.txtId.setText(null);
	vempleado.txtCod.setText(null);
	vempleado.txtCed.setText(null);	
        vempleado.txtNom.setText(null);
        vempleado.txtSal.setText(null);
        vempleado.txtSal.setText(null);	
    }
    
    
}
