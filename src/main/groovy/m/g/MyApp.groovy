package m.g

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication // same as Configuration EnableAuroConfiguration ComponentScan
class MyApp {

	static void main(String[] args) {
		SpringApplication.run MyApp, args
 	}
}
