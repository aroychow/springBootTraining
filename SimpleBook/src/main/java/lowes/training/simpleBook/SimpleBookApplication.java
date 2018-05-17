package lowes.training.simpleBook;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleBookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SimpleBookApplication.class, args);
	}

//	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(SimpleBookApplication.class);
//		app.setBannerMode(Banner.Mode.OFF);
//		app.run(args);
//	}
}
