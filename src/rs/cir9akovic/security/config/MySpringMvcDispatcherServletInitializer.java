package rs.cir9akovic.security.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[] { AppConfig.class, MyAappSecurityConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		// Return my configuration class
		return new Class[] {MyWebAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		// Servlet mapping
		return new String[] {"/"};
	}

}
