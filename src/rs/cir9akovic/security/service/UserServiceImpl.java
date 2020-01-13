package rs.cir9akovic.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import rs.cir9akovic.security.DAO.IUserDAO;
import rs.cir9akovic.security.entity.User;

@Service
public class UserServiceImpl implements IUserService{

	 @Autowired
	 private IUserDAO userDAO;
	 
	 @Autowired
	 private BCryptPasswordEncoder bCryptPasswordEncoder;

	 @Override
	 public User findByUsername(String username) {
		 return userDAO.findUserByUsername(username);
	 }

	 @Override
	 public void saveUser(User user) {
		 user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	    // user.setAuthorities();
	     userDAO.saveUser(user);
	 }
}
