package com.example.hellospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.game.GameConsole;
import com.example.game.GameRunner;
import com.example.game.PacmanGame;

@Configuration

//package where we have classes which we want to scan for beans
@ComponentScan("com.example.game")
public class AppSpring4 {
	
	/*
	 * create the bean for a class automatically
	 * use @Component annotation for
	 * that class (eg. PacmanGame) and use BeanScanner
	 * 
	 * game bean is already created by the @Component in this step we are
	 * creating bean for the GameRunner class as well the GameRunner class
	 * constructor will automatically get the PacmanGame object as parameter
	 * 
	 * For this implementation, we have set up PacmanGame component as a qualifier
	 * and autowired that qualifier in the PacmanGame class, therefore it will
	 * get the bean from PacmanGame and autowire it in the GameRunner
	 */			
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppSpring4.class)){
			
			//bean is created by ComponentScan
			context.getBean(PacmanGame.class).up();
			
			//bean is created by ComponentScan and PacmanGame object is passed automatically
			context.getBean(GameRunner.class).run();
			
		}
		
				
	}

}
