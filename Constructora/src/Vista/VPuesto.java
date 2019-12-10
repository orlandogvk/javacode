
package Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VPuesto extends JDialog {
    JPanel pizarra= new JPanel();
    JLabel lblDoc=new JLabel("Id.Puesto: ");
    JLabel lblCod=new JLabel("Cargo: ");
    JLabel lblCed=new JLabel("Id.Nivel Riesgo: ");
    JLabel lblNom=new JLabel("Salaro minimo: ");
    JLabel lblSal=new JLabel("Salario maximo: ");


    public JTextField txtId=new JTextField();
    public JTextField txtCar=new JTextField();
    public JTextField txtNr=new JTextField();
    public JTextField txtSalmin=new JTextField();
    public JTextField txtSalmax=new JTextField();
;
        
    public JButton btnIng=new JButton("Ingresar");
    public JButton btnMod=new JButton("Modificar");
    public JButton btnEli=new JButton("Eliminar");
    public JButton btnLimp=new JButton("Limpiar");
    public JButton btnBus=new JButton("Buscar");
    
     public VPuesto(JFrame parent, boolean modal){
        super(parent,modal);
        crearVentana(); 
    }
     public void crearVentana(){
        setSize(500,600);
        setLocationRelativeTo(null);
        add(pizarra);
        pizarra.setLayout(null);
        pizarra.setBackground(Color.black);
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
        
        lblCod.setBounds(50,100,100,30);
        pizarra.add(lblCod);
        lblCod.setVisible(true);
        
        lblCed.setBounds(50,150,100,30);
        pizarra.add(lblCed);
        lblCed.setVisible(true);
        
        lblNom.setBounds(50,200,100,30);
        lblNom.add(lblNom);
        lblNom.setVisible(true);
        
        lblSal.setBounds(50,250,100,30);
        pizarra.add(lblSal);
        lblSal.setVisible(true);
        
    }
     
     
     public void crearCaja(){
        txtId.setBounds(160, 50, 100, 30);
        pizarra.add(txtId);
        txtId.setVisible(true);
        
        txtCar.setBounds(160, 100, 100, 30);
        pizarra.add(txtCar);
        txtCar.setVisible(true);
        
        txtNr.setBounds(160, 150, 100, 30);
        pizarra.add(txtNr);
        txtNr.setVisible(true);
        
        txtSalmin.setBounds(160, 200, 100, 30);
        pizarra.add(txtSalmin);
        txtSalmin.setVisible(true);
        
        txtSalmax.setBounds(160, 250, 100, 30);
        pizarra.add(txtSalmax);
        txtSalmax.setVisible(true);
       
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
