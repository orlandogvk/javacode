
package Controlador;

import Modelo.Dao.EstudianteDAO;
import Modelo.Estudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.EstudianteVista;



public class ControlEstudiante implements ActionListener  {
    
    private Estudiante estudiante;        //bean
    private EstudianteDAO modeloEst;     //DAO
    private EstudianteVista vestudiante;  //Vista
    
    public ControlEstudiante(Estudiante estudiante, EstudianteDAO modeloEst, EstudianteVista vestudiante) {
        this.estudiante=estudiante;
        this.modeloEst=modeloEst;
        this.vestudiante=vestudiante;
        //Eventos
        this.vestudiante.btnNew.addActionListener(this);
        this.vestudiante.btnMk.addActionListener(this);
        this.vestudiante.btnUpdate.addActionListener(this);
        this.vestudiante.btnKill.addActionListener(this);
        this.vestudiante.btnSearch.addActionListener(this);
    }
  
    public void iniciar(){
        vestudiante.setTitle("GESTION DE ESTUDIANTES");
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==vestudiante.btnNew){
            
            estudiante.setDoc(vestudiante.txtDoc.getText());
            estudiante.setNombre(vestudiante.txtNom.getText());
            estudiante.setApellido(vestudiante.txtApe.getText());
            estudiante.setCorreo(vestudiante.txtCor.getText());
            estudiante.setPrograma(vestudiante.txtPro.getText());
            
            if(modeloEst.ingresar(estudiante)){
                JOptionPane.showMessageDialog(null,"Registro guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al guardar");
                limpiar();
            }
        }
        
         if(e.getSource()==vestudiante.btnMk){
            
            estudiante.setDoc(vestudiante.txtDoc.getText());
            estudiante.setNombre(vestudiante.txtNom.getText());
            estudiante.setApellido(vestudiante.txtApe.getText());
            estudiante.setCorreo(vestudiante.txtCor.getText());
            estudiante.setPrograma(vestudiante.txtPro.getText());
            
            if(modeloEst.modificar(estudiante)){
                JOptionPane.showMessageDialog(null,"Registro modificado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar");
                limpiar();
            }
        }
         
          if(e.getSource()==vestudiante.btnUpdate){
            
            estudiante.setDoc(vestudiante.txtDoc.getText());
            estudiante.setNombre(vestudiante.txtNom.getText());
            estudiante.setApellido(vestudiante.txtApe.getText());
            estudiante.setCorreo(vestudiante.txtCor.getText());
            estudiante.setPrograma(vestudiante.txtPro.getText());
            
            if(modeloEst.eliminar(estudiante)){
                JOptionPane.showMessageDialog(null,"Registro eliminado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al eliminar");
                limpiar();
            }
        }
          
           if(e.getSource()==vestudiante.btnSearch){
            
            estudiante.setDoc(vestudiante.txtDoc.getText());
            
            
            if(modeloEst.buscar(estudiante)){
                vestudiante.txtDoc.setText(estudiante.getDoc());
                vestudiante.txtNom.setText(estudiante.getNombre());
                vestudiante.txtApe.setText(estudiante.getApellido());
                vestudiante.txtCor.setText(estudiante.getCorreo());
                vestudiante.txtPro.setText(estudiante.getPrograma());
               
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el registro");
                limpiar();
            }
        }
           
           
            if(e.getSource()==vestudiante.btnKill){
              limpiar();
            }
        
    }
    
     public void limpiar() {
          
	vestudiante.txtDoc.setText(null);
	vestudiante.txtNom.setText(null);
	vestudiante.txtApe.setText(null);
	vestudiante.txtCor.setText(null);
	vestudiante.txtPro.setText(null);
    }
   
}