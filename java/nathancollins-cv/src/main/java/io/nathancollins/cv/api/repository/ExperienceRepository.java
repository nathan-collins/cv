package io.nathancollins.cv.api.repository;

import io.nathancollins.cv.api.entity.Experience;

public interface ExperienceRepository {
  Experience findByResume(Long resumeId);
}
