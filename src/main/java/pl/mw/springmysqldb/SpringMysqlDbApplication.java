package pl.mw.springmysqldb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "pl.mw.springmysqldb.repositories")
@SpringBootApplication
public class SpringMysqlDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMysqlDbApplication.class, args);
    }
}
