package com.example.hellospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.game.GameConsole;
import com.example.game.GameRunner;
import com.example.game.PacmanGame;

@Configuration
@ComponentScan("com.example.game")
public class AppSpring3 {
	
	//create the bean for a class automatically
	//use @Component annotation for that class (eg. PacmanGame) and use BeanScanner
	
	//game bean is already created by the @Component 
	//we can use any name for the bean
	@Bean
	public GameRunner runner (GameConsole game) {
		
		//System.out.println("Bean name: " + game);
		GameRunner runner = new GameRunner(game);
		return runner;
		
	}
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppSpring3.class)){
						
			
			context.getBean(PacmanGame.class).up();
			context.getBean(GameRunner.class).run();
			
		}
		
				
	}

}
