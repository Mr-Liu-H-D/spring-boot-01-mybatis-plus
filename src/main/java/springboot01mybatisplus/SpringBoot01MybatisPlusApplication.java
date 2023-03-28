package springboot01mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("springboot01mybatisplus.dao")
public class SpringBoot01MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01MybatisPlusApplication.class, args);
    }

}
