package dao;

import java.util.List;
import model.Jira;

public interface Dao {

	Jira findById(String id);
	
	List<Jira> findAll();

	void deleteByJiraId(String id);
    
    //Set<Jira> findAllEmployees();

    
    
     
     
     
    
}
