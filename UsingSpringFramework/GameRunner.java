package com.vyas.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    //private MarioGame game;
    //private SuperContra game2;
    //public GameRunner(MarioGame game)
    //public GameRunner(SuperContra game2)
    @Autowired
    public GameConsole game;
   public GameRunner(GameConsole game)
   {
       this.game = game;
   }
    public void runGame()
    {
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
