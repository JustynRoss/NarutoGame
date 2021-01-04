package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class RockTile extends Tile {

	public RockTile(int id) {
		super(Assets.hedge, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}