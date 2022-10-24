package com.alterra.storyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alterra.storyapp.domain.dao.Story;

public interface StoryRepository extends JpaRepository<Story, Long> {
}
