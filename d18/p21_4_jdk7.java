import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class p21_4_jdk7 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date birth = sdf.parse("2006/2/27");
        Date today = new Date();
        long result = (today.getTime()- birth.getTime())/(1000L*60*60*24);
        System.out.println(result);
    }
}
