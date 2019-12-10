
package vista;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SesionVista extends JFrame {
    
     public JPanel pizarra=new JPanel();
     public JLabel lblid=new JLabel("Usuario: ");
     public JLabel lblpwd=new JLabel("Contraseña: ");
     public JLabel lbllink=new JLabel("Resgistrate aqui");
     public JTextField usr=new JTextField();
     public JPasswordField pwd=new JPasswordField();
     public JButton ingresar=new JButton("Ingresar");
     public JButton cancelar=new JButton("Cancelar");
    public SesionVista(){
        cargarVentana();
 
    }
    
    public void cargarVentana(){
        setTitle("Sesion");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pizarra.setLayout(null);
        add(pizarra);
        crearEtiquetas();
        crearCajas();
        crearBotones();
        setVisible(false);
       
    }
    private void crearEtiquetas(){
        lblid.setBounds(30, 30, 100, 30);
        pizarra.add(lblid);
        lblid.setVisible(true);
        
        lblpwd.setBounds(30, 90, 100, 30);
        pizarra.add(lblpwd);
        lblpwd.setVisible(true);
        
        lbllink.setBounds(100, 210, 100, 30);
        pizarra.add(lbllink);
        lbllink.setVisible(true);
    }
    private void crearCajas(){
        usr.setBounds(130, 30, 120, 30);
        pizarra.add(usr);
        usr.setVisible(true);
        
        pwd.setBounds(130, 90, 120, 30);
        pizarra.add(pwd);
        pwd.setVisible(true);
    }
    private void crearBotones(){
        ingresar.setBounds(20, 160, 120, 30);
        pizarra.add(ingresar);
        ingresar.setVisible(true);
        
        cancelar.setBounds(150, 160, 120, 30);
        pizarra.add(cancelar);
        cancelar.setVisible(true);
    }
  
}
