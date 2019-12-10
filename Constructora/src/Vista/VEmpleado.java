
package Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VEmpleado extends JDialog {
    JPanel pizarra= new JPanel();
    JLabel lblDoc=new JLabel("Id: ");
    JLabel lblCod=new JLabel("Codigo: ");
    JLabel lblCed=new JLabel("Cedula: ");
    JLabel lblNom=new JLabel("Nombre: ");
    JLabel lblSal=new JLabel("Salario: ");
    JLabel lblArea=new JLabel("Area: ");

    public JTextField txtId=new JTextField();
    public JTextField txtCod=new JTextField();
    public JTextField txtCed=new JTextField();
    public JTextField txtNom=new JTextField();
    public JTextField txtSal=new JTextField();
    public JTextField txtArea=new JTextField();
    
    public JButton btnIng=new JButton("Ingresar");
    public JButton btnMod=new JButton("Modificar");
    public JButton btnEli=new JButton("Eliminar");
    public JButton btnLimp=new JButton("Limpiar");
    public JButton btnBus=new JButton("Buscar");

    public VEmpleado(JFrame parent, boolean modal) {
         super(parent,modal);
         crearVentana(); 
    }
    
     public void crearVentana(){
        setSize(500,600);
        setLocationRelativeTo(null);
        add(pizarra);
        pizarra.setLayout(null);
        pizarra.setBackground(Color.orange);
        //Metodos componentes formulario
         crearEtiquetas();
         crearCaja();
         //crearCombo();
         crearCrud();
         
         //setVisible(true);
        
    }
     
     private void crearEtiquetas(){
        lblDoc.setBounds(50,50,100,30);
        pizarra.add(lblDoc);
        lblDoc.setVisible(true);
        
        lblNom.setBounds(50,100,100,30);
        pizarra.add(lblNom);
        lblNom.setVisible(true);
        
        lblCed.setBounds(50,150,100,30);
        pizarra.add(lblCed);
        lblCed.setVisible(true);
        
        lblNom.setBounds(50,200,100,30);
        lblNom.add(lblNom);
        lblNom.setVisible(true);
        
        lblSal.setBounds(50,250,100,30);
        pizarra.add(lblSal);
        lblSal.setVisible(true);
        
        lblArea.setBounds(50,300,100,30);
        pizarra.add(lblArea);
        lblArea.setVisible(true);
         
    }
     
     public void crearCaja(){
        txtId.setBounds(160, 50, 100, 30);
        pizarra.add(txtId);
        txtId.setVisible(true);
        
        txtCod.setBounds(160, 100, 100, 30);
        pizarra.add(txtCod);
        txtCod.setVisible(true);
        
        txtCed.setBounds(160, 150, 100, 30);
        pizarra.add(txtCed);
        txtCed.setVisible(true);
        
        txtNom.setBounds(160, 200, 100, 30);
        pizarra.add(txtNom);
        txtNom.setVisible(true);
        
        txtSal.setBounds(160, 250, 100, 30);
        pizarra.add(txtSal);
        txtSal.setVisible(true);
        
        txtArea.setBounds(160, 300, 100, 30);
        pizarra.add(txtArea);
        txtArea.setVisible(true);
           
    }
     
      public void crearCrud(){
      
        btnIng.setBounds(20, 350, 100, 30);
        pizarra.add(btnIng);
        btnIng.setVisible(true);
        
        btnMod.setBounds(130, 350, 100, 30);
        pizarra.add(btnMod);
        btnMod.setVisible(true);
        
        btnEli.setBounds(240, 350, 100, 30);
        pizarra.add(btnEli);
        btnEli.setVisible(true);
        
        btnLimp.setBounds(350, 350, 100, 30);
        pizarra.add(btnLimp);
        btnLimp.setVisible(true);
        
        btnBus.setBounds(280, 50, 100, 30);
        pizarra.add(btnBus);
        btnBus.setVisible(true);
        
    }
     
    
    
}
