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
            }
        }

        return input;
    }



    public String getDateInput(String prompt) {


        return prompt;
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
