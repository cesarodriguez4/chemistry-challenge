
package Clases;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.MouseAdapter.*;
import java.awt.event.MouseEvent;
import java.util.concurrent.*;
import java.awt.event.*;




/**
 *
 * @author Francisco Quintero
 */
public class Panel_principal extends JPanel {
    //Componentes del panel
    
    private ImageIcon fondo = new ImageIcon(getClass().getResource("/Imagenes/INICIO.png"));
    private ExecutorService threadpool;
    private JButton jugar_btn = new JButton("JUGAR");
    private JButton instrucciones_btn = new JButton("INSTRUCCIONES");
    
    
    
    public Panel_principal(){
        super();
        setLayout(null);
        jugar_btn.setBounds(250, 470, 80 , 30);
        add(jugar_btn);
        instrucciones_btn.setBounds(390, 470, 150, 30);
        add(instrucciones_btn);
        
          
        
        
    
    
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.drawImage(fondo.getImage(),0,0, getWidth(), getHeight(), this);               
        
    }
    //Zona contenedora
    
    
    
    
}
