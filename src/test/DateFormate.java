package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateFormate {

	@Test
	public void SimpleDateFormate_test() throws Exception {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = format.parse("2017-09-29");
		
		System.out.println(date);
	}
	
}
