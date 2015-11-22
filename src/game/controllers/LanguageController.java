package game.controllers;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageController {
	
	private ResourceBundle labels;
	
	//Konstrukt�r - g�r det muligt at hente v�rdier fra sprogfilerne fra internationalization-pakken
	public LanguageController(String languageCode)
	{
		Locale local = new Locale(languageCode);
		try {
			labels = ResourceBundle.getBundle("internationalization.MyBundle", local);
		} catch (Exception e) {
				throw e;
			};
	}
	//Modtager en n�gle-v�rdi og returnere en streng p� sproget som er defineret i run.java.
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
