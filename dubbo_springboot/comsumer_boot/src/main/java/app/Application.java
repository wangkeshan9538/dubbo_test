package app;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class Application {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(Application.class, args);
        Resource r=context.getBean(Resource.class);
        r.findAll();
    }

}

