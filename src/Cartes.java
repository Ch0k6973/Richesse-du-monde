import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

class Cartes extends JPanel{
	
	public Bouton bReprendre = new Bouton("");
	private JLabel fond;
	private JTabbedPane onglets;
	private JTabbedPane onglets1;
	private JTabbedPane onglets2;
	private JTabbedPane onglets3;
	private JTabbedPane onglets5;
	private JPanel onglet1;
	private JPanel onglet11;
	private JPanel onglet12;
	private JPanel onglet13;
	private JPanel onglet14;
	private JPanel onglet15;
	private JPanel onglet16;
	private JPanel onglet2;
	private JPanel onglet21;
	private JPanel onglet22;
	private JPanel onglet23;
	private JPanel onglet24;
	private JPanel onglet25;
	private JPanel onglet26;
	private JPanel onglet27;
	private JPanel onglet3;
	private JPanel onglet31;
	private JPanel onglet32;
	private JPanel onglet33;
	private JPanel onglet34;
	private JPanel onglet35;
	private JPanel onglet36;
	private JPanel onglet4;
	private JPanel onglet5;
	private JPanel onglet51;
	private JPanel onglet52;
	private JPanel onglet53;
	private JPanel onglet54;
	private JPanel onglet55;
	private JPanel onglet56;
	private JPanel onglet57;
	private JPanel onglet6;
	private JPanel onglet7;
	    
	    
	    
	public Cartes(){
        
		setSize(900, 500); 
        setLocation(233, 134);
        this.setLayout(null);
        
        fond = new JLabel(new ImageIcon("Images/Cartes.png"));
        fond.setBounds(0, 0, 900, 500);
        
        bReprendre.setBounds(880, 0, 20, 20);
        bReprendre.setIcon(new ImageIcon("Bouton/BCroix.png"));
        
        
        onglets = new JTabbedPane(SwingConstants.TOP);
        onglets.setBounds(20, 20, 860, 460);

      //------------------------------------AFRIQUE-------------------------------------//
        
        onglet1 = new JPanel();
	    onglets.addTab("Afrique", onglet1);
	    onglet1.setLayout(null);
	    
	    onglets1 = new JTabbedPane(SwingConstants.TOP);
        onglets1.setBounds(0, 0, 855, 432);
        
        onglet11 = new JPanel();
        onglet11.setLayout(null);
        onglets1.addTab("Afrique Centrale", onglet11);
        
        
        onglet12 = new JPanel();
        onglet12.setLayout(null);
        onglets1.addTab("Afrique du Sud", onglet12);
        
        
        onglet13 = new JPanel();
        onglet13.setLayout(null);
        onglets1.addTab("Afrique des Grands Lacs", onglet13);
        
        
        onglet14 = new JPanel();
        onglet14.setLayout(null);
        onglets1.addTab("Afrique Occidentale", onglet14);
        
        Partie.ca10.setBounds(Partie.ca10.getX(), Partie.ca10.getY(), 113, 186);
        onglet14.add(Partie.ca10);
        
        onglet15 = new JPanel();
        onglet15.setLayout(null);
        onglets1.addTab("Afrique du Nord-Est", onglet15);
        
        
        onglet16 = new JPanel();
        onglet16.setLayout(null);
        onglets1.addTab("Maghreb", onglet16);
        
        
	    onglet1.add(onglets1);
	    
	  //--------------------------------------AMERIQUES-----------------------------------------//
	    
	    onglet2 = new JPanel();
	    onglets.addTab("Amériques", onglet2);
	    onglet2.setLayout(null);
	    
	    onglets2 = new JTabbedPane(SwingConstants.TOP);
        onglets2.setBounds(0, 0, 855, 432);
        
        onglet21 = new JPanel();
        onglets2.addTab("Canada", onglet21);
	    onglet21.setLayout(null);
	    
	    Partie.ca15.setBounds(Partie.ca15.getX(), Partie.ca15.getY(), 113, 186);
	    onglet21.add(Partie.ca15);
	    
        onglet22 = new JPanel();
        onglets2.addTab("Argentine", onglet22);
	    onglet22.setLayout(null);
        onglet23 = new JPanel();
        onglets2.addTab("Brésil", onglet23);
	    onglet23.setLayout(null);
        onglet24 = new JPanel();
        onglets2.addTab("Vénézuela", onglet24);
	    onglet24.setLayout(null);
	    
	    Partie.ca7.setBounds(Partie.ca7.getX(), Partie.ca7.getY(), 113, 186);
	    onglet24.add(Partie.ca7);
	    Partie.ca8.setBounds(Partie.ca8.getX(), Partie.ca8.getY(), 113, 186);
	    onglet24.add(Partie.ca8);
	    
        onglet25 = new JPanel();
        onglets2.addTab("Mexique", onglet25);
	    onglet25.setLayout(null);
	    
	    Partie.ca17.setBounds(Partie.ca17.getX(), Partie.ca17.getY(), 113, 186);
	    onglet25.add(Partie.ca17);
	    
	    
        onglet26 = new JPanel();
        onglets2.addTab("Pays Andins", onglet26);
	    onglet26.setLayout(null);
	    
	    Partie.ca16.setBounds(Partie.ca16.getX(), Partie.ca16.getY(), 113, 186);
	    onglet26.add(Partie.ca16);
	    
        onglet27 = new JPanel();
        onglets2.addTab("Antilles", onglet27);
	    onglet27.setLayout(null);
	    onglet2.add(onglets2);
	    
	    Partie.ca9.setBounds(Partie.ca9.getX(), Partie.ca9.getY(), 113, 186);
	    onglet27.add(Partie.ca9);
	    
	  //-----------------------------------------ASIE-------------------------------------------//
	    
	    onglet3 = new JPanel();
	    onglets.addTab("Asie", onglet3);
	    onglet3.setLayout(null);
	    
	    onglets3 = new JTabbedPane(SwingConstants.TOP);
        onglets3.setBounds(0, 0, 855, 432);
        
        onglet31 = new JPanel();
        onglets3.addTab("Chine", onglet31);
	    onglet31.setLayout(null);
	    
	    Partie.ca1.setBounds(Partie.ca1.getX(), Partie.ca1.getY(), 113, 186);
	    onglet31.add(Partie.ca1);
	    
        onglet32 = new JPanel();
        onglets3.addTab("Péninsule Indienne", onglet32);
	    onglet32.setLayout(null);
        onglet33 = new JPanel();
        onglets3.addTab("Moyen Orient", onglet33);
	    onglet33.setLayout(null);
        onglet34 = new JPanel();
        onglets3.addTab("Japon", onglet34);
	    onglet34.setLayout(null);
	    
	    Partie.ca3.setBounds(Partie.ca3.getX(), Partie.ca3.getY(), 113, 186);
	    onglet34.add(Partie.ca3);
	    Partie.ca12.setBounds(Partie.ca12.getX(), Partie.ca12.getY(), 113, 186);
	    onglet34.add(Partie.ca12);
	    
        onglet35 = new JPanel();
        onglets3.addTab("Péninsule Indochinoise", onglet35);
	    onglet35.setLayout(null);
        onglet36 = new JPanel();
        onglets3.addTab("Indonésie", onglet36);
	    onglet36.setLayout(null);
	    onglet3.add(onglets3);
	    
	  //---------------------------------------ETATS UNIS---------------------------------------//
	    
	    onglet4 = new JPanel();
	    onglets.addTab("Etats-Unis", onglet4);
	    onglet4.setLayout(null);
	    
	    Partie.ca5.setBounds(Partie.ca5.getX(), Partie.ca5.getY(), 113, 186);
	    onglet4.add(Partie.ca5);
	    Partie.ca14.setBounds(Partie.ca14.getX(), Partie.ca14.getY(), 113, 186);
	    onglet4.add(Partie.ca14);
	    
	  //-----------------------------------------EUROPE-----------------------------------------//
	    
	    onglet5 = new JPanel();
	    onglets.addTab("Europe", onglet5);
	    onglet5.setLayout(null);
	    
	    onglets5 = new JTabbedPane(SwingConstants.TOP);
        onglets5.setBounds(0, 0, 855, 432);
        
        onglet51 = new JPanel();
        onglets5.addTab("France", onglet51);
	    onglet51.setLayout(null);
        onglet52 = new JPanel();
        onglets5.addTab("Scandinavie", onglet52);
	    onglet52.setLayout(null);
        onglet53 = new JPanel();
        onglets5.addTab("Allemagne Fédérale", onglet53);
	    onglet53.setLayout(null);
	    
	    Partie.ca2.setBounds(Partie.ca2.getX(), Partie.ca2.getY(), 113, 186);
	    onglet53.add(Partie.ca2);
	    
        onglet54 = new JPanel();
        onglets5.addTab("Europe Méditerranéenne", onglet54);
	    onglet54.setLayout(null);
	    
	    Partie.ca0.setBounds(Partie.ca0.getX(), Partie.ca0.getY(), 113, 186);
	    onglet54.add(Partie.ca0);
	    
        onglet55 = new JPanel();
        onglets5.addTab("Royaume-Uni", onglet55);
	    onglet55.setLayout(null);
        onglet56 = new JPanel();
        onglets5.addTab("Europe Balkanique", onglet56);
	    onglet56.setLayout(null);
        onglet57 = new JPanel();
        onglets5.addTab("Europe Danubienne", onglet57);
	    onglet57.setLayout(null);
	    onglet5.add(onglets5);
	    
	    Partie.ca6.setBounds(Partie.ca6.getX(), Partie.ca6.getY(), 113, 186);
	    onglet57.add(Partie.ca6);
	    
	  //-----------------------------------------OCEANIE----------------------------------------//
	    
	    onglet6 = new JPanel();
	    onglets.addTab("Océanie", onglet6);
	    onglet6.setLayout(null);
	    
	    Partie.ca11.setBounds(Partie.ca11.getX(), Partie.ca11.getY(), 113, 186);
	    onglet6.add(Partie.ca11);
	    Partie.ca13.setBounds(Partie.ca13.getX(), Partie.ca13.getY(), 113, 186);
	    onglet6.add(Partie.ca13);
	    
	  //-------------------------------------------URSS-----------------------------------------//
	    
	    onglet7 = new JPanel();
	    onglets.addTab("URSS", onglet7);
	    onglet7.setLayout(null);
	    
	    Partie.ca4.setBounds(Partie.ca4.getX(), Partie.ca4.getY(), 113, 186);
	    onglet7.add(Partie.ca4);
	    
	    onglets.setOpaque(true);
	    this.add(onglets);
	    this.add(bReprendre);
	    this.add(fond);
	    
	    bReprendre.addActionListener(new BReprendreListener());
		
	  }
	
	class BReprendreListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(3);
		}
	 }
	
	
	
}