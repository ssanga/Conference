package com.ssanga.service;

import com.ssanga.model.Speaker;
import com.ssanga.repository.HibernateSpeakerRepositoryImp;
import com.ssanga.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImp(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImp(SpeakerRepository repository){
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("Called after the constructor");
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    //@Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
