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
                // The loop will continue, prompting the user for input again
            }
        }

        return input;
    }


    public String getDateInput(String prompt) {

        
        return prompt;
    }

    // Other methods...

    // public static void main(String[] args) {
    //     DocumentHelper helper = new DocumentHelper();
    //     String name = helper.getNameInput("Please enter the name: ");
    //     System.out.println("Name entered: " + name);
    // }
}
