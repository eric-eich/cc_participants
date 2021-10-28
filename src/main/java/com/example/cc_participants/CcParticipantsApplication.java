package com.example.cc_participants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class CcParticipantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcParticipantsApplication.class, args);
    }

}
