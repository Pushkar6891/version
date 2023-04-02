package com.company.zoneddatetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

@SuppressWarnings("unused")
public class ZonedDateTimeTest {

	public static void main(String[] args) {

		ZoneId zoneId = ZoneId.of("Asia/Tokyo");

//		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//		availableZoneIds.forEach(System.out::println);

		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(zonedDateTime);
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);

		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);

		System.out.println(offsetDateTime);

	}

}
