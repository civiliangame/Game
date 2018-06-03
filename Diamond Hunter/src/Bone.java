// Bone class.

import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

//Modifies upon bone collection
public class Bone extends Entity {
	
	//Where the sprites come in
	BufferedImage[] sprites;
	
	//Changing tiles
	private ArrayList<int[]> tileChanges;
	
	//Constructor
	public Bone(TileMap tilemap) {
		
		super(tilemap);
		
		
		//Initializing dimensions
		width = 16;
		height = 16;
		cwidth = 12;
		cheight = 12;
		
		
		//Applying the bone sprite
		sprites = Content.BONE[0];
		
		animation.setsquareTiles(sprites);
		animation.settimeDelay(10);
		
		//initializing it
		tileChanges = new ArrayList<int[]>();
		
	}
	
	public void addChange(int[] i) {
		tileChanges.add(i);
	}
	public ArrayList<int[]> getChanges() {
		return tileChanges;
	}
	
	public void update() {
		animation.update();
	}
	
	public void draw(Graphics2D g) {
		super.draw(g);
	}
	
}
