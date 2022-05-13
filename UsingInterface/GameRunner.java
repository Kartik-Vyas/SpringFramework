package com.vyas.learnspringframework.game;

public class GameRunner {
    //private MarioGame game;
    //private SuperContra game2;
    //public GameRunner(MarioGame game)
    //public GameRunner(SuperContra game2)
    private GameConsole game;
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
