package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class WallTile4 extends Tile {

	public WallTile4(int id) {
		super(Assets.wall4, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}
