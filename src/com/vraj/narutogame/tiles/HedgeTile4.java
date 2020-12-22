package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class HedgeTile4 extends Tile {

	public HedgeTile4(int id) {
		super(Assets.hedge4, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}