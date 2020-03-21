package secao11Date;

import java.text.DateFormat;
import java.time.*;
import java.util.Calendar;

public class ProgramDate {

	public static void main(String[] args) {

		System.out.println("Date e Calendar ********************************");
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		
		DateFormat[] dateFormat = new DateFormat[6];
		
		dateFormat[0] = DateFormat.getInstance();
		dateFormat[1] = DateFormat.getDateInstance();
		dateFormat[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dateFormat[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dateFormat[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dateFormat[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for (DateFormat df : dateFormat) {
			System.out.println(df.format(calendar.getTime()));
		}
		
		System.out.println("*************************************************");
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(Instant.now()); //Data + hora + GMT	(antigo Date)
		System.out.println(ZonedDateTime.now()); //Data + hora + fuso horário	
		
		System.out.println("*************************************************\n");
		System.out.println("*****DURATION (TEMPO) ************************************");
		
		System.out.println(Duration.ofDays(1));
		System.out.println(Duration.ofHours(48));
		System.out.println(Duration.ofMinutes(120));
		
		System.out.println("*************************************************\n");
		
		System.out.println("***calcular a idade exata de alguém com \"Period\" *************");

		LocalDate ltNow = LocalDate.now();
		LocalDate nasc = LocalDate.of(1985, 3, 23);
		Period between = Period.between(ltNow, nasc);
		System.out.println("LocalDate.now() -> "+ltNow);
		System.out.println("LocalDate.of() -> "+nasc);
		System.out.println("LocalDate.bwtween() -> "+between);
		
		System.out.println("*************************************************\n");
		
		System.out.println("***QUANDO USAR Instant, LocalDateTime e ZonedDateTime*************");
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
