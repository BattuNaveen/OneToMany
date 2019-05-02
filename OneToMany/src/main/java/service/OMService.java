package service;

import java.util.List;
import model.Jira;

public interface OMService {
	Jira findById(String id);
	List<Jira> findAll();
    void deleteJiraById(String id);
    

}
