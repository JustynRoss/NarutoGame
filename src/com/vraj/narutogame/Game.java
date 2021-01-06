package com.vraj.narutogame;

//import com.vraj.narutogame.input.EscapeKey;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.vraj.narutogame.display.Display;
import com.vraj.narutogame.gfx.Assets;
import com.vraj.narutogame.input.KeyManager;
import com.vraj.narutogame.states.GameState;
import com.vraj.narutogame.states.MenuState;
import com.vraj.narutogame.states.PauseState;
import com.vraj.narutogame.states.CharacterState;
import com.vraj.narutogame.states.State;

public class Game implements Runnable {

	private int fps = 60;

	private Display display;
	public int width, height;
	public String title;

	private boolean running = false;
	private Thread thread;

	private BufferStrategy bs;

	private Graphics g;

	//States
	public State gameState;
	public State menuState;
	public State pauseState;
	public State characterState;

	private KeyManager keyManager;
	//private EscapeKey escapeKey;//

	private Handler handler;

	public Game(String title, int width, int height, int fps) {
		this.fps = fps;
		this.width = width;
		this.height = height; 
		this.title = title;
		keyManager = new KeyManager();
		//escapeKey = new EscapeKey();//
	}

	public void run() {

		init();

		//frames per second
		//amount of times the update and rendor method are called
		//fps = 120;
		//1 second divided by fps
		//maximum time allowed to run 60 fps
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;

		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;

			if(delta >= 1) {
				update();
				render();
				ticks++;
				delta--;
			}

			/*if (timer >= 1000000000) {
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}*/
		}

		stop();

	} 

	public KeyManager getKeyManager() {
		return keyManager;
	}
	/*public EscapeKey getEscapeKey() {
		return escapeKey;
	}*/

	private void init() {

		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();

		handler = new Handler(this);
		//game state object
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		pauseState = new PauseState(handler);
		characterState = new CharacterState(handler);
		State.setState(menuState);//start in menu 


	}


	private void update() {
		keyManager.updatePlayer();
		keyManager.updateOpponent();
		keyManager.checkEscape();
		//escapeKey.checkEsc();//
		if(State.getState() != null) {
			State.getState().update();
		}


	}

	private void render() {
		//BufferStrategy tells the computer how to draw 'stuff' to the screen
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);

		//Draw here

		if(State.getState() != null) {
			State.getState().render(g);
		}

		//End drawing
		bs.show();
		g.dispose();
	}

	public synchronized void start() {
		if (running) {
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if(!running) {
			return;
		}
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getWidth() {

		return width;
	}

	public int getHeight() {

		return height;
	}

	public int getFps() {
		return fps;
	}
	public void setFps(int fps) {
		this.fps = fps;
	}




}