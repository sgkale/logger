package com.capco.scblife.util.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuditLogs implements SCBLogger{

	@SuppressWarnings("rawtypes")
	Class classname;
	private Logger logger=null;

	@SuppressWarnings("rawtypes")
	public AuditLogs(Class classname) {
		this.classname=classname;
		this.logger = LoggerFactory.getLogger("Audit"); 
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
