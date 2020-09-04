import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Actualite extends JPanel{
	
	public Bouton bReprendre = new Bouton("");
	
	public Actualite(){
        
        setSize(308, 400); 
        setLocation(539, 174);
        this.setLayout(null);
        
        bReprendre.setBounds(288, 0, 20, 20);
        bReprendre.setIcon(new ImageIcon("Bouton/BCroix.png"));
        
        this.add(bReprendre);
		
		bReprendre.addActionListener(new BReprendreListener());
	  }
	
//--------------------------------------CONTROLE DES BOUTONS-------------------------------------//
	
	class BReprendreListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(3);
			System.out.println("breprendre de menu\n");
		}
	 }
	
//-----------------------------------------------PAINT-------------------------------------------//
	
	public void paintComponent(Graphics g){
		try {
			Image img = ImageIO.read(new File("Images/CarteActu.png"));
			g.drawImage(img, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}                
	}

}