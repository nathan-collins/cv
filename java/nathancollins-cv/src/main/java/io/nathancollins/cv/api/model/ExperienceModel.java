package io.nathancollins.cv.api.model;

import io.nathancollins.cv.api.entity.Experience;

public interface ExperienceModel {
  Experience findByResume(Long resumeId);
}
