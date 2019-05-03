package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Jira;

@Repository
public class DaoImpl implements Dao {

	@Autowired
    SessionFactory sessionFactory;	
	
	public Jira findById(String id) {

		return null;
	}

	public List<Jira> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteByJiraId(String id) {
		// TODO Auto-generated method stub
		
	}

	
}
