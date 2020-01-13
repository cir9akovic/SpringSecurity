package rs.cir9akovic.security.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import static org.hibernate.cfg.Environment.*;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import rs.cir9akovic.security.entity.Authorities;
import rs.cir9akovic.security.entity.User;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="rs.cir9akovic.security")
public class AppConfig {

	
	// In Spring based application LocalSessionFactoryBean class is used to create a Hibernate SessionFactory.
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		
		Properties props = new Properties();
		
		// Settings for JDBC properties
		props.put(DRIVER, "com.mysql.cj.jdbc.Driver");
	    props.put(URL, "jdbc:mysql://localhost:3306/securityDemo?useSSL=false");
	    props.put(USER, "root");
	    props.put(PASS, "toor");
		
		// Settings for Hibernate properties
	    props.put(SHOW_SQL, true);
	    props.put(HBM2DDL_AUTO, "validate");
	    
	    // Setting C3P0 properties
	    props.put(C3P0_MIN_SIZE, 5);
	    props.put(C3P0_MAX_SIZE, 20);
	    props.put(C3P0_ACQUIRE_INCREMENT, 1);
	    props.put(C3P0_TIMEOUT, 1000);
	    props.put(C3P0_MAX_STATEMENTS, 150);
	    
	    // Import props into factory bean
	    factoryBean.setHibernateProperties(props);
	    // Set classes for hibernate
	    factoryBean.setAnnotatedClasses(User.class, Authorities.class);
		
		return factoryBean;
	}
	
	// Setting up Transaction Manager
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		
		return transactionManager;
	}
	
}
