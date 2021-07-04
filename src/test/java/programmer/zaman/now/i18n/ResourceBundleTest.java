package programmer.zaman.now.i18n;

import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ResourceBundleTest {

	@Test
	public void testResourceBundle() {
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
		
		System.out.println(resourceBundle.getString("hello")); //Hello
		System.out.println(resourceBundle.getString("goodbye")); //Good Bye
		
	}
	
}
