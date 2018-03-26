import java.text.SimpleDateFormat;
import java.util.Calendar;

public class class15_date_neelesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		String strDate=sdf.format(cal.getTime());
		System.out.println(strDate);
	}

}
