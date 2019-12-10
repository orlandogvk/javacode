
package vista;
import Controlador.ControlUsuario;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class UsuarioVista extends JDialog {
    JPanel pizarra=new JPanel();
    JLabel lblTitle=new JLabel("REGISTRO DE USUARIOS");
    JLabel lblDoc=new JLabel("Documento: ");
    JLabel lblName=new JLabel("Nombre: ");
    JLabel lblLast=new JLabel("Apellido: ");
    JLabel lblUser=new JLabel("Usuario: ");
    JLabel lblPwd=new JLabel("Constraseña: ");
    
    public JTextField txtDoc=new JTextField();
    public JTextField txtName=new JTextField();
    public JTextField txtLast=new JTextField();
    public JTextField txtuser=new JTextField();
    public JPasswordField txtPwd=new JPasswordField();
    
    
    
    public JButton btnCancel=new JButton("Cancelar");
    public JButton btnIng=new JButton("Ingresar");

    
    public UsuarioVista(JFrame parent, boolean modal){
        super(parent,modal);
          windowUser(); 
  }
 
  
  public void windowUser(){
        setSize(400,400);
        setTitle("Registro de usuario");
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(false);
        setBackground(Color.ORANGE);
        add(pizarra);
        pizarra.setLayout(null);
     
        crearlabel();
        creartextbox();
        crarArea();
        crearbuttons();
    
        //Eventos
        crearEventos();
        setVisible(true);
  }
  public void crearlabel(){
     
      lblTitle.setBounds(90, 10, 210, 30);
      lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
      pizarra.add(lblTitle);
      lblTitle.setVisible(true);
      
      lblDoc.setBounds(30, 60, 100, 30);
      lblDoc.setFont(new Font("Tahoma", Font.PLAIN, 12));
      pizarra.add(lblDoc);
      lblDoc.setVisible(true);
      
      lblName.setBounds(30, 100, 100, 30);
      lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
      pizarra.add(lblName);
      lblName.setVisible(true);
      
      lblLast.setBounds(30, 140, 100, 30);
      lblLast.setFont(new Font("Tahoma", Font.PLAIN, 12));
      pizarra.add(lblLast);
      lblLast.setVisible(true);
      
      lblUser.setBounds(30, 180, 100, 30);
      lblUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
      pizarra.add(lblUser);
      lblUser.setVisible(true);
      
      lblPwd.setBounds(30, 220, 100, 30);
      lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 12));
      pizarra.add(lblPwd);
      lblPwd.setVisible(true);
  }
  
  public void creartextbox(){
      
      txtDoc.setBounds(140, 60, 130, 30);
      pizarra.add(txtDoc);
      txtDoc.setVisible(true);
      
      txtName.setBounds(140, 100, 130, 30);
      pizarra.add(txtName);
      txtName.setVisible(true);
      
      txtLast.setBounds(140, 140, 130, 30);
      pizarra.add(txtLast);
      txtLast.setVisible(true);
      
      txtuser.setBounds(140, 180, 130, 30);
      pizarra.add(txtuser);
      txtuser.setVisible(true);
      
      txtPwd.setBounds(140, 220, 130, 30);
      pizarra.add(txtPwd);
      txtPwd.setVisible(true);
            
  }
  
  public void crarArea(){
      
  }
  
  public void crearbuttons(){
      btnIng.setBounds(40, 270, 100, 30);
      pizarra.add(btnIng);
      btnIng.setVisible(true);
      
      btnCancel.setBounds(260, 270, 100, 30);
      pizarra.add(btnCancel);
      btnCancel.setVisible(true);
  }
  
  
  
  
  //Eventos
  
  public void crearEventos(){
       btnCancel.addActionListener((ActionEvent ae) -> {
            SesionVista objSesion=new SesionVista();
            objSesion.setVisible(false);
            setVisible(false);
        }); 
       
        btnIng.addActionListener((ActionEvent ae) -> {
            ControlUsuario objU=new ControlUsuario(txtDoc.getText(),txtName.getText(),txtLast.getText(),txtuser.getText(),String.valueOf(txtPwd.getPassword()));
            objU.insertarUsuario();
            txtDoc.setText("");
            txtName.setText("");
            txtLast.setText("");
            txtuser.setText("");
            txtPwd.setText("");
            btnIng.setEnabled(false);
            txtDoc.setEnabled(false);
            txtName.setEnabled(false);
            txtLast.setEnabled(false);
            txtuser.setEnabled(false);
            txtPwd.setEnabled(false);
        });
          
  }
  
}
