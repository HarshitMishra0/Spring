package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {
    public static void main(String args[]){

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
        }









//        //var game = new MarioGame();
//        //var game = new SuperContraGame();
//        var game = new PacmanGame();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
    }
}
