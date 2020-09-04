
public class Joueur {

	private String nom;
	private String couleur;
	private String argentString;
	private int numJoueur;
	private int argent;
	private int pos;
	private int slideX;
	private int slideY;
	private int pionX;
	private int pionY;
	private boolean joker = false;
	
	
	
	public Joueur(int num)
	{
		numJoueur = num;
		nom = "Joueur " + numJoueur + "";
		
	}
	
	public void convertisseur(int position) {
		
		switch(position)
		{
			case 0:
				pionX = Partie.case0.getCaseX() + slideX;
				pionY = Partie.case0.getCaseY() + slideY;
				break;
							
			case 1:
				pionX = Partie.case1.getCaseX() + slideX;
				pionY = Partie.case1.getCaseY() + slideY;		
				break;
						
			case 2:
				pionX = Partie.case2.getCaseX() + slideX;
				pionY = Partie.case2.getCaseY() + slideY;
				break;
								
			case 3:
				pionX = Partie.case3.getCaseX() + slideX;
				pionY = Partie.case3.getCaseY() + slideY;
				break;
								
			case 4:
				pionX = Partie.case4.getCaseX() + slideX;
				pionY = Partie.case4.getCaseY() + slideY;
				break;
							
			case 5:
				pionX = Partie.case5.getCaseX() + slideX;
				pionY = Partie.case5.getCaseY() + slideY;
				break;
								
			case 6:
				pionX = Partie.case6.getCaseX() + slideX;
				pionY = Partie.case6.getCaseY() + slideY;
				break;
								
			case 7:
				pionX = Partie.case7.getCaseX() + slideX;
				pionY = Partie.case7.getCaseY() + slideY;
				break;
								
			case 8:
				pionX = Partie.case8.getCaseX() + slideX;
				pionY = Partie.case8.getCaseY() + slideY;
				break;
							
			case 9:
				pionX = Partie.case9.getCaseX() + slideX;
				pionY = Partie.case9.getCaseY() + slideY;
				break;
								
			case 10:	
				pionX = Partie.case10.getCaseX() + slideX;
				pionY = Partie.case10.getCaseY() + slideY;
				break;
								
			case 11:
				pionX = Partie.case11.getCaseX() + slideX;
				pionY = Partie.case11.getCaseY() + slideY;
				break;
								
			case 12:
				pionX = Partie.case12.getCaseX() + slideX;
				pionY = Partie.case12.getCaseY() + slideY;
				break;
								
			case 13:	
				pionX = Partie.case13.getCaseX() + slideX;
				pionY = Partie.case13.getCaseY() + slideY;
				break;
								
			case 14:
				pionX = Partie.case14.getCaseX() + slideX;
				pionY = Partie.case14.getCaseY() + slideY;
				break;
								
			case 15:
				pionX = Partie.case15.getCaseX() + slideX;
				pionY = Partie.case15.getCaseY() + slideY;
				break;
								
			case 16:
				pionX = Partie.case16.getCaseX() + slideX;
				pionY = Partie.case16.getCaseY() + slideY;
				break;
								
			case 17:
				pionX = Partie.case17.getCaseX() + slideX;
				pionY = Partie.case17.getCaseY() + slideY;
				break;
							
			case 18:
				pionX = Partie.case18.getCaseX() + slideX;
				pionY = Partie.case18.getCaseY() + slideY;
				break;
								
			case 19:
				pionX = Partie.case19.getCaseX() + slideX;
				pionY = Partie.case19.getCaseY() + slideY;
				break;
								
			case 20:
				pionX = Partie.case20.getCaseX() + slideX;
				pionY = Partie.case20.getCaseY() + slideY;
				break;
								
			case 21:
				pionX = Partie.case21.getCaseX() + slideX;
				pionY = Partie.case21.getCaseY() + slideY;
				break;
								
			case 22:
				pionX = Partie.case22.getCaseX() + slideX;
				pionY = Partie.case22.getCaseY() + slideY;
				break;
				
			case 23:	
				pionX = Partie.case23.getCaseX() + slideX;
				pionY = Partie.case23.getCaseY() + slideY;
				break;
				
			case 24:
				pionX = Partie.case24.getCaseX() + slideX;
				pionY = Partie.case24.getCaseY() + slideY;
				break;
				
			case 25:
				pionX = Partie.case25.getCaseX() + slideX;
				pionY = Partie.case25.getCaseY() + slideY;
				break;
				
			case 26:
				pionX = Partie.case26.getCaseX() + slideX;
				pionY = Partie.case26.getCaseY() + slideY;
				break;
				
			case 27:
				pionX = Partie.case27.getCaseX() + slideX;
				pionY = Partie.case27.getCaseY() + slideY;
				break;
				
			case 28:
				pionX = Partie.case28.getCaseX() + slideX;
				pionY = Partie.case28.getCaseY() + slideY;
				break;
				
			case 29:
				pionX = Partie.case29.getCaseX() + slideX;
				pionY = Partie.case29.getCaseY() + slideY;
				break;
				
			case 30:
				pionX = Partie.case30.getCaseX() + slideX;
				pionY = Partie.case30.getCaseY() + slideY;
				break;
				
			case 31:
				pionX = Partie.case31.getCaseX() + slideX;
				pionY = Partie.case31.getCaseY() + slideY;
				break;
				
			case 32:
				pionX = Partie.case32.getCaseX() + slideX;
				pionY = Partie.case32.getCaseY() + slideY;
				break;
				
			case 33:
				pionX = Partie.case33.getCaseX() + slideX;
				pionY = Partie.case33.getCaseY() + slideY;
				break;
				
			case 34:
				pionX = Partie.case34.getCaseX() + slideX;
				pionY = Partie.case34.getCaseY() + slideY;
				break;
				
			case 35:
				pionX = Partie.case35.getCaseX() + slideX;
				pionY = Partie.case35.getCaseY() + slideY;
				break;
				
			case 36:
				pionX = Partie.case36.getCaseX() + slideX;
				pionY = Partie.case36.getCaseY() + slideY;
				break;
				
			case 37:
				pionX = Partie.case37.getCaseX() + slideX;
				pionY = Partie.case37.getCaseY() + slideY;
				break;
				
			case 38:
				pionX = Partie.case38.getCaseX() + slideX;
				pionY = Partie.case38.getCaseY() + slideY;
				break;
				
			case 39:
				pionX = Partie.case39.getCaseX() + slideX;
				pionY = Partie.case39.getCaseY() + slideY;
				break;
				
			case 40:
				pionX = Partie.case40.getCaseX() + slideX;
				pionY = Partie.case40.getCaseY() + slideY;
				break;
				
			case 41:
				pionX = Partie.case41.getCaseX() + slideX;
				pionY = Partie.case41.getCaseY() + slideY;
				break;
				
			case 42:
				pionX = Partie.case42.getCaseX() + slideX;
				pionY = Partie.case42.getCaseY() + slideY;
				break;
				
			case 43:
				pionX = Partie.case43.getCaseX() + slideX;
				pionY = Partie.case43.getCaseY() + slideY;
				break;
				
			case 44:
				pionX = Partie.case44.getCaseX() + slideX;
				pionY = Partie.case44.getCaseY() + slideY;
				break;
				
			case 45:
				pionX = Partie.case45.getCaseX() + slideX;
				pionY = Partie.case45.getCaseY() + slideY;
				break;
				
			case 46:
				pionX = Partie.case46.getCaseX() + slideX;
				pionY = Partie.case46.getCaseY() + slideY;
				break;
				
			case 47:
				pionX = Partie.case47.getCaseX() + slideX;
				pionY = Partie.case47.getCaseY() + slideY;
				break;
				
			case 48:
				pionX = Partie.case48.getCaseX() + slideX;
				pionY = Partie.case48.getCaseY() + slideY;
				break;
				
			case 49:
				pionX = Partie.case49.getCaseX() + slideX;
				pionY = Partie.case49.getCaseY() + slideY;
				break;
				
			case 50:
				pionX = Partie.case50.getCaseX() + slideX;
				pionY = Partie.case50.getCaseY() + slideY;
				break;
				
			case 51:
				pionX = Partie.case51.getCaseX() + slideX;
				pionY = Partie.case51.getCaseY() + slideY;
				break;
				
			case 52:
				pionX = Partie.case52.getCaseX() + slideX;
				pionY = Partie.case52.getCaseY() + slideY;
				break;
				
			case 53:
				pionX = Partie.case53.getCaseX() + slideX;
				pionY = Partie.case53.getCaseY() + slideY;
				break;
				
			case 54:
				pionX = Partie.case54.getCaseX() + slideX;
				pionY = Partie.case54.getCaseY() + slideY;
				break;
				
			case 55:
				pionX = Partie.case55.getCaseX() + slideX;
				pionY = Partie.case55.getCaseY() + slideY;
				break;
				
			case 56:
				pionX = Partie.case56.getCaseX() + slideX;
				pionY = Partie.case56.getCaseY() + slideY;
				break;
				
			case 57:
				pionX = Partie.case57.getCaseX() + slideX;
				pionY = Partie.case57.getCaseY() + slideY;
				break;
				
			case 58:
				pionX = Partie.case58.getCaseX() + slideX;
				pionY = Partie.case58.getCaseY() + slideY;
				break;
				
			case 59:
				pionX = Partie.case59.getCaseX() + slideX;
				pionY = Partie.case59.getCaseY() + slideY;
				break;
				
			case 60:
				pionX = Partie.case60.getCaseX() + slideX;
				pionY = Partie.case60.getCaseY() + slideY;
				break;
				
			case 61:
				pionX = Partie.case61.getCaseX() + slideX;
				pionY = Partie.case61.getCaseY() + slideY;
				break;
				
			case 62:
				pionX = Partie.case62.getCaseX() + slideX;
				pionY = Partie.case62.getCaseY() + slideY;
				break;
				
			case 63:
				pionX = Partie.case63.getCaseX() + slideX;
				pionY = Partie.case63.getCaseY() + slideY;
				break;
				
			case 64:
				pionX = Partie.case64.getCaseX() + slideX;
				pionY = Partie.case64.getCaseY() + slideY;
				break;
				
		}			
	}
	
	public String argentString() {
		
		int reste = 0, imillions = 0, imilliers = 0, iunites = 0;
		String millions = "", milliers = "", unites = ""; 
		
		reste = argent;
		
		if(reste > 1000000) {
			imillions = reste / 1000000;
			reste = reste - imillions*1000000;
			System.out.println(imillions + " millions\n");
			millions = "" + imillions + "";
		}
		else {
			millions = "";
		}
		
		if(reste > 1000) {
			imilliers = reste / 1000;
			reste = reste - imilliers*1000;
			System.out.println(imilliers + " milliers\n");
			milliers = "" + imilliers + "";
		}
		else if(argent > 1000000) {
			milliers = "000";
		}
		else {
			milliers = "";
		}
		
		if(reste > 0) {
			iunites = reste / 1;
			reste = reste - iunites*1;
			System.out.println(iunites + " unites\n");
			unites = "" + iunites + "";
		}
		else if(argent > 1000) {
			unites = "000";
		}
		else {
			unites = "";
		}
		
		if(argent <= 0) {
			unites = "0";
		}
		
		argentString = "" + millions + " " + milliers + " " + unites + "";
		System.out.println(argentString + "\n");
		
		return argentString;
	}
	
	//------------------------------------SETTER AND GETTER-------------------------------------//
	
	public void setNom(String choix) {
		nom = choix;
	}
	public String getNom() {
		return nom;
	}
	
	
	
	public void setCouleur(String choix) {
		couleur = choix;
	}
	public String getCouleur() {
		return couleur;
	}
	
	
	
	public void setNum(int choix) {
		numJoueur = choix;
	}
	public int getNum() {
		return numJoueur;
	}
	
	
	
	public void setArgent(int choix) {
		argent = choix;
	}
	public int getArgent() {
		return argent;
	}
	
	
	
	public void setPos(int choix) {
		pos = choix;
	}
	public int getPos() {
		return pos;
	}
	
	public void setJoker(boolean choix) {
		joker = choix;
	}
	public boolean getJoker() {
		return joker;
	}
	
	public void setSlideX(int choix) {
		slideX = choix;
	}
	public int getSlideX() {
		return slideX;
	}
	
	public void setSlideY(int choix) {
		slideY = choix;
	}
	public int getSlideY() {
		return slideY;
	}
	
	public void setPionX(int choix) {
		pionX = choix;
	}
	public int getPionX() {
		return pionX;
	}
	
	public void setPionY(int choix) {
		pionY = choix;
	}
	public int getPionY() {
		return pionY;
	}
	
}
