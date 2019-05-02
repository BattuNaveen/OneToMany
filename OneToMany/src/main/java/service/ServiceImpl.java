package service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import model.Jira;

@Service
@Transactional
public class ServiceImpl implements OMService {

	public Jira findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Jira> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteJiraById(String id) {
		// TODO Auto-generated method stub
		
	}

	
}


