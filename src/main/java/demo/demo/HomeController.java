package demo.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class HomeController {
	Logger logger = LogManager.getLogger(getClass());

	@RequestMapping(value =  {"/{param}"}, method = RequestMethod.GET)  
	public String hello(@PathVariable(required = false,value="param") String param){  
		logger.info("Hello CI Test, ur param is:" + param);
		return "Hello CI Test, ur param is: " + param;  
	}  
	
	@RequestMapping(value =  {"/"}, method = RequestMethod.GET)  
	public String hello(){  
		return "Hello CI Test, ur param is: {empty}";  
	}  
}