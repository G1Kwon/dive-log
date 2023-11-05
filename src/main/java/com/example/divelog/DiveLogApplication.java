package com.example.divelog;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.context.WebServerPortFileWriter;

@SpringBootApplication
public class DiveLogApplication {

    public static void main(String[] args) {
        for (String arg: args) {
            System.out.println("Argument: " + arg);
        }

        SpringApplication.run(DiveLogApplication.class, args);

//        SpringApplication application = new SpringApplication(DiveLogApplication.class);
//        application.setBannerMode(Banner.Mode.LOG);
//        application.addListeners(
//                new ApplicationPidFileWriter(),
//                new WebServerPortFileWriter());
//        application.run(args);

//        new SpringApplicationBuilder(DiveLogApplication.class)
//                .bannerMode(Banner.Mode.LOG)
//                .listeners(
//                        new ApplicationPidFileWriter(),
//                        new WebServerPortFileWriter()
//                )
//                .build().run(args);
    }

}
