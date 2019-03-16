import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
//		System.out.println(now);
		
		LocalDateTime nowTime = LocalDateTime.now();
//		System.out.println(nowTime.getDayOfWeek().getDisplayName(TextStyle.FULL	, Locale.JAPAN));
//		System.out.println(nowTime.getDayOfWeek().getDisplayName(TextStyle.FULL	, Locale.CHINA));
//		System.out.println(nowTime.getDayOfWeek().getDisplayName(TextStyle.FULL	, Locale.FRANCE));
//		System.out.println(nowTime.getDayOfWeek().getDisplayName(TextStyle.FULL	, Locale.KOREA));
//		System.out.println(nowTime.getDayOfWeek().getDisplayName(TextStyle.FULL	, Locale.TRADITIONAL_CHINESE));
//		System.out.println(nowTime.getDayOfWeek().getDisplayName(TextStyle.FULL	, Locale.UK));
//		System.out.println(nowTime);
		
		LocalTime time = LocalTime.now();
		
//		System.out.println(time);
		
		
		String date = "15-02-2025";
		System.out.println(date);
		LocalDate parse = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.CANADA));
		
		LocalDate localDate = parse.plusDays(2);
		
		System.out.println(parse);
		
		System.out.println("******************************************");
		
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN)));

		Set<String> availableZone = ZoneId.getAvailableZoneIds();
		
		
		
		for(String s: availableZone) {
			System.out.println(s);
		}
		
		ZonedDateTime zoneDateTime = nowTime.atZone(ZoneId.of("Europe/Paris"));
		
		System.out.println(zoneDateTime);
//		System.out.println(zoneDateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm:ss ")));

		System.out.println(nowTime.atZone(ZoneId.of("America/Los_Angeles")));
	
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plusDays(10);
		
		Period between = Period.between(date1, date2);
		System.out.println(between.getDays());
		
		
	}

}
// Thread Safe Singleton  prochitaty doma