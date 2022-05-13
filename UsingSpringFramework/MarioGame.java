package com.vyas.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole{
        public void up()
        {
            System.out.println("jump");
        }
        public void down()
        {
            System.out.println("go into tunnel");
        }
        public void left()
        {
            System.out.println("stop");
        }
        public void right()
        {
            System.out.println("forward");
        }
}
