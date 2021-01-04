package com.vraj.narutogame.gfx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import org.imgscalr.Scalr;

//import net.coobird.thumbnailator.Thumbnails;


public class Assets {
	
	private static final int width = 35, height = 50;
	
	public static BufferedImage player, player2, hedge, hedge2, hedge3, hedge4, floor, wall, wall2, wall3,wall4, smallR2, small, bigRock, bigRock2, smallR, grass, metalTile;

	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/images/naruto_sheet.png"));
		//SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/images/mapSprite.png"));
		//SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/images/snowBg.png"));
		
		metalTile = (ImageLoader.loadImage("/images/metalTile.png"));
		grass = (ImageLoader.loadImage("/images/grass.png"));
		hedge = (ImageLoader.loadImage("/images/hedge.png"));
		hedge2 = ImageLoader.rotateClockwise90(hedge);
		hedge3 = ImageLoader.rotateClockwise90(hedge2);
		hedge4 = ImageLoader.rotateClockwise90(hedge3);
		
		floor = (ImageLoader.loadImage("/images/floor.png"));
		wall = (ImageLoader.loadImage("/images/wall.png"));
		wall2 = ImageLoader.rotateClockwise90(wall);
		wall3 = ImageLoader.rotateClockwise90(wall2);
		wall4 = ImageLoader.rotateClockwise90(wall3);
		
		 smallR = (ImageLoader.loadImage("/images/smallRock.png"));
		
		//smallR = Scalr.resize(smallR2, 1);
		bigRock = (ImageLoader.loadImage("/images/bigRock.png"));
		bigRock2 = ImageLoader.rotateClockwise90(bigRock);
		//grass2 = sheet2.crop(18, 153, 15, 15);
		player = sheet.crop(18, 20, width, height);
		player2 = sheet.crop(460, 465, 52, 36);
	}

}