package com.senina.maria.springlevel2;

import com.senina.maria.springlevel2.game.GameRunner;
import com.senina.maria.springlevel2.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.senina.maria.springlevel2.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
