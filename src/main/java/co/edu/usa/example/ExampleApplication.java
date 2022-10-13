package co.edu.usa.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@SpringBootApplication
@ConditionalOnProperty(name = "spring.cache.type", havingValue = "REDIS")
public class ExampleApplication extends SpringBootServletInitializer{

@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ExampleApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

   

}


