
package Vista;

import Controlador.CEmpleado;
import Modelo.Bin.Empleado;
import Modelo.DAO.EmpleadoDAO;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu {

     public JFrame objVentana = new JFrame("CONSTRUCTORA");
        public JPanel pizarra=new JPanel();
        public JMenuBar barra = new JMenuBar();

        public JMenu mnRH = new JMenu("Recursos Humanos");
        
        public JMenu mnSalir= new JMenu("Salir");
        
        public JMenuItem mnEmpleados = new JMenuItem("Gestion de Empleados");
        public JMenuItem mnDepto = new JMenuItem("Departamento");
        public JMenuItem mnNivelR = new JMenuItem("Nivel de Riesgo");
        public JMenuItem mnPuesto = new JMenuItem("Puesto");
        public JMenuItem mnRegIng = new JMenuItem("Registro Ingresos");
        public JMenuItem mnRegRed = new JMenuItem("Registro Reducciones");
        public JMenuItem mnRegDed = new JMenuItem("Registro Deducciones");
        public JMenuItem mnRegTIng = new JMenuItem("Registro Tipo de Ingreso");
        
         
   
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
        mnRH.add(mnEmpleados);
        mnRH.add(mnDepto);
        mnRH.add(mnNivelR);
        mnRH.add(mnPuesto);
        mnRH.add(mnRegIng);
        mnRH.add(mnRegRed);
        mnRH.add(mnRegDed);
        mnRH.add(mnRegTIng);
        mnSalir.add(mnSalida);
        
        barra.add(mnRH);
        barra.add(mnSalir);
    }
     
      public void crearEventos(){
         mnSalida.addActionListener((ActionEvent ae) -> {
              System.exit(0);
        });
         
         mnEmpleados.addActionListener((ActionEvent ae) -> {
              Empleado empleado=new Empleado();
              EmpleadoDAO empmodelo=new EmpleadoDAO();
              VEmpleado objEmp=new VEmpleado(objVentana,true);
              CEmpleado ctrle=new CEmpleado(empleado,empmodelo,objEmp);
              ctrle.iniciar();
              objEmp.setVisible(true);
        });
         
         mnDepto.addActionListener((ActionEvent ae) -> {
              ProductoVista objProducto=new ProductoVista();
        });
         
    }
     
    
}
