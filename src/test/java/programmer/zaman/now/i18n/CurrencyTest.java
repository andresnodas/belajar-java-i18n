package programmer.zaman.now.i18n;

import java.util.Currency;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class CurrencyTest {

	@Test
	public void testCurrency() {
		
		String language = "in";
		String country = "ID";
		
		Locale locale = new Locale(language, country);
		
		Currency currency = Currency.getInstance(locale);
		
		System.out.println(currency.getDisplayName()); //Indonesian Rupiah
		System.out.println(currency.getCurrencyCode()); //IDR
		System.out.println(currency.getSymbol(locale)); //Rp
		
	}
	
}
