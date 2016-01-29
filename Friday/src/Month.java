import java.util.Calendar;
import java.util.Scanner;


public class Month
{
    public static void res(int month)
    {
        int quantity = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.MONTH, month);
        for(int i=1800; i<=2015; i++)
        {
            calendar.set(calendar.YEAR, i);
            calendar.set(calendar.DAY_OF_MONTH, 12);
            if (calendar.get(calendar.DAY_OF_WEEK)==5)
            {
                System.out.println(calendar.get(calendar.YEAR));
                quantity++;
            }
        }
        System.out.println("??????????: " + quantity);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("??????? ?????: ");
        String sc = scanner.nextLine();
        try
        {
            int month = Integer.parseInt(sc);
            if (month >= 0 && month <= 11)
                res(month);
            else
                System.err.println("ERROR ??????? ????? ?? ?????????");
        }
        catch (NumberFormatException e)
        {
            System.err.println("???????????");
        }
    }
}