package com.example.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
/*
 * We have a qualifier component, we can use it in the class which needs the
 * bean from that component
 */
public class GameRunner {
	
	GameConsole game;
	
	public GameRunner(@Qualifier("PacmanGameQualifier")GameConsole game) {
		this.game = game;
	}
	
	public void run() {
		
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
