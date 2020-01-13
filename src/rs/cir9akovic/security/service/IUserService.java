package rs.cir9akovic.security.service;

import rs.cir9akovic.security.entity.User;

public interface IUserService {

	void saveUser(User user);
	
	User findByUsername(String username);
}
