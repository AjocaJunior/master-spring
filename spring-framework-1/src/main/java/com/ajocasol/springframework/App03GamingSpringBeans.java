package com.ajocasol.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajocasol.springframework.game.GameRunner;
import com.ajocasol.springframework.game.MarioGame;
import com.ajocasol.springframework.game.SuperContraGame;
import com.ajocasol.springframework.game.PacmanGame;
import com.ajocasol.springframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}

	}

}
