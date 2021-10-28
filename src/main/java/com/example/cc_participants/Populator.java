package com.example.cc_participants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    ParticipantRepo participantRepo;

    @Override
    public void run(String... args) throws Exception {
        if (participantRepo.count() <= 0) {
            participantRepo.save(new Participant("Eric"));
            participantRepo.save(new Participant("Hanna"));
            participantRepo.save(new Participant("Ole"));
        }
    }
}
