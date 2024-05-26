
import java.text.NumberFormat;
import java.util.Locale;


// Format Percentages

public class Internalization5 {

	public static void main(String[] args) {
		
		
		 Locale enLocale = new Locale("en", "US");        

	     NumberFormat numberFormat = NumberFormat.getPercentInstance(enLocale);

	     System.out.println(numberFormat.format(0.76));

	}

}
