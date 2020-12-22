package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class WallTile extends Tile {

	public WallTile(int id) {
		super(Assets.wall, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}
