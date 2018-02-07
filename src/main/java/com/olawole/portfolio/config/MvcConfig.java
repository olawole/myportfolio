package com.olawole.portfolio.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@Configuration
//@EnableAutoConfiguration
//@EnableTransactionManagement
//@ComponentScan("com.olawole.portfolio")
//@PropertySource({ "classpath:persistence-mysql.properties" })
public class MvcConfig {
	
	@Autowired
	private Environment env;
	
	private Logger logger = Logger.getLogger(getClass().getName());

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry
//		.addResourceHandler("/resources/**")
//		.addResourceLocations("/resources");
	
//	}
	@Bean
	public DataSource myDataSource() {
		
		// create connection pool
		DriverManagerDataSource myDataSource = new DriverManagerDataSource();

		// set the jdbc driver
		try {
			myDataSource.setDriverClassName("com.mysql.jdbc.Driver");		
		}
		catch (Exception exc) {
			throw new RuntimeException(exc);
		}
		
		// for sanity's sake, let's log url and user ... just to make sure we are reading the data
		logger.info("jdbc.url=" + env.getProperty("jdbc.url"));
		logger.info("jdbc.user=" + env.getProperty("jdbc.user"));
		
		// set database connection props
		myDataSource.setUrl(env.getProperty("jdbc.url"));
		myDataSource.setUsername(env.getProperty("jdbc.user"));
		myDataSource.setPassword(env.getProperty("jdbc.password"));

		return myDataSource;
	}
	
	private Properties getHibernateProperties() {

		// set hibernate properties
		Properties props = new Properties();

		props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		
		return props;				
	}

	
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		
		// create session factorys
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		// set the properties
		sessionFactory.setDataSource(myDataSource());
		sessionFactory.setPackagesToScan(env.getProperty("hiberante.packagesToScan"));
		sessionFactory.setHibernateProperties(getHibernateProperties());
		
		return sessionFactory;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		
		// setup transaction manager based on session factory
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		return txManager;
	}
	
}
