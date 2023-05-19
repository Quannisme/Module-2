package caseStudy.Validate;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Validate {

    private static final String DATE_FORMAT = "\\d{2}/\\d{2}/\\d{4}";
    private static final String CMND_FORMAT="^[0-9]{9,12}$";
    private static final String PHONE_FORMAT="^[0-9]{10}$";
    private static final String ID_FORMAT="^NV-[0-9]{4}$";
    public static boolean isDateRight(String dateStr) {
        if (!dateStr.matches(DATE_FORMAT)) {
            return false;
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dateArr = dateStr.split("/");
        int day = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        if (month < 0 || month > 12) {
            return false;
        }
        Year year = Year.of(Integer.parseInt(dateArr[2]));
        if (year.isLeap()) {
            daysInMonth[1] = 29;
        }
        return day >= 0 && day<=daysInMonth[month - 1];
    }

    public static boolean isInOutDateRight(LocalDate inDate, LocalDate outDate) {
        return Period.between(inDate, outDate).getDays() >= 0;
    }
    public static boolean isCMND(String CMND)
    {
        return CMND.matches(CMND_FORMAT);
    }
    public static boolean isId(String ID)
    {
        return ID.matches(ID_FORMAT);
    }
    public static boolean isPhone(String Phone)
    {
        return Phone.matches(PHONE_FORMAT);
    }
}
