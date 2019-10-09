package io.nathancollins.cv.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "history")
public class History {
  private Long resumeId;

  /**
   * @param resumeId
   */
  public History(Long resumeId) {
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

    History history = (History) obj;

    boolean resumeIdEquals = (this.resumeId == null && history.resumeId == null)
        || (this.resumeId != null && this.resumeId.equals(history.resumeId));

    return resumeIdEquals;
  }

  @Override
  public String toString() {
    return "History [" + "resumeId=" + resumeId + "]";
  }
}
