package demo.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value =  {"/{param}"}, method = RequestMethod.GET)  
	public String hello(@PathVariable(required = false,value="param") String param){  
		return "Hello CI Test, ur param is: " + param;  
	}  
	
	@RequestMapping(value =  {"/"}, method = RequestMethod.GET)  
	public String hello(){  
		return "Hello CI Test, ur param is: {empty}";  
	}  
}