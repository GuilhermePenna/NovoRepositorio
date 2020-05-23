import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DataMain {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = sdf1.parse("15/04/2002");
		Date x2 = sdf2.parse("15/04/2002 11:27:30");
		Date d1 = new Date();
		Date d0 = new Date(0L); // o java armazena datas a partir da meia noite de  1 de janeiro de 1970
		Date d4 = new Date(1000L*60L*60L*5L);
		Date y1 = Date.from(Instant.parse("2020-05-23T11:49:07Z"));
		
		
		System.out.println("x1: "+sdf1.format(x1));
		System.out.println("x2: "+sdf2.format(x2));
		System.out.println("d1: "+ sdf2.format(d1));
		System.out.println("d0: "+ sdf2.format(d0));
		System.out.println("d4: "+ sdf2.format(d4));
		System.out.println("y1: "+ sdf2.format(y1));
		System.out.println("--------------------------------");
		
		System.out.println("x1: "+sdf3.format(x1));
		System.out.println("x2: "+sdf3.format(x2));
		System.out.println("d1: "+ sdf3.format(d1));
		System.out.println("d0: "+ sdf3.format(d0));
		System.out.println("d4: "+ sdf3.format(d4));
		System.out.println("y1: "+ sdf3.format(y1));
	}

}
