package com.vraj.narutogame.tiles;


import com.vraj.narutogame.gfx.Assets;


public class BigRockTile extends Tile {

	public BigRockTile(int id) {
		super(Assets.bigRock, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}
