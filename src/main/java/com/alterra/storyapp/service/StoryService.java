package com.alterra.storyapp.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alterra.storyapp.domain.dao.Story;
import com.alterra.storyapp.repository.StoryRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StoryService {

    private StoryRepository storyRepository;

    public Story save(Story story) {
        return storyRepository.save(story);
    }

    public Iterable<Story> getAll() {
        return storyRepository.findAll();
    }

    public Optional<Story> findOne(Long id) {
        return storyRepository.findById(id);
    }

    public void deleteOne(Long id) {
        storyRepository.deleteById(id);
    }

}
