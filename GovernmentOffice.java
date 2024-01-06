import java.util.ArrayList;
import java.util.Scanner;

public class GovernmentOffice {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<GovernmentId> governmentIds = new ArrayList<>();
    private static ArrayList<BirthCertificate> birthCertificates = new ArrayList<>();
    private static ArrayList<DeathCertificate> deathCertificates = new ArrayList<>();

    public static void main(String[] args) {
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

                    GovernmentId governmentId = new GovernmentId();

                    // Choose whether to add or edit
                    int operationChoice;
                    do {
                        System.out.println("Choose operation:");
                        System.out.println("1 - Add");
                        System.out.println("2 - Edit");
                        operationChoice = input.nextInt();

                        if (operationChoice == 1) {
                            governmentId.add();
                            governmentIds.add(governmentId);
                            governmentId.displayDetailsGUI();
                        } else if (operationChoice == 2) {
                            System.out.println("Please input document ID you want to edit: ");
                            String documentId = input.next();
                            boolean found = false;
                            try{
                                for (GovernmentId govId : governmentIds) {
                                if (govId.getDocumentNumber().equals(documentId)) {
                                    found = true;
                                    govId.edit();

                                    govId.displayDetailsGUI();
                                    break;
                                    }

                                }

                            if (!found) {
                                System.out.println("Document with ID " + documentId + " not found!");
                                        }
                            }
                            catch (IndexOutOfBoundsException e) {
                                System.out.println("Index out of bounds: " + e.getMessage());}

                        } else {
                            System.out.println("Invalid operation choice. Please enter 1 for Add or 2 for Edit.");
                        }
                    } while (operationChoice != 1 && operationChoice != 2);
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
                            birthCertificates.add(birthCertificate);
                            birthCertificate.displayDetailsGUI();
                        } else if (operationChoice == 2) {
                            System.out.println("Please input document ID you want to edit: ");
                            String documentId = input.next();
                            boolean found = false;
                            try{
                                for (BirthCertificate birthCert : birthCertificates) {
                                if (birthCert.getDocumentNumber().equals(documentId)) {
                                    found = true;
                                    birthCert.edit();
                                    birthCert.displayDetailsGUI();
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("Document with ID " + documentId + " not found!");
                            }
                            }
                            catch (IndexOutOfBoundsException e) {
                                System.out.println("Index out of bounds: " + e.getMessage());}

                            
                        } else {
                            System.out.println("Invalid operation choice. Please enter 1 for Add or 2 for Edit.");
                        }
                    } while (operationChoice != 1 && operationChoice != 2);
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
                            deathCertificates.add(deathCertificate);
                            deathCertificate.displayDetailsGUI();
                        } else if (operationChoice == 2) {
                            System.out.println("Please input document ID you want to edit: ");
                            String documentId = input.next();
                            boolean found = false;
                            try{
                                for (DeathCertificate deathCert : deathCertificates) {
                                if (deathCert.getDocumentNumber().equals(documentId)) {
                                    found = true;
                                    deathCert.edit();
                                    deathCert.displayDetailsGUI();
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("Document with ID " + documentId + " not found!");
                            }
                            }catch (IndexOutOfBoundsException e) {
                                System.out.println("Index out of bounds: " + e.getMessage());}
                            
                        } else {
                            System.out.println("Invalid operation choice. Please enter 1 for Add or 2 for Edit.");
                        }
                    } while (operationChoice != 1 && operationChoice != 2);
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




