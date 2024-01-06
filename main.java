import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the funny world of Government Office!");
int choice;

do {
    System.out.println("Choose the type of document:");
    System.out.println("1 - Government ID");
    System.out.println("2 - Birth Certificate");
    System.out.println("3 - Death Certificate");
    System.out.println("4 - Exit");

    choice = input.nextInt();

    switch (choice) {
        case 1:
            System.out.println("You have chosen to work with a Government ID");

            GovernmentId person1 = new GovernmentId();

            // Choose whether to add or edit
            int operationChoice;
            do {
                System.out.println("Choose operation:");
                System.out.println("1 - Add");
                System.out.println("2 - Edit");
                operationChoice = input.nextInt();

                if (operationChoice == 1) {
                    person1.add();
                } else if (operationChoice == 2) {
                    person1.edit();  // Add the logic for editing Government ID details
                } else {
                    System.out.println("Invalid operation choice. Please enter 1 for Add or 2 for Edit.");
                }
            } while (operationChoice != 1 && operationChoice != 2);

            person1.displayDetails();
            break;

        case 2:
            System.out.println("You have chosen to work with a Birth Certificate");

            BirthCertificate birthCertificate = new BirthCertificate();

            // Choose whether to add or edit
            do {
                System.out.println("Choose operation:");
                System.out.println("1 - Add");
                System.out.println("2 - Edit");
                operationChoice = input.nextInt();

                if (operationChoice == 1) {
                    birthCertificate.add();
                } else if (operationChoice == 2) {
                    birthCertificate.edit();
                } else {
                    System.out.println("Invalid operation choice. Please enter 1 for Add or 2 for Edit.");
                }
            } while (operationChoice != 1 && operationChoice != 2);

            birthCertificate.displayDetails();
            break;

        case 3:
            System.out.println("You have chosen to work with a Death Certificate");

            DeathCertificate deathCertificate = new DeathCertificate();

            // Choose whether to add or edit
            do {
                System.out.println("Choose operation:");
                System.out.println("1 - Add");
                System.out.println("2 - Edit");
                operationChoice = input.nextInt();

                if (operationChoice == 1) {
                    deathCertificate.add();
                } else if (operationChoice == 2) {
                    deathCertificate.edit();
                } else {
                    System.out.println("Invalid operation choice. Please enter 1 for Add or 2 for Edit.");
                }
            } while (operationChoice != 1 && operationChoice != 2);

            deathCertificate.displayDetails();
            break;

        case 4:
            System.out.println("Exiting the program. Goodbye!");
            break;

        default:
            System.out.println("Invalid choice. Please enter a valid option.");
            break;
    }
} while (choice != 4);

input.close();
}

}

