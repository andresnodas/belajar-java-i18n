package programmer.zaman.now.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ChoiceMessageFormatTest {

	@Test
	public void testChoiceMessageFormat() {
		String language = "in";
		String country = "ID";
		Locale locale = new Locale(language, country);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

		String pattern = resourceBundle.getString("balance");
		MessageFormat messageFormat = new MessageFormat(pattern, locale);
		String format = messageFormat.format(new Object[] {
			10_000_000
		});
		
		System.out.println(format);
		//Jumlah Saldo : Rp10.000.000,00 Tersedia
		
		String formatMinus = messageFormat.format(new Object[] {
			-10_000_000
		});
		
		System.out.println(formatMinus);
		//Jumlah Saldo : -Rp10.000.000,00 Hutang 
	}
	
}
