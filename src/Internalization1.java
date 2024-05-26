import java.util.Locale;


// Java Internalization - Example - Locale Details

public class Internalization1 {

	public static void main(String[] args) {
		 
		  Locale locale =Locale.getDefault();  

	      System.out.println("Default Locale Properties:\n");

	      System.out.println(locale.getDisplayCountry());  
	      System.out.println(locale.getDisplayLanguage());  
	      System.out.println(locale.getDisplayName());  
	      System.out.println(locale.getISO3Country());  
	      System.out.println(locale.getISO3Language());  
	      System.out.println(locale.getLanguage());  
	      System.out.println(locale.getCountry());  

	      Locale frenchLocale = new Locale("fr","fr");

	      System.out.println("\nfr Locale Properties:\n");
	      System.out.println(frenchLocale.getDisplayCountry());  
	      System.out.println(frenchLocale.getDisplayLanguage());  
	      System.out.println(frenchLocale.getDisplayName());  
	      System.out.println(frenchLocale.getISO3Country());  
	      System.out.println(frenchLocale.getISO3Language());  
	      System.out.println(frenchLocale.getLanguage());  
	      System.out.println(frenchLocale.getCountry());  

	}

}

/*
  Internalization or I18N refers to the capability of an Application to be able to serve users in multiple and different 
  languages. Java has in-built support for Internalization. Java also provides formatting of numbers, currencies and 
  adjustment of date and time accordingly.

  Java Internationalization helps to make a java application handle different languages, number formats, currencies, 
  region specific time formatting.
 */
