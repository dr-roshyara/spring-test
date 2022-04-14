package com.sayana.Namaste.Nepal.controller;
import org.springframework.stereotype.Controller; 
@Controller("/namaste")
/**
 * 
 * @author N.Roshyara
 *  @ scans the component Controller. 
 */
public class NamasteNepalController {
  public String getName() {
	System.out.println("I am Nab Raj");  
   return 	 "first time Print";
}
  
}