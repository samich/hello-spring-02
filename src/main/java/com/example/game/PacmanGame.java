package com.example.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*
 * we have a primary component class, but we still want to use this class
 * so we can use a qualifier.
 */
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements GameConsole {
	
	public void up() {
		System.out.println("Pacman: Jump!");
	}
	
	public void down() {
		System.out.println("Pacman: Sit down.");
	}
	
	public void left() {
		System.out.println("Pacman: Go back!");
	}
	
	public void right() {
		System.out.println("Pacman: Go forward");
	}

}
