package io.nathancollins.cv.api.model;

import javax.persistence.EntityManager;

import io.nathancollins.cv.api.entity.History;

public class HistoryModelImpl implements HistoryModel {
  private EntityManager em;

  /**
   * @param em Entity manager
   */
  public HistoryModelImpl(EntityManager em) {
    this.em = em;
  }

  public History findByResume(Long resumeId) {
    return em.find(History.class, resumeId);
  }
}
