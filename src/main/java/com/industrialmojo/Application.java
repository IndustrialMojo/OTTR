package com.industrialmojo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

	@SpringBootApplication
	public class Application extends SpringBootServletInitializer {

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Application.class);
	    }
		
//	    public static void main(String[] args) throws Exception {
//	        SpringApplication.run(SpringBootWebApplication.class, args);
//	    }
//	    
//		public static void main(String[] args) {
//	        SpringApplication.run(Application.class, args);
//	    }
//
//	    @Bean
//	    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//	        return args -> {
//
//	            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//	            String[] beanNames = ctx.getBeanDefinitionNames();
//	            Arrays.sort(beanNames);
//	            for (String beanName : beanNames) {
//	                System.out.println(beanName);
//	            }
//
//	        };
//	    }
}
