package io.nathancollins.cv.api.model;

import java.util.List;

import io.nathancollins.cv.api.entity.History;

public interface HistoryModel {
  List<History> findAll();

  History findByResume(Long resumeId);
}
