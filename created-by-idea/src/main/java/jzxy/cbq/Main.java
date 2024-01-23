package jzxy.cbq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Configuration
public class Main {

    @Bean
    public String string() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext();
    }
}