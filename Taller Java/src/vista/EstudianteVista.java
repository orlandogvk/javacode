
package vista;
import Controlador.ControlEstudiante;
import Modelo.Dao.EstudianteDAO;
import Modelo.Estudiante;
import java.awt.Color;
import javax.swing.JButton;
//import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class EstudianteVista extends JDialog{
    
    JPanel pizarra= new JPanel();
    JLabel lblDoc=new JLabel("Documento: ");
    JLabel lblNom=new JLabel("Nombre: ");
    JLabel lblApe=new JLabel("Apellido: ");
    JLabel lblEma=new JLabel("Correo: ");
    JLabel lblProg=new JLabel("Programa: ");
  
    
   // JComboBox cmbProg=new JComboBox ();
    
    public JTextField txtDoc=new JTextField();
    public JTextField txtNom=new JTextField();
    public JTextField txtApe=new JTextField();
    public JTextField txtCor=new JTextField();
    public JTextField txtPro=new JTextField();
    
    public JButton btnNew=new JButton("Ingresar");
    public JButton btnMk=new JButton("Modificar");
    public JButton btnUpdate=new JButton("Eliminar");
    public JButton btnKill=new JButton("Limpiar");
    public JButton btnSearch=new JButton("Buscar");
    

    
    //Campo de texto para consultar
    public JTextField txtBus=new JTextField();
    public EstudianteVista(JFrame parent, boolean modal){
        super(parent,modal);
        crearVentana();
       
    }
  
    public void crearVentana(){
        setSize(500,600);
        setLocationRelativeTo(null);
        add(pizarra);
        pizarra.setLayout(null);
        pizarra.setBackground(Color.red);
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
        
        lblApe.setBounds(50,150,100,30);
        pizarra.add(lblApe);
        lblApe.setVisible(true);
        
        lblEma.setBounds(50,200,100,30);
        pizarra.add(lblEma);
        lblEma.setVisible(true);
        
        lblProg.setBounds(50,250,100,30);
        pizarra.add(lblProg);
        lblProg.setVisible(true);
         
    }
    
     public void crearCaja(){
        txtDoc.setBounds(160, 50, 100, 30);
        pizarra.add(txtDoc);
        txtDoc.setVisible(true);
        
        txtNom.setBounds(160, 100, 100, 30);
        pizarra.add(txtNom);
        txtNom.setVisible(true);
        
        txtApe.setBounds(160, 150, 100, 30);
        pizarra.add(txtApe);
        txtApe.setVisible(true);
         
        txtCor.setBounds(160, 200, 100, 30);
        pizarra.add(txtCor);
        txtCor.setVisible(true); 
        
        txtPro.setBounds(160, 250, 100, 30);
        pizarra.add(txtPro);
        txtPro.setVisible(true); 
        
    }
     /*
      public void crearCombo(){
        cmbProg.setBounds(160, 250, 200, 30);
        cmbProg.addItem("Escoge una opcion...");
        cmbProg.addItem("1. ADSI");
        cmbProg.addItem("2. Contabilidad");
        cmbProg.addItem("3. Marroquieria");
        pizarra.add(cmbProg);
        cmbProg.setVisible(true);
    }
      */
      public void crearCrud(){
      
        btnNew.setBounds(20, 350, 100, 30);
        pizarra.add(btnNew);
        btnNew.setVisible(true);
        
        btnMk.setBounds(130, 350, 100, 30);
        pizarra.add(btnMk);
        btnMk.setVisible(true);
        
        btnUpdate.setBounds(240, 350, 100, 30);
        pizarra.add(btnUpdate);
        btnUpdate.setVisible(true);
        
        btnKill.setBounds(350, 350, 100, 30);
        pizarra.add(btnKill);
        btnKill.setVisible(true);
        
        btnSearch.setBounds(280, 50, 100, 30);
        pizarra.add(btnSearch);
        btnSearch.setVisible(true);
        
    }
     
 
         
          
   
     
   
}
