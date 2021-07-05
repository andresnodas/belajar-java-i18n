package programmer.zaman.now.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTest {

	@Test
	public void testMessageFormat() {
		
		String pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetik `{0}` di pencarian.";
		MessageFormat messageFormat = new MessageFormat(pattern);
		String format = messageFormat.format(new Object[] {"Andres"});//Isi dari parameter
		System.out.println(format);
//		Hi Andres, Anda bisa mencari data Anda dengan mengetik `Andres` di pencarian.
		
	}
	
	@Test
	public void testMessageFormatResourceBundle() {
		
		String language = "in";
		String country = "ID";
		Locale locale = new Locale(language, country);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

		String pattern = resourceBundle.getString("welcome.message");
		MessageFormat messageFormat = new MessageFormat(pattern);
		String format = messageFormat.format(new Object[] {"Andres", "Programmer Zaman Now"});
		
		System.out.println(format);
		//Halo Andres, Selamat Datang di Programmer Zaman Now
	}
	
}
