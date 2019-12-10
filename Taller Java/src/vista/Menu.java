
package vista;


import Controlador.ControlEstudiante;
import Modelo.Dao.EstudianteDAO;
import Modelo.Estudiante;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Menu {
        public JFrame objVentana = new JFrame("SENA");
        public JPanel pizarra=new JPanel();
        public JMenuBar barra = new JMenuBar();

        public JMenu mnEstudiante = new JMenu("Estudiante");
        public JMenu mnProducto = new JMenu("Producto");
        public JMenu mnSalir= new JMenu("Salir");
        
        public JMenuItem mnEstudiantes = new JMenuItem("Gestion de Estudiantes");
        public JMenuItem mnProductos = new JMenuItem("Gestion de Productos");
        public JMenuItem mnSalida = new JMenuItem("Cerrar");
        
    public Menu() {
        crearventana();
    }
    
    public void crearventana(){
        objVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objVentana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        objVentana.setSize(600, 600);
        objVentana.setJMenuBar(barra);
        objVentana.add(pizarra);
        crearMenu();
        crearEventos();
        objVentana.setVisible(true);
    }
    
    public void crearMenu(){
        mnEstudiante.add(mnEstudiantes);
        mnProducto.add(mnProductos);
        mnSalir.add(mnSalida);
        
        barra.add(mnEstudiante);
        barra.add(mnProducto);
        barra.add(mnSalir);
    }
    
    public void crearEventos(){
         mnSalida.addActionListener((ActionEvent ae) -> {
              System.exit(0);
        });
         
         mnEstudiantes.addActionListener((ActionEvent ae) -> {
              Estudiante estudiante=new Estudiante();
              EstudianteDAO estmodelo=new EstudianteDAO();
              EstudianteVista objEstudiante=new EstudianteVista(objVentana,true);
              ControlEstudiante ctrle=new ControlEstudiante(estudiante,estmodelo,objEstudiante);
              ctrle.iniciar();
              objEstudiante.setVisible(true);
        });
         
         mnProductos.addActionListener((ActionEvent ae) -> {
              ProductoVista objProducto=new ProductoVista();
        });
         
    }
    
}
