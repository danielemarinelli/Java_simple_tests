package exercise;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeZones {

	public static void main(String[] args) {
		
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for(String zoneId : zoneIds) {
			System.out.println(zoneId);
		}
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("__________");
		System.out.println(zdt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MMMM dd/yyyy HH:mm:ss a z");
		
		String mfdate = dtf.format(zdt);
		System.out.println("__________");
		System.out.println(mfdate);
	}

}
