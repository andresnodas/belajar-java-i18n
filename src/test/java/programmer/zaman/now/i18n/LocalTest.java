package programmer.zaman.now.i18n;

import java.util.Locale;

import org.junit.jupiter.api.Test;

public class LocalTest {

	@Test
	public void testNewLocale() {
		
		String language = "id";
		String country = "ID";
		
		Locale locale = new Locale(language, country);
		
		System.out.println(locale.getLanguage()); //in
		System.out.println(locale.getCountry()); //ID
		
		System.out.println(locale.getDisplayLanguage()); //Indonesian
		System.out.println(locale.getDisplayCountry()); //Indonesia
	}
	
}
