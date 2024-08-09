//package new_api.java17;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//@SpringBootApplication
//@ComponentScan(basePackages = {"new_api.java17", "service_layer", "work_list"})
//@EnableJpaRepositories(basePackages = "connect_to_postgress")
//public class Java17Application {
//	public static void main(String[] args) {
//		SpringApplication.run(Java17Application.class, args);
//	}
//}

package new_api.java17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"new_api.java17", "service_layer", "work_list", "connect_to_postgress"})
@EnableJpaRepositories(basePackages = "connect_to_postgress")
@EntityScan(basePackages = "work_list")
public class Java17Application {
	public static void main(String[] args) {
		SpringApplication.run(Java17Application.class, args);
	}
}
