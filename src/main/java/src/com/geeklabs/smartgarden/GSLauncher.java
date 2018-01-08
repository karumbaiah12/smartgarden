package src.com.geeklabs.smartgarden;

/**
 * Created by shubha on 7/1/18.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
        import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
        import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"src.com.geeklabs.smartgarden"})
public class GSLauncher extends SpringBootServletInitializer {
    @Autowired
    private ApplicationContext applicationContext;
    @Value("${spring.profiles.active}")
    private String springProfilesActive;

//    @RequestMapping("/")
//    String home() {
//        return "Hello World!";
//    }

    public static void main(String[] args) throws Exception {
        GSLauncher launcher = new GSLauncher();
        launcher
                .configure(new SpringApplicationBuilder(GSLauncher.class))
                .run(args);
        //SpringApplication.run(GSLauncher.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GSLauncher.class);
    }

    @PostConstruct
    public void initialize() throws Exception {
        this.initFactory(applicationContext,springProfilesActive);
    }

    public void initFactory(ApplicationContext applicationContext, String springProfilesActive){


        this.applicationContext=applicationContext;
        this.springProfilesActive=springProfilesActive;


    }

}
