
package Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VNivelRiesgo extends JDialog {
    JPanel pizarra= new JPanel();
    JLabel lblIdr=new JLabel("Id Nivel de riesgo: ");
    JLabel lblTr=new JLabel("Tipo de riesgo: ");
 

    public JTextField txtId=new JTextField();
    public JTextField txtTr=new JTextField();

    
    public JButton btnIng=new JButton("Ingresar");
    public JButton btnMod=new JButton("Modificar");
    public JButton btnEli=new JButton("Eliminar");
    public JButton btnLimp=new JButton("Limpiar");
    public JButton btnBus=new JButton("Buscar");
    
     public VNivelRiesgo(JFrame parent, boolean modal){
        super(parent,modal);
        crearVentana(); 
    }
     
      public void crearVentana(){
        setSize(500,600);
        setLocationRelativeTo(null);
        add(pizarra);
        pizarra.setLayout(null);
        pizarra.setBackground(Color.gray);
        //Metodos componentes formulario
         crearEtiquetas();
         crearCaja();
         //crearCombo();
         crearCrud();
         
         //setVisible(true);
        
    }
      
    private void crearEtiquetas(){
        lblIdr.setBounds(50,50,100,30);
        pizarra.add(lblIdr);
        lblIdr.setVisible(true);
        
        lblTr.setBounds(50,100,100,30);
        pizarra.add(lblTr);
        lblTr.setVisible(true);
    }
       
    public void crearCaja(){
        txtId.setBounds(160, 50, 100, 30);
        pizarra.add(txtId);
        txtId.setVisible(true);
        
        txtTr.setBounds(160, 100, 100, 30);
        pizarra.add(txtTr);
        txtTr.setVisible(true);   
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
