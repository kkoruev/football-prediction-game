package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.prediction.game.controller")
public class AppDemo {

    public static void main(String[] args) {
        SpringApplication.run(AppDemo.class, args);
    }
}
