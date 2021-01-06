package com.vraj.narutogame.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.vraj.narutogame.Handler;
import com.vraj.narutogame.entities.creatures.Opponent;
import com.vraj.narutogame.entities.creatures.Player;
import com.vraj.narutogame.entities.statics.Rock;
import com.vraj.narutogame.gfx.Assets;
import com.vraj.narutogame.map.Map;
//import com.vraj.narutogame.input.EscapeKey;

public class GameState extends State {

	private Player player;

	private Opponent player2;
	
	//private EscapeKey escapeKey;

	private Map map;
	private Map map2;
	private Map map3;
	


	public GameState(Handler handler) {
		super(handler);
		map = new Map(handler);
		
		handler.setMap(map);
		
		 //Frame f=new Frame("Button Example");  
		    //Button b=new Button("Click Here");  
		    //b.setBounds(50,100,80,30);  
		    //map.add(b);   
		    
		
		
		//escapeKey = new EscapeKey();
		


	}

	@Override
	public void update() {
		
		map.update();
		//map2.update();
	//	map3.update();
		
		
		
		//tile.update();
		//tile2.update();

		//escapeKey.checkEsc();
		if(handler.getKeyManager().esc) {
			//State.setState(game.menuState);
			State.setState(handler.getGame().pauseState);
		}

	}
	

	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.floorBg, 0, 0, null);
		//tile2.render2(g);
		
		
		//g.drawImage(Assets.hedge3, 1154, 594, 128, 128, null);
	//	g.drawImage(Assets.hedge4, 0, 594, 128, 128, null);*/
		
		
		//tile.render(g, 0, 0, 640, 480);
		
	    map.render(g);
		
		g.fillRoundRect(0, 0, 50, 50, 50, 50);
		g.setColor(Color.WHITE);
		g.fillRect(15, 10, 7, 30);
		g.fillRect(30, 10, 7, 30);
		
		
		g.setColor(Color.BLACK);
		g.fillRect(50, 0, 135, 20);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Geeza Pro", Font.BOLD, 13));
		g.drawString("[esc] for Pause Menu", 53, 12);
		g.drawString(handler.getGame().getFps() +"FPS", 1100, 20);
		
	    
	    

	}






}