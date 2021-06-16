package coreJava;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class MathExample {

	public static void main(String[] args) {
		Double d = 12012484d;
		DecimalFormat df = new DecimalFormat("##,##,##0.00");
		String d1 =  df.format(d);
		System.out.println(d1);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en","IND"));
		String res = nf.format(d);
		System.out.println(res);
		
	}

}
