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

class Joker extends JPanel{
	
	
	public Bouton bReprendre = new Bouton("");
	public Bouton bAchat = new Bouton("Acheter");
	private JLabel fond;
	
	public Joker(){
        
		setSize(311, 460); 
        setLocation(537, 184);
        this.setLayout(null);
        
        bReprendre.setBounds(291, 0, 20, 20);
        bReprendre.setIcon(new ImageIcon("Bouton/BCroix.png"));
        
        bAchat.setBounds(105, 410, 100, 50);
        
        fond = new JLabel(new ImageIcon("Images/CarteJoker.png"));
        fond.setVerticalAlignment(JLabel.CENTER);
        fond.setHorizontalAlignment(JLabel.CENTER);
        
        this.add(bReprendre);
        this.add(bAchat);
		this.add(fond);
		
		bReprendre.addActionListener(new BReprendreListener());
		bAchat.addActionListener(new BAcheterListener());
		
	  }
	
	public void achat(int choix) {
		
		switch(choix)
		{
			case 1:
				if(Partie.joueur1.getJoker() == false)
				{
					Partie.joueur1.setArgent(Partie.joueur1.getArgent() - 3000000);
					Partie.joueur1.setJoker(true);
				}
				break;
			
			case 2:
				if(Partie.joueur2.getJoker() == false)
				{
					Partie.joueur2.setArgent(Partie.joueur2.getArgent() - 3000000);
					Partie.joueur2.setJoker(true);
				}
				break;
			
			case 3:
				if(Partie.joueur3.getJoker() == false)
				{
					Partie.joueur3.setArgent(Partie.joueur3.getArgent() - 3000000);
					Partie.joueur3.setJoker(true);
				}
				break;
			
			case 4:
				if(Partie.joueur4.getJoker() == false)
				{
					Partie.joueur4.setArgent(Partie.joueur4.getArgent() - 3000000);
					Partie.joueur4.setJoker(true);
				}
				break;
			
			case 5:
				if(Partie.joueur5.getJoker() == false)
				{
					Partie.joueur5.setArgent(Partie.joueur5.getArgent() - 3000000);
					Partie.joueur5.setJoker(true);
				}
				break;
			
			case 6:
				if(Partie.joueur6.getJoker() == false)
				{
					Partie.joueur6.setArgent(Partie.joueur6.getArgent() - 3000000);
					Partie.joueur6.setJoker(true);
				}
				break;
		}
	}
	
//-------------------------------------CONTROLE DES BOUTONS--------------------------------------//
	
	class BReprendreListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(3);
		}
	 }
	
	class BAcheterListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			achat(Partie.getActif());
			Fenetre.setPage(3);
		}
	 }
	
//---------------------------------------------PAINT---------------------------------------------//
	
	public void paintComponent(Graphics g){
		try {
			Image img = ImageIO.read(new File("Images/CarteJoker.png"));
			g.drawImage(img, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}                
	}

}