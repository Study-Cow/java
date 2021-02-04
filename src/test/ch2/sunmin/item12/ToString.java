package test.ch2.sunmin.item12;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ToString {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		BigDecimal a = new BigDecimal(1);
		String str_bigDecimal = a.toString();
		BigDecimal bigDeicmal_again = new BigDecimal(str_bigDecimal);
		System.out.println(a.toString());
		
		URL url_a = new URL("http", "sunmin", "10.203.1.235");
		
		URL url_b = new URL("http", "mongsil", "10.203.1.235");
		
		URI uri_a = url_a.toURI();
		
		URI uri_b = url_b.toURI();
		
//		System.out.print(url_a.equals(url_b));
		System.out.print(uri_a.equals(uri_b));
	}
}
