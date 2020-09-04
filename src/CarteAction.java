import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CarteAction extends JPanel {

	private int x = 0;
	private int y = 0;
	private int l = 113;
	private int h = 186;
	private int price = 0;
	private String name = "";
	private int quantity = 0;
	private int type = 0;
	
	
	private Color black = new Color(0, 0, 0);

	public CarteAction(){
		
		this.setLayout(null);
		
		Font pValue = new Font("OCR A Extended", Font.BOLD, 10);
		Font pPrice = new Font("OCR A Extended", Font.BOLD, 25);
		Font pCountry = new Font("OCR A Extended", Font.BOLD, 15);
		Font pQuantity = new Font("OCR A Extended", Font.BOLD, 30);
		Font pType = new Font("OCR A Extended", Font.BOLD, 12);
		
	}


	public void setX(int choix) {
		x = choix;
	}
	public int getX() {
		return x;
	}


	public void setY(int choix) {
		y = choix;
	}
	public int getY() {
		return y;
	}
	
	public void setL(int choix) {
		l = choix;
	}
	public int getL() {
		return l;
	}

	public void setH(int choix) {
		h = choix;
	}
	public int getH() {
		return h;
	}

	public void setPrice(int choix) {
		price = choix;
	}	
	public int getPrice() {
		return price;
	}


	public void setName(String choix) {
		name = choix;
	}
	public String getName() {
		return name;
	}


	public void setQuantity(int choix) {
		quantity = choix;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setType(int choix) {
		type = choix;
	}
	public int getType() {
		return type;
	}
	
	//------------------------------------------PAINT-------------------------------------------//
	
		public void paintComponent(Graphics g){	// AFFICHAGE FOND
			try {
				Image img = ImageIO.read(new File("CarteAction/"+name+".png"));
				g.drawImage(img, 0, 0, this);
			} catch (IOException e) {
				e.printStackTrace();
			}                
		}
}