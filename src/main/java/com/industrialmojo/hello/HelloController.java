package com.industrialmojo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.industrialmojo.http.JsoupTest;
import com.industrialmojo.movies.MovieRepository;
import com.industrialmojo.movies.Movies;

@RestController
public class HelloController {
    
	@Autowired
	private MovieRepository movieRepository;
    
	@Autowired
	private JsoupTest jsoupTest;

	
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Movies> getAllMovies() {
		// This returns a JSON or XML with the users
		return movieRepository.findAll();
	}

	@RequestMapping("/jsoup")
    public String jsoupTest() {
		
		try {
			jsoupTest.doit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        return "Greetings from JSoup!";
    }
    

//	try {
//		Class.forName("com.mysql.jdbc.Driver");
//		String dbName = "ebdb";
//		String userName = "";
//		String password = "";
//		String hostname = "";
//		String port = "3306";
//		String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName
//				+ "&password=" + password;
//		logger.trace("Getting remote connection with connection string from environment variables.");
//		Connection con = DriverManager.getConnection(jdbcUrl);
//		logger.info("Remote connection successful.");
//		return con;
//	} catch (ClassNotFoundException e) {
//		logger.warn(e.toString());
//	} catch (SQLException e) {
//		logger.warn(e.toString());
//	}



}
