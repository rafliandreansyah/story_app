package com.alterra.storyapp.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alterra.storyapp.domain.dao.Story;
import com.alterra.storyapp.service.StoryService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/story")
public class StoryController {

    private StoryService storyService;

    @GetMapping
    public Iterable<Story> findAll() {
        return storyService.getAll();
    }

    @PostMapping
    public Story createOne(@RequestBody Story story) {
        return storyService.save(story);
    }

    @GetMapping("/{id}")
    public Story getById(@PathVariable("id") Long id) {
        Optional<Story> story = storyService.findOne(id);
        if (!story.isPresent()) {
            return null;
        }
        return story.get();
    }

    @DeleteMapping("/{id}")
    public void deleteStory(@PathVariable("id") Long id) {
        storyService.deleteOne(id);
    }

}
