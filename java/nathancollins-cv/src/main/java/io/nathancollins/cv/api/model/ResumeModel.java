package io.nathancollins.cv.api.model;

import io.nathancollins.cv.api.entity.Resume;

import java.util.List;

/**
 * @author Nathan Collins
 */
public interface ResumeModel {
  List<Resume> findAll();

  Resume findById(Long id);

  Resume save(Resume resume);
}
