package com.vraj.narutogame.tiles;

import com.vraj.narutogame.gfx.Assets;


public class BigRockTile2 extends Tile {

	public BigRockTile2(int id) {
		super(Assets.bigRock2, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}
