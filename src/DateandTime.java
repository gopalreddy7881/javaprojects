package practice;

//import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		/*Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal)); //2016/11/16 12:08:43

*/		
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		
		Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));


		
	}

}
