package com.example.hellospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.game.GameConsole;
import com.example.game.GameRunner;
import com.example.game.PacmanGame;

public class AppSpring2 {
	
	//use the beans methods in the main class instead of a separate class	
	@Bean
	public GameConsole game() {
		
		GameConsole game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner runner(GameConsole game) {
		
		GameRunner runner = new GameRunner(game);
		return runner;
		
	}
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppSpring2.class)){
						
			
			context.getBean(PacmanGame.class).up();
			context.getBean(GameRunner.class).run();
			
		}
		
				
	}

}
