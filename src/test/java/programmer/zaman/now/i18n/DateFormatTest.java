package programmer.zaman.now.i18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormatTest {

	@Test
	public void testSimpleDateFormat() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy");
		String format = dateFormat.format(new Date());
		
		System.out.println(format);
		//Monday 05 July 2021
	}
	
	@Test
	public void testSimpleDateFormatLocale() {
		
		String language = "in";
		String country = "ID";
		Locale locale = new Locale(language, country);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy", locale);
		String format = dateFormat.format(new Date());
		
		System.out.println(format);
		//Senin 05 Juli 2021
		
	}
	
	@Test
	public void testSimpleDateFormatLocaleParsing() {
		
		String language = "in";
		String country = "ID";
		Locale locale = new Locale(language, country);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy", locale);

		try {
			Date date = dateFormat.parse("Minggu 28 Februari 2021");
			System.out.println(date);
			//Sun Feb 28 00:00:00 WIB 2021
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}
