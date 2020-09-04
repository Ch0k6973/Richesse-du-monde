import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException; 
import javax.swing.JButton;
  
public class Bouton extends JButton implements MouseListener{
	
  private String name;

  public Bouton(String str){
    super(str);
    this.name = str;
    
  this.addMouseListener(this);
  }

  /*public void paintComponent(Graphics g){
    
  }*/

  public void mouseClicked(MouseEvent event) {
    //Inutile d'utiliser cette méthode ici                      
  }

  public void mouseEntered(MouseEvent event) {
    
  }

  public void mouseExited(MouseEvent event) {
  
  }

  public void mousePressed(MouseEvent event) {
    
  }
 
  public void mouseReleased(MouseEvent event) {
                 
  }       
}