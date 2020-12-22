package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class HedgeTile2 extends Tile {

	public HedgeTile2(int id) {
		super(Assets.hedge2, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}
