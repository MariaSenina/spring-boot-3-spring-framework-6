package com.senina.maria.springbasicsdemo;

import com.senina.maria.springbasicsdemo.game.GameRunner;
import com.senina.maria.springbasicsdemo.game.GamingConsole;
import com.senina.maria.springbasicsdemo.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
