// The only subclass the fully utilizes the
// Entity superclass (no other class requires
// movement in a tile based map).
// Contains all the gameplay associated with
// the Player.

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Player extends Entity {
	
	// sprites
	private BufferedImage[] dogSprites;
	
	// animation
	private final int DOWN = 0;
	private final int LEFT = 1;
	private final int RIGHT = 2;
	private final int UP = 3;
	
	
	// gameplay
	private int numBones;
	private int totalBones;
	
	private long ticks;
	
	public Player(TileMap tm) {
		
		super(tm);
		
		width = 16;
		height = 16;
		cwidth = 12;
		cheight = 12;
		
		moveSpeed = 2;
		
		numBones = 0;
		
		dogSprites = Content.PLAYER[0];
		
		animation.setsquareTiles(dogSprites);
		animation.settimeDelay(10);
		
	}
	
	private void setAnimation(int i, BufferedImage[] bi, int d) {
		currentAnimation = i;
		animation.setsquareTiles(bi);
		animation.settimeDelay(d);
	}
	
	public void collectedBone() { numBones++; }
	public int numBones() { return numBones; }
	public int getTotalBones() { return totalBones; }
	public void setTotalBones(int i) { totalBones = i; }
	
	// Used to update time.
	public long getTicks() { return ticks; }
	
	// Keyboard input. Moves the player.
	public void setDown() {
		super.setDown();
	}
	public void setLeft() {
		super.setLeft();
	}
	public void setRight() {
		super.setRight();
	}
	public void setUp() {
		super.setUp();
	}
	
	
	public void update() {
		
		ticks++;
		
		// update position
		super.update();
		
	}
	
	// Draw Player.
	public void draw(Graphics2D g) {
		super.draw(g);
	}
	
}