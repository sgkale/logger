package com.capco.scblife.util.logging;

public interface SCBLogger {

	void errorLog(String info);

	void debugLog(String info);

	void infoLog(String info);

	void warnLog(String info);

	void warnLog(String info, Object object);

	void errorLog(String info, Object object);

	void debugLog(String info, Object object);

	void infoLog(String info, Object object);

}
