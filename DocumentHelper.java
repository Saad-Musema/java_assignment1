import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DocumentHelper {
    private Scanner scanner;

    public DocumentHelper() {
        this.scanner = new Scanner(System.in);
    }

    public String getNameInput(String prompt) {
        String input = null;

        while (input == null || input.trim().isEmpty()) {
            try {
                System.out.print(prompt);
                input = scanner.nextLine();

                if (input == null || input.trim().isEmpty()) {
                    throw new IllegalArgumentException("This field cannot be null or empty.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        return input;
    }



final static String DATE_FORMAT = "yyyy-MM-dd";



public String getDateInput(String prompt) {
    String date = null;

    while (date == null || !isDateValid(date)) {
        try {
            System.out.print(prompt);
            date = scanner.nextLine();

            if (date == null || !isDateValid(date)) {
                throw new IllegalStateException("Invalid date format. Please enter a valid date in the format: " + DATE_FORMAT);
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    return date;
}

public static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);

            Calendar cal = Calendar.getInstance();
            cal.setTime(df.parse(date));

            // Additional checks for month and year
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH) + 1; // Calendar.MONTH is zero-based

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);

            // Check that the month is between 1 and 12 and the year is not above the present date
            return month > 0 && month <= 12 && year <= currentYear;
        } catch (ParseException e) {
            return false;
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            return false;
        }
    }



private static final String PHONE_NUMBER_REGEX = "(09|07)\\d{8}";

    //Expression to cross check if phone number is valid or not


    public String getPhoneNumberInput(String prompt) {
        String phoneNumber = null;
    
        while (phoneNumber == null || !phoneNumber.matches(PHONE_NUMBER_REGEX)) {
            try {
                System.out.print(prompt);
                phoneNumber = scanner.nextLine();
    
                if (phoneNumber == null || !phoneNumber.matches(PHONE_NUMBER_REGEX)) {
                    throw new IllegalStateException("Invalid phone number format. Please enter a valid phone number.");
                }
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    
        return phoneNumber;
    }
    

}
