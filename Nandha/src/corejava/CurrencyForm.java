package corejava;

import java.util.Locale;

import com.ibm.icu.text.NumberFormat;

public class CurrencyForm {

	public static void main(String[] args) {
		Double d = 45065000.458d;
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		String curr = nf.format(d);
		System.out.println(curr);
	}
}
