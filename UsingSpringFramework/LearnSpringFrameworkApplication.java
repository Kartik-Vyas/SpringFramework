package com.vyas.learnspringframework;

import com.vyas.learnspringframework.game.GameConsole;
import com.vyas.learnspringframework.game.GameRunner;
import com.vyas.learnspringframework.game.MarioGame;
import com.vyas.learnspringframework.game.SuperContra;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
//		GameConsole game = new MarioGame();
//		GameConsole game2 = new SuperContra();
//		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}
}
