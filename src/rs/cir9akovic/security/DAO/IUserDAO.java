package rs.cir9akovic.security.DAO;

import rs.cir9akovic.security.entity.User;

public interface IUserDAO {

	 public User findUserByUsername(String username);
	 public void saveUser(User user);
}
