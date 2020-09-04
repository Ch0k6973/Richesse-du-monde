import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Accueil extends JPanel {
	
	public Bouton bQuit = new Bouton("Quitter");
	public Bouton bPlay = new Bouton("Jouer");
	
	private Color or = new Color(143, 122, 91);
	
	public Accueil(){
	
		this.setLayout(null);
		
		Font pAccueil = new Font("OCR A Extended", Font.BOLD, 20);
		
		bQuit.setFont(pAccueil);
		bQuit.setForeground(or);
		bQuit.setBounds(220, 388, 125, 75);
		
		bPlay.setFont(pAccueil);
		bPlay.setForeground(or);
		bPlay.setBounds(990, 388, 125, 75);
		
		bQuit.addActionListener(new BQuitListener());
        bPlay.addActionListener(new BPlayListener());
        
		this.add(bQuit);
		this.add(bPlay);
		
	}
		
//--------------------------------------CONTROLE DES BOUTONS-------------------------------------//
	
	class BQuitListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setQuitter(true);
		}
	 }
	
	class BPlayListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(1);
		}
	 }
	
//--------------------------------------------PAINT----------------------------------------------//
	
	public void paintComponent(Graphics g){	// AFFICHAGE FOND
		try {
			Image img = ImageIO.read(new File("Images/Fond.png"));
			g.drawImage(img, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}                
	}
	
}

