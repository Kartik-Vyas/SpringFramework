package com.vyas.learnspringframework.game;

//Here if we want the method of SuperContra class to be run in main class then sincemain class is tightl-y coupled to SuperMario
//we need to chnage entire Reference and object to call the methods of SuperContra
public class SuperContra {
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
