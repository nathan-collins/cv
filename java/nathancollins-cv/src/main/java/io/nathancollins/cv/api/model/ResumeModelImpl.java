package io.nathancollins.cv.api.model;

import io.nathancollins.cv.api.entity.Resume;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author Nathan Collins
 */
public class ResumeModelImpl implements ResumeModel {
  private EntityManager em;

  public ResumeModelImpl(EntityManager em) {
    this.em = em;
  }

  /**
   * Save the resume
   */
  public Resume save(Resume resume) {
    if (resume.getId() == null) {
      em.persist(resume);
    } else {
      resume = em.merge(resume);
    }
    return resume;
  }

  /**
   * Find a resume by its id
   * 
   * @param id
   * @return
   */
  public Resume findById(Long id) {
    return em.find(Resume.class, id);
  }

  /**
   * Find All Resumes
   * 
   * @return
   */
  @Override
  public List<Resume> findAll() {
    return em.createQuery("SELECT r FROM Resume r").getResultList();
  }
}
