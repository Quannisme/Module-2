package caseStudy.Validate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.regex.Pattern;

public class Validate {

    private static final String DATE_FORMAT = "^\\d{2}/\\d{2}/\\d{4}$";
    private static final String CMND_FORMAT="^[0-9]{9,12}$";
    private static final String PHONE_FORMAT="^[0][0-9]{9}$";
    private static final String ID_FORMAT="^NV-[0-9]{4}$";
    private static final String ID_CUSTOMER="^KH-[0-9]{4}$";
    public static final String REGEX_EMAIL = "^[\\w.]+@[\\w&&[^_]]+([.][\\w&&[^_]]+){1,2}$";
    private static final String REGEX_FULL_NAME = "[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+((\\s[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+)+)?";
    //nghia
    public static final String NAME_REGEX = "^(?!\\p{Lower})\\p{L}+(?:\\s(?!\\p{Lower})\\p{L}+)*$";
    public static final String NUMBERPHONE_REGEX = "^0[23789]\\d{8}$";
    public static final String ID_CODE_REGEX = "^\\d{9}$|^\\d{12}$";//cmnd

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
    public static boolean isRegexFullName(String name)
    {
        return name.matches(REGEX_FULL_NAME);
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
    public static boolean isEmail(String email){return email.matches(REGEX_EMAIL);}
    public static boolean isCustomer(String idCustomer){return idCustomer.matches(ID_CUSTOMER);}
    public static boolean isFormatDay(String n)
    {
        return n.matches(DATE_FORMAT);
    }
    public static boolean isEnoughAge(Calendar date) {
        int validAge = 365 * 18;
        Calendar now = Calendar.getInstance();
        int ageCheck = now.get(Calendar.YEAR) - date.get(Calendar.YEAR) - 1;
        int dayCheck = now.get(Calendar.MONTH) + (12 - date.get(Calendar.MONTH));
        int check = (ageCheck * 365) + (dayCheck * 30);
        if (check < validAge) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean isValidDate(String date) {
        String dateFormat = "dd/MM/yyyy";
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}
