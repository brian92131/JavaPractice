import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 long milliSec = System.currentTimeMillis();
		 Date currentDate = new Date(milliSec);
		 DateFormat df = new SimpleDateFormat("MMMMMMMMM dd, yyyy hh:mm:ss");
		 //DateFormat simple = new SimpleDateFormat("mm dd yyyy");
		 //Date result = new Date(milliSec);
	     //String theDate = simple.format(result);
	     
	     System.out.println(df.format(currentDate)); 
	}

}
