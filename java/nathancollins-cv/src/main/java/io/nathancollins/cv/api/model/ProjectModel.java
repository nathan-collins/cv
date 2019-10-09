package io.nathancollins.cv.api.model;

import java.util.List;

import io.nathancollins.cv.api.entity.Project;

public interface ProjectModel {
  List<Project> findAll();

  Project findByResume(Long resumeId);
}
