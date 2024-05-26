
import java.text.NumberFormat;
import java.util.Locale;


// Format Numbers   US locale and Danish Locale

public class Internalization3 {

	public static void main(String[] args) {
		
		  Locale enLocale = new Locale("en", "US");  
	      Locale daLocale = new Locale("da", "DK");

	      NumberFormat numberFormat = NumberFormat.getInstance(daLocale);

	      System.out.println(numberFormat.format(100.76));

	      numberFormat = NumberFormat.getInstance(enLocale);

	      System.out.println(numberFormat.format(100.76));

	}

}
