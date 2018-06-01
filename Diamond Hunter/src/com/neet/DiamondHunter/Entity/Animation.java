// This class takes in an array of images.
// Calling getImage() gives you the appropriate
// image in the animation cycle.

package com.neet.DiamondHunter.Entity;

import java.awt.image.BufferedImage;

public class Animation {
	
	private BufferedImage[] squareTiles;
	private int currentsquareTile;
	private int numsquareTiles;
	
	private int numCount;
	private int timeDelay;
	
	private int timesRun;
	
	public Animation() {
		timesRun = 0;
	}
	
	public void setsquareTiles(BufferedImage[] squareTiles) {
		this.squareTiles = squareTiles;
		currentsquareTile = 0;
		numCount = 0;
		timesRun = 0;
		timeDelay = 2;
		numsquareTiles = squareTiles.length;
	}
	
	public void settimeDelay(int i) { timeDelay = i; }
	public void setsquareTile(int i) { currentsquareTile = i; }
	public void setNumsquareTiles(int i) { numsquareTiles = i; }
	
	public void update() {
		
		if(timeDelay == -1) return;
		
		numCount++;
		
		if(numCount == timeDelay) {
			currentsquareTile++;
			numCount = 0;
		}
		if(currentsquareTile == numsquareTiles) {
			currentsquareTile = 0;
			timesRun++;
		}
		
	}
	
	public int getsquareTile() { return currentsquareTile; }
	public int getnumCount() { return numCount; }
	public BufferedImage getImage() { return squareTiles[currentsquareTile]; }
	public boolean hasPlayedOnce() { return timesRun > 0; }
	public boolean hasPlayed(int i) { return timesRun == i; }
	
}