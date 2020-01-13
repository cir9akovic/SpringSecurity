package rs.cir9akovic.security.service;

public interface ISecurityService {

	// Provide current logged-in user and auto login user after registration 
	public String findLoggedinUsername();
	
	public void autoLogIn(String username, String password);
}
