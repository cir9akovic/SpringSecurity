package rs.cir9akovic.security.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import rs.cir9akovic.security.entity.User;

@Repository
public class UserDAOImpl implements IUserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User findUserByUsername(String username) {
		
		// Return user by username
		return sessionFactory.getCurrentSession().get(User.class, username);
	}

	@Override
	public void saveUser(User user) {
		
		// Current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// Save new Author
		currentSession.saveOrUpdate(user);
		
	}

}
