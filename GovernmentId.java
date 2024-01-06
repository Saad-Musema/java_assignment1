import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



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
        setPhoneNumber(helper.getPhoneNumberInput("Enter your phone number: "));
        System.out.println("Added Successfully!");
    }

   public void displayDetailsGUI() {
    JFrame frame = new JFrame("Government ID Details");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    panel.add(new JLabel("Document Number: " + getDocumentNumber()));
    panel.add(new JLabel("Owner Name: " + getOwnerName()));
    panel.add(new JLabel("Issue Date: " + getIssueDate()));
    panel.add(new JLabel("Date of Birth: " + getDOB()));
    panel.add(new JLabel("Place of Birth: " + getPlaceOfBirth()));
    panel.add(new JLabel("Expiry Date: " + getExpiryDate()));
    panel.add(new JLabel("Address: " + getAddress()));
    panel.add(new JLabel("Phone Number: " + getPhoneNumber()));

    frame.add(panel);
    frame.setVisible(true);
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
    

    




