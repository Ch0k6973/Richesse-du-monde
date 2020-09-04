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

public class NbrJoueur extends JPanel {
	
	public Bouton bRetour = new Bouton("Retour");
	public Bouton b2 = new Bouton("2");
	public Bouton b3 = new Bouton("3");
	public Bouton b4 = new Bouton("4");
	public Bouton b5 = new Bouton("5");
	public Bouton b6 = new Bouton("6");
	private Color color = new Color(143, 122, 91);
	
	public NbrJoueur(){
	
		this.setLayout(null);
		
		Font police = new Font("OCR A Extended", Font.BOLD, 25);
		Font pRetour = new Font("OCR A Extended", Font.BOLD, 15);
		
		bRetour.setBounds(80, 710, 100, 30);
		bRetour.setForeground(color);
		bRetour.setBackground(Color.BLACK);
		bRetour.setFont(pRetour);
		
		
		b2.setBounds(262, 480, 50, 50);
		b2.setForeground(color);
		b2.setBackground(Color.BLACK);
		b2.setFont(police);
		
		b3.setBounds(460, 480, 50, 50);
		b3.setForeground(color);
		b3.setBackground(Color.BLACK);
		b3.setFont(police);
		
		b4.setBounds(658, 480, 50, 50);
		b4.setForeground(color);
		b4.setBackground(Color.BLACK);
		b4.setFont(police);
		
		b5.setBounds(856, 480, 50, 50);
		b5.setForeground(color);
		b5.setBackground(Color.BLACK);
		b5.setFont(police);
		
		b6.setBounds(1054, 480, 50, 50);
		b6.setForeground(color);
		b6.setBackground(Color.BLACK);
		b6.setFont(police);
		
		b2.addActionListener(new B2Listener());
    	b3.addActionListener(new B3Listener());
    	b4.addActionListener(new B4Listener());
    	b5.addActionListener(new B5Listener());
    	b6.addActionListener(new B6Listener());
    	bRetour.addActionListener(new BRetourListener());
		
		this.add(bRetour);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		
	}
	
//-------------------------------------CONTROLE DES BOUTONS-------------------------------------//
		
	class BRetourListener implements ActionListener{	//	BOUTTON RETOUR UNIVERSELLE
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(Fenetre.getPage() - 1);
		}
	 }
	
	class B2Listener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Partie.setNBRjoueur(2);
			Fenetre.setPage(2);
		}
	 }
	
	class B3Listener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Partie.setNBRjoueur(3);
			Fenetre.setPage(2);
		}
	 }
	
	class B4Listener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Partie.setNBRjoueur(4);
			Fenetre.setPage(2);
		}
	 }
	
	class B5Listener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Partie.setNBRjoueur(5);
			Fenetre.setPage(2);
		}
	 }
	
	class B6Listener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Partie.setNBRjoueur(6);
			Fenetre.setPage(2);
		}
	 }
	
//--------------------------------------------PAINT---------------------------------------------//
	
	public void paintComponent(Graphics g){	// AFFICHAGE FOND
		try {
			Image img = ImageIO.read(new File("Textes/nbrJoueur.png"));
			g.drawImage(img, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}                
	}
}