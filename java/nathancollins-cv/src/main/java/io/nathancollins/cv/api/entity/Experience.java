package io.nathancollins.cv.api.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "experience")
public class Experience {
  private Long resumeId;
  private String experienceTitle;
  private List<String[]> experienceList;

  /**
   * @param resumeId
   * @param experienceTitle
   * @param experienceList
   */
  public Experience(Long resumeId, String experienceTitle, List<String[]> experienceList) {
    this.resumeId = resumeId;
    this.experienceTitle = experienceTitle;
    this.experienceList = experienceList;
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
   * @return Experience title value
   */
  public String getExperienceTitle() {
    return experienceTitle;
  }

  /**
   * @param experienceTitle
   */
  public void setExperienceTitle(String experienceTitle) {
    this.experienceTitle = experienceTitle;
  }

  /**
   * @return List of experiences
   */
  public List<String[]> getExperienceItems() {
    return experienceList;
  }

  /**
   * @return Hash code
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (resumeId == null ? 0 : resumeId.hashCode());
    result = prime * result + (experienceTitle == null ? 0 : experienceTitle.hashCode());
    result = prime * result + (experienceList == null ? 0 : experienceList.hashCode());
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

    Experience experience = (Experience) obj;

    boolean resumeIdEquals = (this.resumeId == null && experience.resumeId == null)
        || (this.resumeId != null && this.resumeId.equals(experience.resumeId));
    boolean experienceTitleEquals = (this.experienceTitle == null && experience.experienceTitle == null)
        || (this.experienceTitle != null && this.experienceTitle.equals(experience.experienceTitle));
    boolean experienceListEquals = (this.experienceList == null && experience.experienceList == null)
        || (this.experienceList != null && this.experienceList.equals(experience.experienceList));

    return resumeIdEquals && experienceTitleEquals && experienceListEquals;
  }

  @Override
  public String toString() {
    return "Experience [" + "resumeId=" + resumeId + ", experienceTitle=" + experienceTitle + ", experienceList="
        + experienceList + "]";
  }
}
