package com.ssanga.service;

import com.ssanga.model.Speaker;
import com.ssanga.repository.HibernateSpeakerRepositoryImp;
import com.ssanga.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImp();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
