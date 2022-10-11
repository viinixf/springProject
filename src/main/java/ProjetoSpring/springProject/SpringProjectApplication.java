package ProjetoSpring.springProject;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
            return builder.sources(Application.class);
        }
}
