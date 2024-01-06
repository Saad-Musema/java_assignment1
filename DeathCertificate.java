import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DeathCertificate extends Document {
    private String causeOfDeath;
    private String dateOfDeath;


    // Getter for causeOfDeath
    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    // Setter for causeOfDeath
    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    // Getter for dateOfDeath
    public String getDateOfDeath() {
        return dateOfDeath;
    }

    // Setter for dateOfDeath
    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public void add(){
        super.add();
        setCauseOfDeath(helper.getNameInput("Enter cause of Death: "));
        setDateOfDeath(helper.getDateInput("Enter date of Death"));
        System.out.println("Added Successfully!");
    }

public void displayDetailsGUI() {
    JFrame frame = new JFrame("Death Certificate Details");
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    
        panel.add(new JLabel("Death Certificate Details:"));
        panel.add(new JLabel("Document Number: " + super.getDocumentNumber()));
        panel.add(new JLabel("Name: " + super.getOwnerName()));
        panel.add(new JLabel("Issue Date: " + super.getIssueDate()));
        panel.add(new JLabel("Cause of Death: " + getCauseOfDeath()));
        panel.add(new JLabel("Date of Death: " + getDateOfDeath()));

    frame.add(panel);

    frame.setVisible(true);

}

    public void displayDetails() {
        System.out.println("Death Certificate Details:");
        System.out.println("Document Number: " + super.getDocumentNumber());
        System.out.println("Name: " + super.getOwnerName());
        System.out.println("Issue Date: " + super.getIssueDate());
        System.out.println("Cause of Death: " + getCauseOfDeath());
        System.out.println("Date of Death: " + getDateOfDeath());
    }

   public void edit() {
        Scanner input = new Scanner(System.in);

        System.out.println("Editing Death Certificate:");
        System.out.println("1 - Update Owner's Name");
        System.out.println("2 - Update Cause of Death");
        System.out.println("3 - Update Date of Death");
        System.out.println("4 - Cancel Edit");

        int editChoice = input.nextInt();

        switch (editChoice) {
            case 1:
                setOwnerName(helper.getNameInput("Enter the updated owner's name: "));
                System.out.println("Owner's Name updated successfully.");
                break;

            case 2:
                setCauseOfDeath(helper.getNameInput("Enter the updated cause of death: "));
                System.out.println("Cause of Death updated successfully.");
                break;

            case 3:
                setDateOfDeath(helper.getDateInput("Enter the updated date of death (e.g., YYYY-MM-DD): "));
                System.out.println("Date of Death updated successfully.");
                break;

            case 4:
                System.out.println("Edit canceled.");
                break;

            default:
                System.out.println("Invalid choice. Edit canceled.");
                break;
        }

        input.close();
    }
}

