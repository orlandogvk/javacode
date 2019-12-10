
package Controlador;

import Modelo.Bin.Usuario;
import Modelo.DAO.UsuarioDAO;
import Vista.Menu;
import Vista.VSesion;
import Vista.VUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


public class CSesion implements ActionListener {
    VSesion vsesion=new VSesion();
    UsuarioDAO usuarioDAO=new UsuarioDAO();
    Usuario usuario=new Usuario();
    public void InicializarSesion(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         String id=vsesion.usr.getText();
        String contraseña=String.valueOf(vsesion.pwd.getPassword());
        usuario=usuarioDAO.verificaUsuario(id, contraseña);
        
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
                 VSesion obj4= new VSesion();
                 VUsuario obj2=new VUsuario(obj4,true);
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
