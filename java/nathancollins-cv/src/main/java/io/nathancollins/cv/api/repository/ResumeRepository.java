package io.nathancollins.cv.api.repository;

import io.nathancollins.cv.api.entity.Resume;

/**
 * @author Nathan Collins
 */
public interface ResumeRepository {
  Resume findAll();

  Resume findById(Long id);

  Resume save(Resume resume);
}
