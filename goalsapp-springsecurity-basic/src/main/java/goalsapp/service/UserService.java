package goalsapp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import goalsapp.repository.UnsecuredRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UnsecuredRepository unsecuredRepository;

	public boolean authenticateUser(String username, String password) {
		return this.unsecuredRepository.isUserExisting(username, password);
	}
}
