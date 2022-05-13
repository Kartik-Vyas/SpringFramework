package com.vyas.learnspringframework;

import com.vyas.learnspringframework.game.GameRunner;
import com.vyas.learnspringframework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
  
  //note:- This is example for tigthly coupled.
  // This required following classes in subsequent packages to work.
  
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}
}
