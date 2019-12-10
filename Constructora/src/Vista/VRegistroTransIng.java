
package Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VRegistroTransIng extends JDialog {
    JPanel pizarra= new JPanel();
    JLabel lblDoc=new JLabel("Id: ");
    JLabel lblCod=new JLabel("Codigo Empleado: ");
    JLabel lblIng=new JLabel("cod. Tipo Ingreso:: ");
    JLabel lblFecha=new JLabel("Fecha: ");
    JLabel lblMonto=new JLabel("Monto: ");
   

    public JTextField txtId=new JTextField();
    public JTextField txtEmp=new JTextField();
    public JTextField txtIng=new JTextField();
    public JTextField txtFecha=new JTextField();
    public JTextField txtMonto=new JTextField();

    
    public JButton btnIng=new JButton("Ingresar");
    public JButton btnMod=new JButton("Modificar");
    public JButton btnEli=new JButton("Eliminar");
    public JButton btnLimp=new JButton("Limpiar");
    public JButton btnBus=new JButton("Buscar");
    
    
    public VRegistroTransIng(JFrame parent, boolean modal) {
         super(parent,modal);
         crearVentana(); 
    }
    
    public void crearVentana(){
        setSize(500,600);
        setLocationRelativeTo(null);
        add(pizarra);
        pizarra.setLayout(null);
        pizarra.setBackground(Color.yellow);
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
        
        lblIng.setBounds(50,150,100,30);
        pizarra.add(lblIng);
        lblIng.setVisible(true);
        
        lblFecha.setBounds(50,200,100,30);
        lblFecha.add(lblFecha);
        lblFecha.setVisible(true);
        
        lblMonto.setBounds(50,250,100,30);
        pizarra.add(lblMonto);
        lblMonto.setVisible(true);
         
    }
    
    public void crearCaja(){
        txtId.setBounds(160, 50, 100, 30);
        pizarra.add(txtId);
        txtId.setVisible(true);
        
        txtEmp.setBounds(160, 100, 100, 30);
        pizarra.add(txtEmp);
        txtEmp.setVisible(true);
        
        txtIng.setBounds(160, 150, 100, 30);
        pizarra.add(txtIng);
        txtIng.setVisible(true);
        
        txtFecha.setBounds(160, 200, 100, 30);
        pizarra.add(txtFecha);
        txtFecha.setVisible(true);
        
        txtMonto.setBounds(160, 250, 100, 30);
        pizarra.add(txtMonto);
        txtMonto.setVisible(true);
                  
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

