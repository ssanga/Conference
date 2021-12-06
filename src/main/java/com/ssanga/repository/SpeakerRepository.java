package com.ssanga.repository;

import com.ssanga.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
