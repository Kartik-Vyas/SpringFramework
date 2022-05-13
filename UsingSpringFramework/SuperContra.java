package com.vyas.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra implements GameConsole{
        public void up()
        {
            System.out.println("go up");
        }
        public void down()
        {
            System.out.println("crouch");
        }
        public void left()
        {
            System.out.println("go left");
        }
        public void right()
        {
            System.out.println("go forward");
        }
}
