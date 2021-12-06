package com.ssanga.repository;

import com.ssanga.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImp implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Bryan");
        speaker.setLastName("Hansen");

        speakers.add(speaker);
        return speakers;
    }
}
