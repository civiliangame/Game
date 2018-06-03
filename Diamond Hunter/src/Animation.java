// This class takes in an array of images.
// Calling getImage() gives you the appropriate
// image in the Animate cycle.



import java.awt.image.BufferedImage;

public class Animation {

	private BufferedImage[] squareTiles;
	private int currentsquareTile;
	private int numsquareTiles;

	private int numCount;
	private int timeDelay;

	
	
	public void update() {

		if(timeDelay == -1) return;

		numCount++;

		if(numCount == timeDelay) {
			currentsquareTile++;
			numCount = 0;
		}
		if(currentsquareTile == numsquareTiles) {
			currentsquareTile = 0;
		}

	}
	
	

	public void setsquareTile(int i) { 
		currentsquareTile = i; 
	}
	

	public int getsquareTile() { 
		return currentsquareTile;
	}
	public void setNumsquareTiles(int i) { 
		numsquareTiles = i;
	}

	
	public void setsquareTiles(BufferedImage[] squareTiles) {
		this.squareTiles = squareTiles;
		currentsquareTile = 0;
		numCount = 0;
		timeDelay = 2;
		numsquareTiles = squareTiles.length;
	}

	public void settimeDelay(int i) { 
		timeDelay = i;
	}

	public int getnumCount() { 
		return numCount;
	}
	public BufferedImage getImage() { 
		return squareTiles[currentsquareTile];
	}

}