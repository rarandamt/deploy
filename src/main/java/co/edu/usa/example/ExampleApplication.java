package co.edu.usa.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {



    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Bean
    ApplicationRunner appRunner() {
        return args -> {
            final Log logger = LogFactory.getLog(getClass());
//            Actor actor = new Actor("Rodrigo", "Aranda Fernandez");
//            repositorio.save(actor);

//            List<Actor> lista = (List<Actor>) repositorio.findAll();
//            logger.info(lista);

          


        };
    }

}


