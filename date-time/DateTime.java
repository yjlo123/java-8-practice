import java.time.*;

public class DateTime {
	public static void main(String[] args) {
		// Get the system clock as UTC offset
		final Clock clock = Clock.systemUTC();
		System.out.println( clock.instant() );
		System.out.println( clock.millis() );
		
		// Get the local date and local time
		final LocalDate date = LocalDate.now();
		final LocalDate dateFromClock = LocalDate.now( clock );
		
		System.out.println( date );
		System.out.println( dateFromClock );
		
		// Get the local date and local time
		final LocalTime time = LocalTime.now();
		final LocalTime timeFromClock = LocalTime.now( clock );
		
		System.out.println( time );
		System.out.println( timeFromClock );
		
		// Get the local date/time
		final LocalDateTime datetime = LocalDateTime.now();
		final LocalDateTime datetimeFromClock = LocalDateTime.now( clock );
		
		System.out.println( datetime );
		System.out.println( datetimeFromClock );
		
		// Get the zoned date/time
		final ZonedDateTime zonedDateTime = ZonedDateTime.now();
		final ZonedDateTime zonedDateTimeFromClock = ZonedDateTime.now( clock );
		final ZonedDateTime zonedDateTimeFromZone = ZonedDateTime.now( ZoneId.of( "America/Los_Angeles" ) );
		
		System.out.println( zonedDateTime );
		System.out.println( zonedDateTimeFromClock );
		System.out.println( zonedDateTimeFromZone );
		
		// Get duration between two dates
		final LocalDateTime from = LocalDateTime.of( 2015, Month.APRIL, 16, 0, 0, 0 );
		final LocalDateTime to = LocalDateTime.of( 2016, Month.AUGUST, 29, 23, 59, 59);
		
		final Duration duration = Duration.between( from, to );
		System.out.println( "Duration in days: " + duration.toDays() );
		System.out.println( "Duration in hours: " + duration.toHours() );
	}
}