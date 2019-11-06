package pers.demo.asa.internal.side.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2019 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Description:
 * @Author jet.xie
 * @Date: Created at 10:30 2019/10/30.
 */
@SpringBootApplication
@ComponentScan({"pers.demo.asa",
        "com.voyageone.service"})
public class InternalApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(InternalApiApplication.class, args);
    }
}