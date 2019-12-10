
package Controlador;

import Modelo.Bin.Departamento;
import Modelo.DAO.DepartamentoDAO;
import Vista.VDepartamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CDepartamento implements ActionListener {
    private Departamento departamento;        //bean
    private DepartamentoDAO DAODept;     //DAO
    private VDepartamento vdepartamento;  //Vista

    public CDepartamento(Departamento departamento, DepartamentoDAO DAODept, VDepartamento vdepartamento) {
        this.departamento = departamento;
        this.DAODept = DAODept;
        this.vdepartamento = vdepartamento;
        //Eventos
        this.vdepartamento.btnIng.addActionListener(this);
        this.vdepartamento.btnMod.addActionListener(this);
        this.vdepartamento.btnEli.addActionListener(this);
        this.vdepartamento.btnLimp.addActionListener(this);
        this.vdepartamento.btnBus.addActionListener(this);
    }
    
     public void iniciar(){
        vdepartamento.setTitle("GESTION DE DEPARTAMENTO"); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vdepartamento.btnIng){
            
            departamento.setIdDepto(vdepartamento.txtId.getText());
            departamento.setNombreDepto(vdepartamento.txtNom.getText());
            departamento.setUbiDepto(vdepartamento.txtUbi.getText());
            
            if(DAODept.ingresar(departamento)){
                JOptionPane.showMessageDialog(null,"Registro guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al guardar");
                limpiar();
            }
        }
        
         if(e.getSource()==vdepartamento.btnMod){
            
            departamento.setIdDepto(vdepartamento.txtId.getText());
            departamento.setNombreDepto(vdepartamento.txtNom.getText());
            departamento.setUbiDepto(vdepartamento.txtUbi.getText());
            
            if(DAODept.modificar(departamento)){
                JOptionPane.showMessageDialog(null,"Registro modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar");
                limpiar();
            }
        }
         
          if(e.getSource()==vdepartamento.btnEli){
            
            departamento.setIdDepto(vdepartamento.txtId.getText());
            departamento.setNombreDepto(vdepartamento.txtNom.getText());
            departamento.setUbiDepto(vdepartamento.txtUbi.getText());
            
            if(DAODept.eliminar(departamento)){
                JOptionPane.showMessageDialog(null,"Registro eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminado");
                limpiar();
            }

        }
          
        if(e.getSource()==vdepartamento.btnLimp){
                     limpiar();
        }
        
        if(e.getSource()==vdepartamento.btnBus){
            
            departamento.setIdDepto(vdepartamento.txtId.getText());
          
            
            if(DAODept.buscar(departamento)){
                vdepartamento.txtId.setText(departamento.getIdDepto());
                vdepartamento.txtNom.setText(departamento.getNombreDepto());
                vdepartamento.txtUbi.setText(departamento.getUbiDepto());
               
                JOptionPane.showMessageDialog(null,"Registro encontrado");
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el registro");
                limpiar();
            }

        }     
         
    }
    
    public void limpiar() {
          
	vdepartamento.txtId.setText(null);
	vdepartamento.txtNom.setText(null);
	vdepartamento.txtUbi.setText(null);	
    }
    
}
