package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class HedgeTile extends Tile {

	public HedgeTile(int id) {
		super(Assets.hedge, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}
