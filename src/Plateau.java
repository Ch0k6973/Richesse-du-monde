import java.awt.Color;
import java.awt.Font;
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
import javax.swing.SwingConstants;

public class Plateau extends JPanel {

	public Bouton bMenu = new Bouton("Menu");
	public static Bouton bActualite = new Bouton("");
	private static boolean actu = false;
	public static Bouton bJoker = new Bouton("");
	private static boolean joker = false;
	
	private static int desRouge = 0;
	private static int desBlanc = 0;
	
	public Bouton bjetD = new Bouton("Dés");
	public Bouton bvirement = new Bouton("Virements");
	public Bouton bcartes = new Bouton("Cartes");
	private JLabel joueur1;
	private JLabel joueur2;
	private JLabel joueur3;
	private JLabel joueur4;
	private JLabel joueur5;
	private JLabel joueur6;
	private JLabel pion1;
	private JLabel pion2;
	private JLabel pion3;
	private JLabel pion4;
	private JLabel pion5;
	private JLabel pion6;
	private JLabel actif;
	private JLabel chiffre;

	private Color or = new Color(143, 122, 91);
	
	public Plateau(){
		
		this.setLayout(null);
		
		bMenu.addActionListener(new BMenuListener());
		bActualite.addActionListener(new BActuListener());
		bJoker.addActionListener(new BJokerListener());
		bjetD.addActionListener(new BJetDListener());
		bvirement.addActionListener(new BVirementListener());
		bcartes.addActionListener(new BCartesListener());
		
		afficherNomJoueur(Partie.getActif());
		
		masquerCouleurJoueur();
		
		afficherArgentJoueur();
		
		afficherPionJoueur();
		
		pActif();
		
		afficherBouton();
		
	}
		
	//------------------------------------AFFICHAGE PLATEAU-------------------------------------//
	
	public void afficherNomJoueur(int actif) {
		
		Font pJoueur = new Font("OCR A Extended", Font.BOLD, 20);
		
		for(int i = 1; i <= Partie.getNBRjoueur(); i++)
		{
			switch(i)
			{
			case 1:
		
				joueur1 = new JLabel("" + Partie.joueur1.getNom() + "");
				joueur1.setFont(pJoueur);
				if(actif == i)
				{
					joueur1.setForeground(Color.green);
				}
				else {
					joueur1.setForeground(Color.white);
				}
				joueur1.setBounds(10, 9, 209, 30);
				joueur1.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur1.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur1);
				break;
				
			case 2:
			
				joueur2 = new JLabel("" + Partie.joueur2.getNom() + "");
				joueur2.setFont(pJoueur);
				if(actif == i)
				{
					joueur2.setForeground(Color.green);
				}
				else {
					joueur2.setForeground(Color.white);
				}
				joueur2.setBounds(1147, 10, 209, 30);
				joueur2.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur2.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur2);
				break;
				
			case 3:
		
				joueur3 = new JLabel("" + Partie.joueur3.getNom() + "");
				joueur3.setFont(pJoueur);
				if(actif == i)
				{
					joueur3.setForeground(Color.green);
				}
				else {
					joueur3.setForeground(Color.white);
				}
				joueur3.setBounds(10, 311, 209, 30);
				joueur3.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur3.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur3);
				break;
				
			case 4:
		
				joueur4 = new JLabel("" + Partie.joueur4.getNom() + "");
				joueur4.setFont(pJoueur);
				if(actif == i)
				{
					joueur4.setForeground(Color.green);
				}
				else {
					joueur4.setForeground(Color.white);
				}
				joueur4.setBounds(1147, 311, 209, 30);
				joueur4.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur4.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur4);
				break;
				
			case 5:
		
				joueur5 = new JLabel("" + Partie.joueur5.getNom() + "");
				joueur5.setFont(pJoueur);
				if(actif == i)
				{
					joueur5.setForeground(Color.green);
				}
				else {
					joueur5.setForeground(Color.white);
				}
				joueur5.setBounds(10, 614, 209, 30);
				joueur5.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur5.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur5);
				break;
				
			case 6:
			
				joueur6 = new JLabel("" + Partie.joueur6.getNom() + "");
				joueur6.setFont(pJoueur);
				if(actif == i)
				{
					joueur6.setForeground(Color.green);
				}
				else {
					joueur6.setForeground(Color.white);
				}
				joueur6.setBounds(1147, 616, 209, 30);
				joueur6.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur6.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur6);
				break;
			}
		}
		
	}
	
	public void masquerCouleurJoueur() {
		
		for(int i = 6; i > Partie.getNBRjoueur(); i--)
		{
			switch(i)
			{
			case 1:
		
				joueur1 = new JLabel(new ImageIcon("Images/CacheCouleur.png"));
				joueur1.setBounds(10, 50, 209, 102);
				this.add(joueur1);
				break;
				
			case 2:
			
				joueur2 = new JLabel(new ImageIcon("Images/CacheCouleur.png"));
				joueur2.setBounds(1146, 50, 210, 104);
				this.add(joueur2);
				break;
				
			case 3:
		
				joueur3 = new JLabel(new ImageIcon("Images/CacheCouleur.png"));
				joueur3.setBounds(10, 351, 210, 104);
				this.add(joueur3);
				break;
				
			case 4:
		
				joueur4 = new JLabel(new ImageIcon("Images/CacheCouleur.png"));
				joueur4.setBounds(1142, 351, 214, 106);
				this.add(joueur4);
				break;
				
			case 5:
		
				joueur5 = new JLabel(new ImageIcon("Images/CacheCouleur.png"));
				joueur5.setBounds(10, 654, 210, 104); 
				this.add(joueur5);
				break;
				
			case 6:
			
				joueur6 = new JLabel(new ImageIcon("Images/CacheCouleur.png"));
				joueur6.setBounds(1147, 656, 209, 102);
				this.add(joueur6);
				break;
			}
		}
		
	}
	
	public void afficherArgentJoueur() {
		
		Font pArgent = new Font("OCR A Extended", Font.BOLD, 17);
		
		for(int i = 1; i <= Partie.getNBRjoueur(); i++)
		{
			switch(i)
			{
			case 1:
		
				joueur1 = new JLabel("" + Partie.joueur1.argentString() + " F");
				joueur1.setFont(pArgent);
				joueur1.setForeground(Color.white);
				joueur1.setBounds(43, 94, 144, 17);
				joueur1.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur1.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur1);
				break;
				
			case 2:
			
				joueur2 = new JLabel("" + Partie.joueur2.argentString() + " F");
				joueur2.setFont(pArgent);
				joueur2.setForeground(Color.white);
				joueur2.setBounds(1180, 95, 143, 17);
				joueur2.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur2.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur2);
				break;
				
			case 3:
		
				joueur3 = new JLabel("" + Partie.joueur3.argentString() + " F");
				joueur3.setFont(pArgent);
				joueur3.setForeground(Color.white);
				joueur3.setBounds(44, 396, 144, 16);
				joueur3.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur3.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur3);
				break;
				
			case 4:
		
				joueur4 = new JLabel("" + Partie.joueur4.argentString() + " F");
				joueur4.setFont(pArgent);
				joueur4.setForeground(Color.white);
				joueur4.setBounds(1177, 392, 146, 16);
				joueur4.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur4.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur4);
				break;
				
			case 5:
		
				joueur5 = new JLabel("" + Partie.joueur5.argentString() + " F");
				joueur5.setFont(pArgent);
				joueur5.setForeground(Color.white);
				joueur5.setBounds(44, 697, 144, 16);
				joueur5.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur5.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur5);
				break;
				
			case 6:
			
				joueur6 = new JLabel("" + Partie.joueur6.argentString() + " F");
				joueur6.setFont(pArgent);
				joueur6.setForeground(Color.white);
				joueur6.setBounds(1180, 699, 144, 17);
				joueur6.setHorizontalAlignment(SwingConstants.CENTER); 
				joueur6.setVerticalAlignment(SwingConstants.CENTER); 
				this.add(joueur6);
				break;
			}
		}
		
	}

	public void afficherBouton() {
	
		
		Font pMenu = new Font("OCR A Extended", Font.BOLD, 25);
		Font pAction = new Font("OCR A Extended", Font.BOLD, 17);
        
		bMenu.setFont(pMenu);
        bMenu.setForeground(or);
        bMenu.setBackground(Color.black);
		bMenu.setBounds(633, 10, 100, 40);
		
		bActualite.setIcon(new ImageIcon("Bouton/Actualite.png"));
		bActualite.setBounds(497, 449, 105, 82);
		
		bJoker.setIcon(new ImageIcon("Bouton/Joker.png"));
		bJoker.setBounds(797, 449, 97, 82);
		
		bjetD.setFont(pAction);
		bjetD.setForeground(or);
        bjetD.setBackground(Color.black);
        bjetD.setBounds(478, 717, 100, 40);
        
        bvirement.setFont(pAction);
        bvirement.setForeground(or);
        bvirement.setBackground(Color.black);
        bvirement.setBounds(608, 717, 150, 40);
        
        bcartes.setFont(pAction);
        bcartes.setForeground(or);
        bcartes.setBackground(Color.black);
        bcartes.setBounds(788, 717, 100, 40);
		
		
		this.add(bMenu);
		if(actu) {this.add(bActualite);}
		if(joker) {this.add(bJoker);}
		this.add(bjetD);
		this.add(bvirement);
		this.add(bcartes);
		
	}
		
	public void afficherPionJoueur() {
		
		for(int i = 1; i <= Partie.getNBRjoueur(); i++)
		{
			switch(i)
			{
				case 1:
					Partie.joueur1.convertisseur(Partie.joueur1.getPos());
					if(Partie.getActif() == i)
					{
						
						actif = new JLabel(new ImageIcon("Images/Actif.png"));
						actif.setBounds(Partie.joueur1.getPionX() - 6, Partie.joueur1.getPionY() - 2, 25, 25);
						this.add(actif);
						
					}
					pion1 = new JLabel(new ImageIcon("Images/turquoise.png"));
					pion1.setBounds(Partie.joueur1.getPionX(), Partie.joueur1.getPionY(), 12, 20);
					this.add(pion1);
					break;
				
				case 2:
					Partie.joueur2.convertisseur(Partie.joueur2.getPos());
					if(Partie.getActif() == i)
					{
						
						actif = new JLabel(new ImageIcon("Images/Actif.png"));
						actif.setBounds(Partie.joueur2.getPionX() - 6, Partie.joueur2.getPionY() - 2, 25, 25);
						this.add(actif);
						
					}
					pion2 = new JLabel(new ImageIcon("Images/rouge.png"));
					pion2.setBounds(Partie.joueur2.getPionX(), Partie.joueur2.getPionY(), 12, 20);
					this.add(pion2);
					break;
					
				case 3:
					Partie.joueur3.convertisseur(Partie.joueur3.getPos());
					if(Partie.getActif() == i)
					{
						
						actif = new JLabel(new ImageIcon("Images/Actif.png"));
						actif.setBounds(Partie.joueur3.getPionX() - 6, Partie.joueur3.getPionY() - 2, 25, 25);
						this.add(actif);
						
					}
					pion3 = new JLabel(new ImageIcon("Images/jaune.png"));
					pion3.setBounds(Partie.joueur3.getPionX(), Partie.joueur3.getPionY(), 12, 20);
					this.add(pion3);
					break;
					
				case 4:
					Partie.joueur4.convertisseur(Partie.joueur4.getPos());
					if(Partie.getActif() == i)
					{
						
						actif = new JLabel(new ImageIcon("Images/Actif.png"));
						actif.setBounds(Partie.joueur4.getPionX() - 6, Partie.joueur4.getPionY() - 2, 25, 25);
						this.add(actif);
						
					}
					pion4 = new JLabel(new ImageIcon("Images/vert.png"));
					pion4.setBounds(Partie.joueur4.getPionX(), Partie.joueur4.getPionY(), 12, 20);
					this.add(pion4);
					break;
					
				case 5:
					Partie.joueur5.convertisseur(Partie.joueur5.getPos());
					if(Partie.getActif() == i)
					{
						
						actif = new JLabel(new ImageIcon("Images/Actif.png"));
						actif.setBounds(Partie.joueur5.getPionX() - 6, Partie.joueur5.getPionY() - 2, 25, 25);
						this.add(actif);
						
					}
					pion5 = new JLabel(new ImageIcon("Images/bordeaux.png"));
					pion5.setBounds(Partie.joueur5.getPionX(), Partie.joueur5.getPionY(), 12, 20);
					this.add(pion5);
					break;
					
				case 6:
					Partie.joueur6.convertisseur(Partie.joueur6.getPos());
					if(Partie.getActif() == i)
					{
						
						actif = new JLabel(new ImageIcon("Images/Actif.png"));
						actif.setBounds(Partie.joueur6.getPionX() - 6, Partie.joueur6.getPionY() - 2, 25, 25);
						this.add(actif);
						
					}
					pion6 = new JLabel(new ImageIcon("Images/bleu.png"));
					pion6.setBounds(Partie.joueur6.getPionX(), Partie.joueur6.getPionY(), 12, 20);
					this.add(pion6);
					break;
					
			}
		}
	}

	public void pActif() {
		
		switch(Partie.getActif())
		{
		case 1:
			Partie.getEvent(Partie.joueur1.getPos());
			break;
		case 2:
			Partie.getEvent(Partie.joueur2.getPos());
			break;
		case 3:
			Partie.getEvent(Partie.joueur3.getPos());
			break;
		case 4:
			Partie.getEvent(Partie.joueur4.getPos());
			break;
		case 5:
			Partie.getEvent(Partie.joueur5.getPos());
			break;
		case 6:
			Partie.getEvent(Partie.joueur6.getPos());
			break;
		}
	}

	
	//----------------------------------CONTROLE DES BOUTONS------------------------------------//
	
	class BMenuListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(4);
		}
	 }
	
	class BActuListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(5);
		}
	 }
	
	class BJokerListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(6);
		}
	 }
	
	class BJetDListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Partie.setActif(Partie.getActif() + 1);
			Partie.lanceDes();
		}
	 }
	
	class BVirementListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(7);
		}
	 }
	
	class BCartesListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(8);
		}
	 }
	
	//-----------------------------------SETTER AND GETTER--------------------------------------//
	
	public static void setJoker(boolean choix) {
		joker = choix;
	}
	
	public static void setActu(boolean choix) {
		actu = choix;
	}
	
	public static void setDesBlanc(int choix) {
		desBlanc = choix;
	}

	public static void setDesRouge(int choix) {
		desRouge = choix;
	}
	
	//------------------------------------------PAINT-------------------------------------------//
	
	public void paintComponent(Graphics g){	// AFFICHAGE FOND
		try {
			Image img = ImageIO.read(new File("Images/Plateau.png"));
			g.drawImage(img, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}                
	}
}
