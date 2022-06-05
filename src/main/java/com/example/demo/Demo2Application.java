package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

    @Autowired
    private LapService lapService;

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
        for (int i = 0; i < 100 ; i++) {
            System.out.println(lapService.timeMyLap(System.nanoTime()));
            Thread.sleep(500);
        }
    }
}

