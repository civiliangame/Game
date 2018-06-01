// This class takes in an array of images.
// Calling getImage() gives you the appropriate
// image in the animation cycle.

package com.neet.DiamondHunter.Entity;

import java.awt.image.BufferedImage;

public class Animation {
	
	private BufferedImage[] squareTiles;
	private int currentsquareTile;
	private int numsquareTiles;
	
	private int count;
	private int delay;
	
	private int timesPlayed;
	
	public Animation() {
		timesPlayed = 0;
	}
	
	public void setsquareTiles(BufferedImage[] squareTiles) {
		this.squareTiles = squareTiles;
		currentsquareTile = 0;
		count = 0;
		timesPlayed = 0;
		delay = 2;
		numsquareTiles = squareTiles.length;
	}
	
	public void setDelay(int i) { delay = i; }
	public void setsquareTile(int i) { currentsquareTile = i; }
	public void setNumsquareTiles(int i) { numsquareTiles = i; }
	
	public void update() {
		
		if(delay == -1) return;
		
		count++;
		
		if(count == delay) {
			currentsquareTile++;
			count = 0;
		}
		if(currentsquareTile == numsquareTiles) {
			currentsquareTile = 0;
			timesPlayed++;
		}
		
	}
	
	public int getsquareTile() { return currentsquareTile; }
	public int getCount() { return count; }
	public BufferedImage getImage() { return squareTiles[currentsquareTile]; }
	public boolean hasPlayedOnce() { return timesPlayed > 0; }
	public boolean hasPlayed(int i) { return timesPlayed == i; }
	
}