
package vista;

import Controlador.ControlSesion;
import Modelo.Dao.UsuarioDAO;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import vista.SesionVista;

public class Splash extends JDialog{
   JPanel pizarra=new JPanel();
   private JLabel lblSplashScreen;
   private JProgressBar barraDeProgreso;
   private JLabel porcentaje;
   
   public Splash(JFrame parent, boolean modal){
        super(parent,modal);
        setSize(300,150);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        inicialize();
        setUndecorated(true); //Desaparece la barra superior de la ventana
        iniciarHilo();
    }
    
    public void inicialize(){
        lblSplashScreen=new JLabel("Welcome!!");
        lblSplashScreen.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblSplashScreen.setBounds(49, 11, 147, 22);
        getContentPane().add(lblSplashScreen);
        
        barraDeProgreso=new JProgressBar();
        barraDeProgreso.setBounds(26, 54, 229, 30);
        getContentPane().add(barraDeProgreso);
        
        porcentaje=new JLabel("0%");
        porcentaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
        porcentaje.setBounds(214, 23, 46, 14);
         getContentPane().add(porcentaje);
        
    }

    public void iniciarHilo() {
        Thread hilo=new Thread(new Runnable() {
            int x=0;
            @Override
            public void run() {
                try {
                    while(x<=100){
                        barraDeProgreso.setValue(x);
                        porcentaje.setText(x+"%");
                        x++;
                        Thread.sleep(100);
                    }
                    dispose();
                    SesionVista miSesion=new SesionVista();

                    UsuarioDAO modeloL=new UsuarioDAO();
                    ControlSesion controladorL=new ControlSesion(miSesion,modeloL); 
                    miSesion.setVisible(true);
                    
                } catch (Exception e) {
                    System.out.println("Excepcion: "+e.getMessage());
                }
            }
        });
        hilo.start();
    }
}
