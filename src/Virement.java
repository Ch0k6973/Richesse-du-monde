import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Virement extends JPanel{
	
	public Bouton bReprendre = new Bouton("");
	public Bouton bValider = new Bouton("Valider");
	private JLabel auteur;
	private JLabel somme;
	private JLabel beneficiaire;
	private JComboBox<String> combo1;
	private JComboBox<String> combo2;
	private JTextField jSomme;
	private JLabel fond;
	    
	public Virement(){
        
		setSize(230, 250); 
        setLocation(568, 259);
        this.setLayout(null);
        
        fond = new JLabel(new ImageIcon("Images/Virement.png"));
        fond.setBounds(0, 0, 230, 250);
	    
        bReprendre.setIcon(new ImageIcon("Bouton/BCroix.png"));
        bReprendre.setBounds(210, 0, 20, 20);
        
        bValider.setBounds(64, 204, 101, 30);
        
        auteur = new JLabel("Auteur");
        combo1 = new JComboBox<String>();
        
        somme = new JLabel("Somme");
        jSomme = new JTextField();
        
        beneficiaire = new JLabel("Bénéficiaire");
        combo2 = new JComboBox<String>();
        
        
        auteur.setBounds(15, 80, 80, 20);
        combo1.setBounds(115, 80, 100, 20);
        somme.setBounds(15, 121, 80, 20);
        jSomme.setBounds(115, 121, 100, 20);
        beneficiaire.setBounds(15, 162, 80, 20);
        combo2.setBounds(115, 162, 100, 20);
        
        
	    initAuteur(Partie.getNBRjoueur());
	    
	    initBeneficiaire(Partie.getNBRjoueur());
	    
	    this.add(auteur);
	    this.add(combo1);
	    this.add(somme);
	    this.add(jSomme);
	    this.add(beneficiaire);
	    this.add(combo2);
	    this.add(bReprendre);
	    this.add(bValider);
	    this.add(fond);
	    
	    bReprendre.addActionListener(new BReprendreListener());
	    bValider.addActionListener(new BValiderListener());
		
	  }
	
	public void initAuteur(int nbrJoueur) {
		
		//combo1.setPreferredSize(new Dimension(100, 20));
		
		for(int i = 1; i <= nbrJoueur; i++)
		{
			switch(i)
			{
			case 1:
			    combo1.addItem(Partie.joueur1.getNom());
			    break;
			    
			case 2:
			    combo1.addItem(Partie.joueur2.getNom());
			    break;
			    
			case 3:
				combo1.addItem(Partie.joueur3.getNom());
				break;
    
			case 4:
				combo1.addItem(Partie.joueur4.getNom());
				break;
    
			case 5:
				combo1.addItem(Partie.joueur5.getNom());
				break;
    
			case 6:
				combo1.addItem(Partie.joueur6.getNom());
				break;
			}
		}
	}
	
	public void initBeneficiaire(int nbrJoueur) {
		
		//combo2.setPreferredSize(new Dimension(100, 20));
		
		for(int i = 1; i <= nbrJoueur; i++)
		{
			switch(i)
			{
			case 1:
			    combo2.addItem(Partie.joueur1.getNom());
			    break;
			    
			case 2:
			    combo2.addItem(Partie.joueur2.getNom());
			    break;
			    
			case 3:
				combo2.addItem(Partie.joueur3.getNom());
				break;
    
			case 4:
				combo2.addItem(Partie.joueur4.getNom());
				break;
    
			case 5:
				combo2.addItem(Partie.joueur5.getNom());
				break;
    
			case 6:
				combo2.addItem(Partie.joueur6.getNom());
				break;
			}
		}
	}
	
	public void paiement() {
		
		switch(combo1.getSelectedIndex())
		{
			case 0:
				Partie.joueur1.setArgent(Partie.joueur1.getArgent() - Integer.parseInt(jSomme.getText()));
				break;
			
			case 1:
				Partie.joueur2.setArgent(Partie.joueur2.getArgent() - Integer.parseInt(jSomme.getText()));
				break;
			
			case 2:
				Partie.joueur3.setArgent(Partie.joueur3.getArgent() - Integer.parseInt(jSomme.getText()));
				break;
			
			case 3:
				Partie.joueur4.setArgent(Partie.joueur4.getArgent() - Integer.parseInt(jSomme.getText()));
				break;
			
			case 4:
				Partie.joueur5.setArgent(Partie.joueur5.getArgent() - Integer.parseInt(jSomme.getText()));
				break;
			
			case 5:
				Partie.joueur6.setArgent(Partie.joueur6.getArgent() - Integer.parseInt(jSomme.getText()));
				break;
		}
		
		switch(combo2.getSelectedIndex())
		{
			case 0:
				Partie.joueur1.setArgent(Partie.joueur1.getArgent() + Integer.parseInt(jSomme.getText()));
				break;
			
			case 1:
				Partie.joueur2.setArgent(Partie.joueur2.getArgent() + Integer.parseInt(jSomme.getText()));
				break;
			
			case 2:
				Partie.joueur3.setArgent(Partie.joueur3.getArgent() + Integer.parseInt(jSomme.getText()));
				break;
			
			case 3:
				Partie.joueur4.setArgent(Partie.joueur4.getArgent() + Integer.parseInt(jSomme.getText()));
				break;
			
			case 4:
				Partie.joueur5.setArgent(Partie.joueur5.getArgent() + Integer.parseInt(jSomme.getText()));
				break;
			
			case 5:
				Partie.joueur6.setArgent(Partie.joueur6.getArgent() + Integer.parseInt(jSomme.getText()));
				break;
		}
	}
	
	class BReprendreListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(3);
		}
	 }
	
	class BValiderListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			paiement();
			Fenetre.setPage(3);
		}
	 }
	
	
	
}