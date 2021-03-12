package time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateRange {

	private int findRange(Date d1, Date d2) {
		long diff = d2.getTime() - d1.getTime();
		diff /=(1000*60*60*24);
		return (int)diff;
	}
	
	public static void main(String[] args) {
		DateRange dr = new DateRange();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date start = new Date();
		Date end = null;
		try {
			 end = df.parse("2021-4-7");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int days = dr.findRange(start,end);
		System.out.println("Num of days: "+days);
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(start);
		for(int i=0;i<days;i++) {
			System.out.println(df.format(cal1.getTime()));
			cal1.add(Calendar.DATE, 1);
		}
	}
}
