package programmer.zaman.now.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class NumberFormatTest {

	@Test
	public void testNumberFormat() {
		
		NumberFormat numberFormat = NumberFormat.getInstance();
		String format = numberFormat.format(10_000_000.255);
		
		System.out.println(format);
//		10,000,000.255
	}
	
	@Test
	public void testNumberFormatLocale() {
		
		String language = "in";
		String country = "ID";
		
		Locale locale = new Locale(language, country);
		
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		String format = numberFormat.format(10_000_000.255);
		
		System.out.println(format);
//		10.000.000,255
	}
	
	@Test
	public void testNumberFormatLocaleParse() {
		
		String language = "in";
		String country = "ID";
		
		Locale locale = new Locale(language, country);
		
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		try {
			double number = numberFormat.parse("10.000.000,255").doubleValue();
			System.out.println(number);
//			1.0000000255E7
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
