package it.unibs.pajc;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PnlGraphics extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PnlGraphics() {

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int w = getWidth();
		int h = getHeight();
		
		int wSection = w/8;
		int hSection = h/8;
		
		//g.drawLine(0, 0, w, h);
		
		g.setColor(Color.black);
		
		for (int i = 1;i <= 7;i++) {
			g.drawLine(0, hSection * i, w, hSection * i);
			g.drawLine(wSection * i, 0, wSection * i, h);
		}
		
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				if((i + j) % 2 == 0) {
					g.fillRect(wSection * j, hSection * i, wSection, hSection);
				}
			}
		}
	}
}
