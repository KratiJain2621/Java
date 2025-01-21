package com.dk.pkg;

import org.apache.log4j.Logger;

public class ClassInPkg {
	public static Logger logger = Logger.getLogger(ClassInPkg.class);
	public static void main(String[] args) {
		logger.debug("DEBUG MESSAGE");
		logger.info("INFO");
		logger.warn("warn");
		logger.error("ERROR");
		logger.fatal("FATAL");
	}

}
