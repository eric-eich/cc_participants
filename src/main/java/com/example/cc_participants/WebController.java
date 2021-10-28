package com.example.cc_participants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

//@RestController
@Controller
public class WebController {

    @Autowired
    ParticipantRepo participantRepo;

    @GetMapping("/participants")
    public String getAllParticipants(Model model) {
        List<Participant> participants = participantRepo.findAll();

        model.addAttribute("participants", participants);
        model.addAttribute("participant", new Participant());
        return "participants";
    }

    @PostMapping("/participant")
    public String addParticipant(@ModelAttribute("participant") Participant participant) {
        participantRepo.save(participant);
        return "redirect:/participants";
    }

//    @RequestMapping("/")
//    public String sagHallo(){
//        return "hallo welt :--)";
//    }

//    @RequestMapping("/1")
//    public String gibEins(){
//        Participant participant = new Participant("eric");
//    participantRepo.save(participant);
//    return participantRepo.findAll().stream().findAny().get().getName();
//
//    }

//    @GetMapping("/getAllParticipants")
//    public List<Participant> getAllParticipants(){
//        return participantRepo.findAll();
//    }

}
