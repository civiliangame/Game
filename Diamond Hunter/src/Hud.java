// Contains a reference to the Player.
// Draws all relevant information at the
// bottom of the screen.

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Hud {
	
	private int yoffset;
	
	private BufferedImage bar;
	private BufferedImage bone;
	private BufferedImage boat;
	private BufferedImage axe;
	
	private Player player;
	
	private int numBones;
	
	private Font font;
	private Color textColor; 
	
	public Hud(Player p, ArrayList<Bone> d) {
		
		player = p;
		numBones = d.size();
		yoffset = GamePanel.HEIGHT;
		
		bar = Content.BAR[0][0];
		bone = Content.BONE[0][0];
		boat = Content.ITEMS[0][0];
		axe = Content.ITEMS[0][1];
		
		font = new Font("Arial", Font.PLAIN, 10);
		textColor = new Color(47, 64, 126);
		
	}
	
	public void draw(Graphics2D g) {
		
		// draw hud
		g.drawImage(bar, 0, yoffset, null);
		
		// draw bone bar
		g.setColor(textColor);
		g.fillRect(8, yoffset + 6, (int)(28.0 * player.numBones() / numBones), 4);
		
		// draw bone amount
		g.setColor(textColor);
		g.setFont(font);
		String s = player.numBones() + "/" + numBones;
		Content.drawString(g, s, 40, yoffset + 3);
		if(player.numBones() >= 10) g.drawImage(bone, 80, yoffset, null);
		else g.drawImage(bone, 72, yoffset, null);
		
		
		
		
	}
	
}
