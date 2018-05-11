package com.capco.scblife.util.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationLogs implements SCBLogger{
	@SuppressWarnings("rawtypes")
	Class classname;
	private Logger logger=null;

	@SuppressWarnings("rawtypes")
	public ApplicationLogs(Class classname,String applicationName) {
		this.classname=classname;
		if(Constants.loggerNames.containsKey(applicationName)) {
			this.logger = LoggerFactory.getLogger(Constants.loggerNames.get(applicationName)); 
		}
		else {
			this.logger = LoggerFactory.getLogger(Constants.loggerNames.get("GeneralApplication")); 
		}
		 
	}
	public void infoLog(String info) {
		this.logger.info(classname+" "+"message -"+info);	
		
	}
	public void debugLog(String info) {
		this.logger.debug(classname+" "+"message -"+info);	
	}
	public void errorLog(String info) {
		this.logger.error(classname+" "+"message -"+info);	
	}
	public void warnLog(String info) {
		this.logger.warn(classname+" "+"message -"+info);
	}
	
	public void infoLog(String info,Object object) {
		logger.info(classname+" "+"message -"+info, object);		
	}
	public void debugLog(String info,Object object) {
		logger.debug(classname+" "+"message -"+info,object);	
	}
	public void errorLog(String info,Object object) {
		logger.error(classname+" "+"message -"+info,object);	
	}
	public void warnLog(String info,Object object) {
		logger.warn(classname+" "+"message -"+info,object);
	}

}
