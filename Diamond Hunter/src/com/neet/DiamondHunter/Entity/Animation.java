// This class takes in an array of images.
// Calling getImage() gives you the appropriate
// image in the animation cycle.

package com.neet.DiamondHunter.Entity;

import java.awt.image.BufferedImage;

public class Animation {
	
	private BufferedImage[] squareTile;
	private int currentFrame;
	private int numsquareTile;
	
	private int count;
	private int delay;
	
	private int timesPlayed;
	
	public Animation() {
		timesPlayed = 0;
	}
	
	public void setsquareTile(BufferedImage[] squareTile) {
		this.squareTile = squareTile;
		currentFrame = 0;
		count = 0;
		timesPlayed = 0;
		delay = 2;
		numsquareTile = squareTile.length;
	}
	
	public void setDelay(int i) { delay = i; }
	public void setFrame(int i) { currentFrame = i; }
	public void setNumsquareTile(int i) { numsquareTile = i; }
	
	public void update() {
		
		if(delay == -1) return;
		
		count++;
		
		if(count == delay) {
			currentFrame++;
			count = 0;
		}
		if(currentFrame == numsquareTile) {
			currentFrame = 0;
			timesPlayed++;
		}
		
	}
	
	public int getFrame() { return currentFrame; }
	public int getCount() { return count; }
	public BufferedImage getImage() { return squareTile[currentFrame]; }
	public boolean hasPlayedOnce() { return timesPlayed > 0; }
	public boolean hasPlayed(int i) { return timesPlayed == i; }
	
}