
package Controlador;

import Modelo.Dao.UsuarioDAO;
import Modelo.Usuario;
import java.awt.event.*;
import javax.swing.JOptionPane;
import vista.Menu;
import vista.SesionVista;
import vista.UsuarioVista;



public class ControlSesion implements ActionListener {
    SesionVista vsesion=new SesionVista();
    UsuarioDAO modelosesion=new UsuarioDAO();
    Usuario usuario=new Usuario();

    public ControlSesion(SesionVista vistaSesion,UsuarioDAO modeloSesion) {
        this.vsesion=vistaSesion;
        this.modelosesion=modeloSesion;
        this.vsesion.ingresar.addActionListener(this);
        addEventoCancel();
        eventOyenteRaton();
    }
    
    public void InicializarSesion(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String id=vsesion.usr.getText();
        String contraseña=String.valueOf(vsesion.pwd.getPassword());
        usuario=modelosesion.verificaUsuario(id, contraseña);
        
        if(usuario==null){
            JOptionPane.showMessageDialog(vsesion,"Usuario con los datos ingresados no encontrado");
        }else{
            JOptionPane.showMessageDialog(vsesion,"Datos correctos");
            Menu objmenu=new Menu();
            vsesion.setVisible(false);
           
        }
        
    }
    
    public void addEventoCancel() {
		ActionListener oyente = (ActionEvent ae) -> {
                 System.exit(0);
                };
		vsesion.cancelar.addActionListener(oyente);
	}
  public void eventOyenteRaton(){
          //Agregando oyente de raton-Mouse Listener
          MouseListener oyenteRaton= new MouseListener() {

              @Override
              public void mouseClicked(MouseEvent e) {
                 SesionVista obj4= new SesionVista();
                 UsuarioVista obj2=new UsuarioVista(obj4,true);
                 obj4.setVisible(false);
              }

              @Override
              public void mousePressed(MouseEvent e) {
                 
              }

              @Override
              public void mouseReleased(MouseEvent e) {
                
              }

              @Override
              public void mouseEntered(MouseEvent e) {
                              }

              @Override
              public void mouseExited(MouseEvent e) {
                  
              }
          };
          vsesion.lbllink.addMouseListener(oyenteRaton);
          
      }
        public void lblinkMouseClicked(MouseEvent evt){
            
        }
    
}
