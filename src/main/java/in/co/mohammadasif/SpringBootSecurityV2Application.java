package in.co.mohammadasif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootSecurityV2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityV2Application.class, args);
	}

}
