package com.example.cc_participants;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Table(name= "participant", schema = "schema01")
//@Entity(name = "participant")

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Participant {
    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    public Participant(String name) {
        this.name = name;
    }

}
