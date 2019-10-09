package io.nathancollins.cv.api.model;

import java.util.List;

import javax.persistence.EntityManager;
import io.nathancollins.cv.api.entity.Project;

import io.nathancollins.cv.api.model.ProjectModel;

public class ProjectModelImpl implements ProjectModel {
  private EntityManager em;

  /**
   * 
   * @param em Entity Manager
   */
  public ProjectModelImpl(EntityManager em) {
    this.em = em;
  }

  /**
   * @param resumeId
   * @return
   */
  public Project findByResume(Long resumeId) {
    return em.find(Project.class, resumeId);
  }

  @Override
  public List<Project> findAll() {
    return em.createQuery("SELECT p FROM project p").getResultList();
  }
}
