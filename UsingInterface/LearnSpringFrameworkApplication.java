package com.vyas.learnspringframework;

import com.vyas.learnspringframework.game.GameConsole;
import com.vyas.learnspringframework.game.GameRunner;
import com.vyas.learnspringframework.game.MarioGame;
import com.vyas.learnspringframework.game.SuperContra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameConsole game = new MarioGame();
		GameConsole game2 = new SuperContra();
    //note:- Since we have use interface, now the classes have become loosly coupled 
    // hence here we only need to change the child reference to call the methods of desired class.
		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}
}
