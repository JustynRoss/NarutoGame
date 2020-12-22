package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class HedgeTile3 extends Tile {

	public HedgeTile3(int id) {
		super(Assets.hedge3, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}