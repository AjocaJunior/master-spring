package com.ajocasol.springframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ajocasol.springframework.game.GameRunner;


public class XMLConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			context.getBean(GameRunner.class).run();
			
		}

	}

}
