package programmer.zaman.now.i18n;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class MessageFormatTypeTest {

	@Test
	public void testMessageFormatTest() {
		String language = "in";
		String country = "ID";
		Locale locale = new Locale(language, country);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

		String pattern = resourceBundle.getString("status");
		MessageFormat messageFormat = new MessageFormat(pattern, locale);
		String format = messageFormat.format(new Object[] {
			"Andres",
			new Date(),
			10_000_000.255
		});
		
		System.out.println(format);
		//Halo Andres, Sekarang Senin, 05 Juli 2021, saldo Anda adalah Rp10.000.000,26
	}
	
}
