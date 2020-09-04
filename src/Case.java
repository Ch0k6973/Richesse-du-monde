
public class Case {

	private int x;
	private int y;
	private int event;	// 0 = depart, 1 = achat, 2 = enchere, 3 = joker, 4 = actualite, 5 = recoit argent,
	private int id;

	
	public void setCaseX(int choix){
		
		x = choix;
	}


	public int getCaseX(){
	
		return x;
	}


	public void setCaseY(int choix){
	
		y = choix;
	}


	public int getCaseY(){
	
		return y;
	}


	public void setCaseEvent(int choix){
	
		event = choix;
	}


	public int getCaseEvent(){
	
		return event;
	}
	
	public void setId(int choix){
		
		id = choix;
	}


	public int getId(){
	
		return id;
	}
	
}