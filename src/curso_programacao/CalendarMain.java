package curso_programacao;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		//MANIPULANDO UMA DATA USANDO CALENDAR..
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		
		Calendar cal  = Calendar.getInstance(); // declarando variavel do tipo Calendar
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY,4); //adiciona mais 4 horas em alguma data 
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1+cal.get(Calendar.MONTH); // o mes comeca no valor  0 ,entao sempre temos q adicionar mais  um
		System.out.println(sdf.format(d));
		System.out.println("minutes: "+ minutes);
		System.out.println("Month: "+ month);
	}  

}
