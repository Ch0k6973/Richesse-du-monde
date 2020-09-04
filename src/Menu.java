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

class Menu extends JPanel{
	
	public Bouton bStats = new Bouton("Stats");
	public Bouton bQuitter = new Bouton("Quitter");
	public Bouton bReprendre = new Bouton("Reprendre");
	private JLabel fond;
	private JLabel lMenu;
	
	private Color or = new Color(143, 122, 91);
	private Color bleu = new Color(4, 158, 232);
	private Color bleuDark = new Color(0, 85, 126);
	
	public Menu(){
        
        setSize(250, 360); 
        setLocation(558, 204);
        this.setLayout(null);
        
        Font pMenu = new Font("OCR A Extended", Font.BOLD, 40);
        Font pBMenu = new Font("OCR A Extended", Font.BOLD, 25);
        
        
        lMenu = new JLabel("MENU");
        lMenu.setFont(pMenu);
        lMenu.setForeground(or);
        lMenu.setBounds(25, 25, 200, 70);
        lMenu.setHorizontalAlignment(SwingConstants.CENTER); 
        lMenu.setVerticalAlignment(SwingConstants.CENTER); 
        
        bStats.setFont(pBMenu);
        bStats.setForeground(or);
        bStats.setBounds(25, 120, 200, 50);
        bStats.setBackground(bleuDark);
        
        bQuitter.setFont(pBMenu);
        bQuitter.setForeground(or);
        bQuitter.setBounds(25, 195, 200, 50);
        bQuitter.setBackground(bleuDark);
        
        bReprendre.setFont(pBMenu);
        bReprendre.setForeground(or);
        bReprendre.setBounds(25, 285, 200, 50);
        bReprendre.setBackground(bleuDark);
        
        fond = new JLabel(new ImageIcon("Images/FondMenu.png"));
        fond.setVerticalAlignment(JLabel.CENTER);
        fond.setHorizontalAlignment(JLabel.CENTER);
                
        this.add(lMenu);
        this.add(bStats);
        this.add(bQuitter);
        this.add(bReprendre);
		this.add(fond);
		
		//bStats.addActionListener(new BStatsListener());
		bQuitter.addActionListener(new BQuitListener());
		bReprendre.addActionListener(new BReprendreListener());
		
	  }
	
//------------------------------------CONTROL DES BOUTONS---------------------------------------//
	
	
	class BStatsListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(5);
		}
	 }
	
	class BQuitListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(0);
		}
	 }
	
	class BReprendreListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			Fenetre.setContinuer(false);
			Fenetre.setPage(3);
		}
	 }
	
//---------------------------------------------PAINT--------------------------------------------//
	
	public void paintComponent(Graphics g){
		try {
			Image img = ImageIO.read(new File("Images/FondMenu.png"));
			g.drawImage(img, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}                
	}

}