package d20160601;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class TCanvas extends JPanel{
	Image img;
	TCanvas(Image img){
		this.img = img;
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 10, 10, 800, 600,this);
	}
	
}
