package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class GrassTile extends Tile {

	public GrassTile(int id) {
		super(Assets.grass, id);
		
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	
}
