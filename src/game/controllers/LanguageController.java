package game.controllers;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageController {
	
	private ResourceBundle labels;
	
	//Konstruktør - gør det muligt at hente værdier fra sprogfilerne fra internationalization-pakken
	public LanguageController(String languageCode)
	{
		Locale local = new Locale(languageCode);
		try {
			labels = ResourceBundle.getBundle("internationalization.MyBundle", local);
		} catch (Exception e) {
				throw e;
			};
	}
	//Modtager en nøgle-værdi og returnere en streng på sproget som er defineret i run.java.
	public String getText(String key)
	{
		String result;
		try {
			result = labels.getString(key);
		} catch (Exception e) {
			result = "Fejl! "+e.getMessage();
		}
		
		return result;
	}
}
