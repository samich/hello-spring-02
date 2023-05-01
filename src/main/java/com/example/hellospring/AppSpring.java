package com.example.hellospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.game.GameConsole;
import com.example.game.GameRunner;
import com.example.game.PacmanGame;

//use the configuration file in the launch file
@Configuration
class AppConfig {
	
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

}

public class AppSpring {
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
						
			
			context.getBean(PacmanGame.class).up();
			context.getBean(GameRunner.class).run();
			
		}
		
				
	}

}
