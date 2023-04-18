package com.ajocasol.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ajocasol.springframework.game.GameRunner;
import com.ajocasol.springframework.game.GamingConsole;
import com.ajocasol.springframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	// var game = new MarioGame();
	// var game = new SuperContraGame();
	// 1: Object creation
//	var gameRunner = new GameRunnwith er(game);
	// 2: Object creation + wiring dependencies
//	gameRunner.run();

}
