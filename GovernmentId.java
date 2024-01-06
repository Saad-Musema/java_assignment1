import java.util.Scanner;



public class GovernmentId extends Document {
    private String DOB;
    private String placeOfBirth;
    private String expiryDate;
    private String address;
    private String phoneNumber;

    Scanner input = new Scanner(System.in);

    // public GovernmentId(String DOB, String expiryDate, String phoneNumber) {

    //     super();
    //     this.DOB = DOB;
    //     setPlaceOfBirth(helper.getNameInput("Enter your place of birth: "));
    //     this.expiryDate = expiryDate;
    //     setAddress(helper.getNameInput("Enter your address: "));
    //     this.phoneNumber = phoneNumber;
    // }
    // Getters and Setters for new attributes

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void add() {
        super.add();
        setPlaceOfBirth(helper.getNameInput("Enter your place of birth: "));
        setAddress(helper.getNameInput("Enter your address: "));
    }

    public void displayDetails() {
        System.out.println("Government ID Details:");
        System.out.println("Document Number: " + getDocumentNumber());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Issue Date: " + getIssueDate());
        System.out.println("Date of Birth: " + getDOB());
        System.out.println("Place of Birth: " + getPlaceOfBirth());
        System.out.println("Expiry Date: " + getExpiryDate());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
    }
    
    public void edit() {
        System.out.println("Greetings! What do you want to edit?");
        int choice;
    
        do {
            System.out.println("1. Owner Name");
            System.out.println("2. Date of Birth");
            System.out.println("3. Place of Birth");
            System.out.println("4. Expiry Date");
            System.out.println("5. Address");
            System.out.println("6. Phone Number");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.println("Please input the new owner name: ");
                    super.setOwnerName(helper.getNameInput("Enter the new owner name: "));
                    break;
                case 2:
                    System.out.println("Please input the new date of birth (e.g., YYYY-MM-DD): ");
                    setDOB(helper.getDateInput("Enter the new date of birth: "));
                    break;
                case 3:
                    System.out.println("Please input the new place of birth: ");
                    setPlaceOfBirth(helper.getNameInput("Enter the new place of birth: "));
                    break;
                case 4:
                    System.out.println("Please input the new expiry date (e.g., YYYY-MM-DD): ");
                    setExpiryDate(helper.getDateInput("Enter the new expiry date: "));
                    break;
                case 5:
                    System.out.println("Please input the new address: ");
                    setAddress(helper.getNameInput("Enter the new address: "));
                    break;
                case 6:
                    System.out.println("Please input the new phone number: ");
                    setPhoneNumber(helper.getNameInput("Enter the new phone number: "));
                    break;
                case 7:
                    System.out.println("Exiting edit mode.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 7);
    }
    
    }
    

    




