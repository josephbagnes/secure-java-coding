package goalsapp.repository;

import goalsapp.model.User;

public interface UnsecuredRepository {

	boolean isUserExisting(String username, String password);
}
