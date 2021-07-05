package programmer.zaman.now.i18n;

import java.text.ChoiceFormat;

import org.junit.jupiter.api.Test;

public class ChoiceFormatTest {

	@Test
	public void testChoiceFormat() {
		String pattern = "-1#negatif | 0#kosong | 1#satu | 1<banyak";
		ChoiceFormat choiceFormat = new ChoiceFormat(pattern);

		System.out.println(choiceFormat.format(-5)); //negatif
		System.out.println(choiceFormat.format(-1)); //negatif
		System.out.println(choiceFormat.format(0)); //kosong
		System.out.println(choiceFormat.format(1)); //satu
		System.out.println(choiceFormat.format(2)); //banyak
	}
	
}
