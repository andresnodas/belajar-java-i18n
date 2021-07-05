package programmer.zaman.now.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class NumberFormatCurrencyTest {

	@Test
	public void testNumberFormatIndonesia() {
		
		String language = "in";
		String country = "ID";
		
		Locale locale = new Locale(language, country);
		
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		String format = numberFormat.format(10_000_000.255);
		
		System.out.println(format);
		//Rp10.000.000,26
		
	}
	
	@Test
	public void testNumberFormatIndonesiaParse() {
		
		String language = "in";
		String country = "ID";
		
		Locale locale = new Locale(language, country);
		
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		
		try {
			double value = numberFormat.parse("Rp10.000.000.255").doubleValue();
			System.out.println(value);
			
			//1.0000000255E10
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
