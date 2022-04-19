//first line must be the name of your pacakge 

package com.sayana.Namaste.Nepal.controller;

/**
 * import files
 */
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
/**
 * 
 * @author N.Roshyara
 *  @ scans the component Controller. 
 */
public class NamasteNepalController {
  @GetMapping("/namaste")
	public String index() {
	System.out.println("I am Nab Raj");  
   return 	 "Namate hello! \n How are you ?";
}
  
}