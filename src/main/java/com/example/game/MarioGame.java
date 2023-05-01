package com.example.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

/*
 * we have a multiple implementations of GameConsole, so we need to declare a
 * primary component class
 */
@Primary
public class MarioGame implements GameConsole {
	
	public void up() {
		System.out.println("Mario: Jump!");
	}
	
	public void down() {
		System.out.println("Mario: Sit down.");
	}
	
	public void left() {
		System.out.println("Mario: Go back!");
	}
	
	public void right() {
		System.out.println("Mario: Go forward");
	}

}
