//Tiles

import java.awt.image.BufferedImage;

public class Tile {

	private BufferedImage image;

	// tile types
	public static final int NORMAL = 0;

	public Tile(BufferedImage image, int type) {
		this.image = image;
	}

	public BufferedImage getImage() { 
		return image;
	}
	public int getType() { 
		return 0;
	}

}
