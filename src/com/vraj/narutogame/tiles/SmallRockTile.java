package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class SmallRockTile extends Tile {

	public SmallRockTile(int id) {
		super(Assets.smallR, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}
