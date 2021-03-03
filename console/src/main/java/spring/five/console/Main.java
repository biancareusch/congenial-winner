package spring.five.console;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.five.config.GameConfig;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Guess The Number");

        //create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        //close context (container)
        context.close();
    }
}
