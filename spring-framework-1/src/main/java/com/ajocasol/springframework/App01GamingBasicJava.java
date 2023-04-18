package com.ajocasol.springframework;

import com.ajocasol.springframework.game.GameRunner;
import com.ajocasol.springframework.game.MarioGame;
import com.ajocasol.springframework.game.SuperContraGame;
import com.ajocasol.springframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame(); //1: Object creation
		var gameRunner = new GameRunner(game); //2: Object creation + wiring dependencies
		gameRunner.run();

	}

}
