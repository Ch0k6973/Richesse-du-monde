import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NomJoueur extends JPanel {
	
	public Bouton bRetour = new Bouton("Retour");
	public Bouton bValider = new Bouton("Valider");
	private JTextField saisieNom = new JTextField();
	private JLabel num;
	private Color or = new Color(143, 122, 91);
	public int numJoueur = 0;
	
	public NomJoueur(int numJoueur){
		
		this.setLayout(null);
		
		Font pSaisie = new Font("OCR A Extended", Font.BOLD, 50);
		Font pNum = new Font("Arial", Font.BOLD, 50);
		Font pValider = new Font("OCR A Extended", Font.BOLD, 25);
		Font pRetour = new Font("OCR A Extended", Font.BOLD, 15);
		
		num = new JLabel("" + numJoueur + "");
		num.setFont(pNum);
		num.setForeground(or);
		num.setBounds(932, 174, 30, 40); 
		
		saisieNom.setFont(pSaisie);
		saisieNom.setPreferredSize(new Dimension(596, 86));
		saisieNom.setForeground(or);
		saisieNom.setBackground(Color.BLACK);
		saisieNom.setBounds(385, 402, 596, 86);
		saisieNom.setHorizontalAlignment(JTextField.CENTER); 
		
		bRetour.setBounds(80, 710, 100, 30);
		bRetour.setForeground(or);
		bRetour.setBackground(Color.BLACK);
		bRetour.setFont(pRetour);
		
		bValider.setFont(pValider);
		bValider.setBounds(608, 530, 150, 80);
		bValider.setForeground(or);
		bValider.setBackground(Color.BLACK);
		
		bRetour.addActionListener(new BRetourListener());
		bValider.addActionListener(new BValiderListener());
		
		this.add(saisieNom);
		this.add(bRetour);
		this.add(bValider);
		this.add(num);
		
		
		
		//System.out.println("fin nom\n");
		
	}
	
//---------------------------------------SETTER ET GETTER---------------------------------------//
	
	public String getText(){
		return saisieNom.getText();
	}
	
//-------------------------------------CONTROLE DES BOUTONS-------------------------------------//
	
	class BRetourListener implements ActionListener{	//	BOUTTON RETOUR UNIVERSELLE
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(Fenetre.getPage() - 1);
		}
	 }
	
	class BValiderListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			
		}
	 }
	
//----------------------------------------------PAINT-------------------------------------------//
	
	public void paintComponent(Graphics g){	// AFFICHAGE FOND
		try {
			Image img = ImageIO.read(new File("Textes/saisirJoueur.png"));
			g.drawImage(img, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}                
	}
}