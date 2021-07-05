package programmer.zaman.now.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ResourceBundleTest {

	@Test
	public void testResourceBundle() {
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
		
		System.out.println(resourceBundle.getString("hello")); //Hello
		System.out.println(resourceBundle.getString("goodbye")); //Good Bye
		
	}
	
	@Test
	public void testLocaleResourceBundle() {
		
		String language = "in";
		String country = "ID";
		
		Locale locale = new Locale(language, country);
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
		
		System.out.println(resourceBundle.getString("hello")); //Halo
		System.out.println(resourceBundle.getString("goodbye")); //Selamat Tinggal
		
	}
	
	@Test
	public void testNotFoundLocaleResourceBundle() {
		String language = "en";
		String country = "US";
		
		Locale locale = new Locale(language, country);
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
		
		System.out.println(resourceBundle.getString("hello")); //Hello
		System.out.println(resourceBundle.getString("goodbye")); //Good Bye
	}
	
}
