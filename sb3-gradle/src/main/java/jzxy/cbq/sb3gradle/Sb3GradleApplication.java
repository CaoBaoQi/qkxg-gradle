package jzxy.cbq.sb3gradle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Sb3GradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb3GradleApplication.class, args);

        log.info("Sb3GradleApplication run successful ");
    }

}
