package com.vraj.narutogame.tiles;


import com.vraj.narutogame.gfx.Assets;


public class WallTile3 extends Tile {

	public WallTile3(int id) {
		super(Assets.wall3, id);
		
	}
	

	
	@Override
	public boolean isSolid() {
		return true;
	}

}
