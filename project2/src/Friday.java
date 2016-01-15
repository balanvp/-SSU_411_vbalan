import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by balanvp on 15.01.2016.
 *?? ???? ?????? ???, ???????
 */
public class Friday {

    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();

      // calendar.set(Calendar.MONTH,0);
      //  calendar.set(Calendar.DAY_OF_MONTH,13);
       // System.out.println(calendar.getTime());

        String day = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US);

        System.out.println(day);

        Scanner scanner = new Scanner (System.in);
        String pcn = scanner.nextLine();
        //System.out.println(pcn + "12345");

        int year = Integer.parseInt(pcn);
        System.out.println(year -10);

    }
}
