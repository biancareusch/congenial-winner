package spring.five.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.five.GuessCount;
import spring.five.MaxNumber;

@Configuration
public class GameConfig {

    // == fields ==
    private int maxNumber = 50;
    private int guessCount = 8;
    // == bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }
}
