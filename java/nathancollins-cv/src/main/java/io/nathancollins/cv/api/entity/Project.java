package io.nathancollins.cv.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
  private Long resumeId;

  public Project(Long resumeId) {
    this.resumeId = resumeId;
  }

  /**
   * @return Resume identification
   */
  public Long getResumeId() {
    return resumeId;
  }

  /**
   * @param resumeId
   */
  public void setResumeId(Long resumeId) {
    this.resumeId = resumeId;
  }

  /**
   * @return Hash code
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (resumeId == null ? 0 : resumeId.hashCode());
    return result;
  }

  /**
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;

    Project project = (Project) obj;

    boolean resumeIdEquals = (this.resumeId == null && project.resumeId == null)
        || (this.resumeId != null && this.resumeId.equals(project.resumeId));

    return resumeIdEquals;
  }

  @Override
  public String toString() {
    return "Project [" + "resumeId=" + resumeId + "]";
  }
}
