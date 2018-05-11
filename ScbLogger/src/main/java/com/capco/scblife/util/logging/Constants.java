package com.capco.scblife.util.logging;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	
	static Map<String, String> loggerNames;
	static
    {
		loggerNames = new HashMap<String, String>();
		loggerNames.put("Otp", "Otp");
		loggerNames.put("Login", "Login");
		loggerNames.put("PhoneNumber", "PhoneNumber");
		loggerNames.put("SecurityQuestions", "SecurityQuestions");
		loggerNames.put("Payment", "Payment");
		loggerNames.put("Documents", "Documents");
		loggerNames.put("MyAccount", "MyAccount");
		loggerNames.put("PolicyDashboard", "PolicyDashboard");
		loggerNames.put("PushNotification", "PushNotification");
		loggerNames.put("GetFNA", "GetFNA");
		loggerNames.put("GetFit", "GetFit");
		loggerNames.put("ActivityLog", "ActivityLog");
		loggerNames.put("CMS", "CMS");
		loggerNames.put("CustomerRegistration", "CustomerRegistration");
		loggerNames.put("GeneralApplication", "GeneralApplication");
    }

}
