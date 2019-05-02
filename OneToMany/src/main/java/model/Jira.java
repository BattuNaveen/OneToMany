package model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "jira")
public class Jira {
 
    @Id
    @GeneratedValue
    @Column(name = "TC_ID")
    private String TC_ID;
 
    @Column(name = "Domain_Epic")
    private String Domain_Epic;
 
    @Column(name = "StoryID")
    private String StoryID;
    
    @Column(name="FeatureID")
    private String FeatureID;
    
    @Column(name="FeatureDescription")
    private String FeatureDescription;
    
    @Column(name="FeatureEpic")
    private String FeatureEpic;
    
    @Column(name="ManualTC_status")
    private String ManualTC_status;
    
    @Column(name="Assignee")
    private String Assignee;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="TC_ID") 
    private Set<Jenkins> jenkins;          //List<Jenkins> jenkins;
    
    public Set<Jenkins> getJenkins() {
		return jenkins;
	}

	public void setJenkins(Set<Jenkins> jenkins) {
		this.jenkins = jenkins;
	}

	public Jira() {
 
    }
 
    public Jira(String tC_ID, String domain_Epic, String storyID, String featureID, String featureDescription,
			String featureEpic, String manualTC_status, String assignee) {
		super();
		TC_ID = tC_ID;
		Domain_Epic = domain_Epic;
		StoryID = storyID;
		FeatureID = featureID;
		FeatureDescription = featureDescription;
		FeatureEpic = featureEpic;
		ManualTC_status = manualTC_status;
		Assignee = assignee;
	}


	public String getTC_ID() {
		return TC_ID;
	}

	public void setTC_ID(String tC_ID) {
		TC_ID = tC_ID;
	}

	public String getDomain_Epic() {
		return Domain_Epic;
	}

	public void setDomain_Epic(String domain_Epic) {
		 this.Domain_Epic = Domain_Epic;
	}

	public String getStoryID() {
		return StoryID;
	}

	public void setStoryID(String storyID) {
		 this.StoryID = StoryID;
	}

	public String getFeatureID() {
		return FeatureID;
	}

	public void setFeatureID(String featureID) {
		this.FeatureID = featureID;
	}

	public String getFeatureDescription() {
		return FeatureDescription;
	}

	public void setFeatureDescription(String featureDescription) {
		this.FeatureDescription = featureDescription;
	}

	public String getFeatureEpic() {
		return FeatureEpic;
	}

	public void setFeatureEpic(String featureEpic) {
		this.FeatureEpic = featureEpic;
	}

	public String getManualTC_status() {
		return ManualTC_status;
	}

	public void setManualTC_status(String manualTC_status) {
		this.ManualTC_status = manualTC_status;
	}

	public String getAssignee() {
		return Assignee;
	}

	public void setAssignee(String assignee) {
		this.Assignee = assignee;
	}

	@Override
	public String toString() {
		return " Jira [ TC_ID = " +TC_ID+ ", Domain_Epic = "+Domain_Epic+", StoryID = "+StoryID+", FeatureID = "+FeatureID+", FeatureDescription = "+FeatureDescription+" + FeatureEpic = "+FeatureEpic+",ManualTC_status = "+ManualTC_status+" + Assignee = "+Assignee+" ]";
	}

	
	
 
}