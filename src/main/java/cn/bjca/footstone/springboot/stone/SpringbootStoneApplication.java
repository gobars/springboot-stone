package cn.bjca.footstone.springboot.stone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class SpringbootStoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStoneApplication.class, args);
    }

}
