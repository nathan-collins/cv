package io.nathancollins.cv.api.repository;

import io.nathancollins.cv.api.entity.Resume;

import java.util.List;

/**
 * @author Nathan Collins
 */
public interface ResumeRepository {
  List<Resume> findAll();

  Resume findById(Long id);

  Resume save(Resume resume);
}
