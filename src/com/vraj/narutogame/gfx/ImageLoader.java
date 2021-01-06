package com.vraj.narutogame.gfx;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import java.io.IOException;

import javax.imageio.ImageIO;


//import net.coobird.thumbnailator.Thumbnails;

public class ImageLoader {
	
	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(ImageLoader.class.getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("1");
			System.exit(1);
		}
		return null;
	}
	
	public static BufferedImage rotateClockwise90(BufferedImage src) {
	    int width = src.getWidth();
	    int height = src.getHeight();

	    BufferedImage dest = new BufferedImage(height, width, src.getType());

	    Graphics2D graphics2D = dest.createGraphics();
	    graphics2D.translate((height - width) / 2, (height - width) / 2);
	    graphics2D.rotate(Math.PI / 2, height / 2, width / 2);
	    graphics2D.drawRenderedImage(src, null);

	    return dest;
	}
	
	
	


}


