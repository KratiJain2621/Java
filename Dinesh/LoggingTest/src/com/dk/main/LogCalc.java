package com.dk.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.dk.pkg.ClassInPkg;

@SuppressWarnings("unused")
public class LogCalc {
	
	private static final Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) {
		
		logger.trace("the value of list items is this");		
		logger.debug("the method was called with the following arguments");
		logger.info("the library was installed or message from the server was not received");
		logger.warn("the library to convert xml was not found using default lib");
		//normally in catch block
		logger.error("the exception with values occured");
		logger.fatal("Sorry please restart the software/system");
		
		logger.info("Add completed");
		logger.error("error occured");
		logger.debug("Debug message");
		logger.trace("this is trace");
		logger.warn("Warning message");
		
	}

}
