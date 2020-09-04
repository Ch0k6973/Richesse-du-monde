import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
		
		
	
	private Accueil accueil;
	private NbrJoueur nbrJoueur;
	private NomJoueur nomJoueur;
	private Plateau plateau;
	private Menu menu;
	private Actualite actualite;
	private Joker joker;
	private Virement virement;
	private Cartes cartes;
	private Partie partie;
	
	private static boolean continuer = true;
	private static boolean quitter = false;
	private static int page = 0;
	
	
	public Fenetre(){    
		
		this.setTitle("Richesses du monde");
		this.setSize(1366, 768);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app();
    
	}
    
    
    private void app() {	//	GESTION AFFICHAGE
    	
    	//System.out.println("dan app\n");
    	
    	while(quitter == false)
    	{
    		//System.out.println("page = " + page + "\n");
    		switch(page)
    		{
    		case 0:	// DEMARRAGE
    			accueil();
    			break;
    			
    		case 1:	// NBRJOUEUR
    			m_nbrJoueur();
    			break;
    			
			case 2:	// NOMJOUEUR
				m_nomJoueur();
				break;
				
			case 3:	// PLATEAU
				m_Plateau();
				break;
				
			case 4:	// MENU
				m_Menu();
				break;
				
			case 5:	// ACTUALITE
				m_Actualite();
				break;
				
			case 6:	// JOKER
				m_Joker();
				break;
				
			case 7:	// VIREMENTS
				m_Virement();
				break;
				
			case 8:	// CARTES
				m_Cartes();
				break;
	
    		}
    	}
    		
	}
    
  //--------------------------------------GESTION PAGES-----------------------------------------//
    
    private void accueil() {	//	AFFICHAGE ACCUEIL
    	
    	accueil = new Accueil();
    	//System.out.println("dans menu\n");
    	this.setContentPane(accueil);

        this.setVisible(true);
        waitEvent();
    	
    }
    
    private void m_nbrJoueur() {	//	AFFICHAGE CHOIX NOMBRE JOUEURS
    	
    	nbrJoueur = new NbrJoueur();
    	//System.out.println("dans nbr joueur\n");
    	this.setContentPane(nbrJoueur);
		this.repaint();
		this.revalidate();
		this.setVisible(true);
    	waitEvent();
    	partie = new Partie();
    }
    
    private void m_nomJoueur() {	//	AFFICHAGE CHOIX NOM JOUEURS
    	
    	//System.out.println("dans nom joueur" + Partie.getNBRjoueur() + "\n");
    	
    	for(int i = 1; i <= Partie.getNBRjoueur(); i++)
    	{
    		nomJoueur = new NomJoueur(i);
   
    		this.setContentPane(nomJoueur);
    		this.repaint();
    		this.revalidate();
    		this.setVisible(true);
    		
    		waitEvent();
    		
    		Partie.setNomJoueur(nomJoueur.getText(), i);
    		
    		if(page == 1)	// RETOUR FORCE
    		{
    			i = 1 + Partie.getNBRjoueur();
    		}
    		if(i == Partie.getNBRjoueur())
    		{
    			page = 3;
    		}
    	}
    }
    
    private void m_Plateau() {	//	AFFICHAGE PLATEAU
    
    	plateau = new Plateau();
    	
    	//System.out.println("dans plateau\n");
    	
    	this.setContentPane(plateau);
		this.repaint();
		this.revalidate();
		this.setVisible(true);
		
    	waitEvent();
    	
    	plateau.remove(plateau.bActualite);
    	plateau.remove(plateau.bJoker);
    	Plateau.setActu(false);
    	Plateau.setJoker(false);
    }
    
    private void m_Menu() {	//	AFFICHAGE MENU
    	
    	menu = new Menu();
    	
    	this.add(menu);
		this.repaint();
		this.revalidate();
		this.setVisible(true);
		
    	waitEvent();
    	
    	this.remove(menu);
    }
    
    private void m_Actualite() {	//	AFFICHAGE ACTUALITE
    	
    	actualite = new Actualite();
    	
    	this.add(actualite);
		this.repaint();
		this.revalidate();
		this.setVisible(true);
		
    	waitEvent();
    	
    	this.remove(actualite);
    }

	private void m_Joker() {	//	AFFICHAGE JOKER
	
		joker = new Joker();
	
		this.add(joker);
		this.repaint();
		this.revalidate();
		this.setVisible(true);
		
		waitEvent();
		
		this.remove(joker);
	}
	
	private void m_Virement() {	//	AFFICHAGE VIREMENT
    	
		//System.out.println("creer virement\n");
		virement = new Virement();
    	this.add(virement);
		this.repaint();
		this.revalidate();
		this.setVisible(true);
		
    	waitEvent();
    	
    	this.remove(virement);
    }
	
	private void m_Cartes() {	//	AFFICHAGE CARTES
    	
		cartes = new Cartes();
    	this.add(cartes);
		this.repaint();
		this.revalidate();
		this.setVisible(true);
		
    	waitEvent();
    	
    	this.remove(cartes);
    }
    
    private void waitEvent() {	//	WAIT EVENT
    	
    	continuer = true;
    	while(continuer)
    	{
    		try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }
    
	
	//------------------------------------SETTER AND GETTER-------------------------------------//
	
	public static void setPage(int nbr){
		page = nbr;
		if(page < 0) {page = 0;}	// SI RETOUR VERS ACCUEIL ALORS AFFICHER ACCUEIL
	}
	
	public static int getPage(){
		return page;
	}
	
	public static void setContinuer(boolean cont){
		continuer = cont;
	}

	public static void setQuitter(boolean quit){
		quitter = quit;
	}
}