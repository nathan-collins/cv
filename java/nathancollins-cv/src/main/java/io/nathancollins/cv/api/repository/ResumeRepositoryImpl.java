package io.nathancollins.cv.api.repository;

import io.nathancollins.cv.api.entity.Resume;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Nathan Collins
 */
public class ResumeRepositoryImpl implements ResumeRepository {
  private EntityManager em;

  public ResumeRepositoryImpl(EntityManager em) {
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
  public List<Resume> findAll() {
    return em.createQuery("SELECT r FROM Resume r").getResultList();
  }
}
