import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BirthCertificate extends Document {
    private String fatherName;
    private String motherName;
    private String DOB;


    public String getFatherName() {
        return fatherName;
    }
    
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void add(){
        super.add();
        setFatherName(helper.getNameInput("Enter your father's name: "));
        setMotherName(helper.getNameInput("Enter your mother's name: "));
        setDOB(helper.getDateInput("Enter your date of birth (e.g., YYYY-MM-DD): "));
        System.out.println("Added Successfully!");
    }

    public void displayDetailsGUI() {
        JFrame frame = new JFrame("Birth Certificate Details");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Document Number: " + super.getDocumentNumber()));
        panel.add(new JLabel("Owner Name: " + super.getOwnerName()));
        panel.add(new JLabel("Issue Date: " + super.getIssueDate()));
        panel.add(new JLabel("Father's Name: " + getFatherName()));
        panel.add(new JLabel("Mother's Name: " + getMotherName()));
        panel.add(new JLabel("Date of Birth: " + getDOB()));

        frame.add(panel);
        frame.setVisible(true);
    }

    // The edit method you mentioned
    public void edit() {
        Scanner input = new Scanner(System.in);

        System.out.println("Editing Birth Certificate:");
        System.out.println("1 - Update Owner's Name");
        System.out.println("2 - Update Father's Name");
        System.out.println("3 - Update Mother's Name");
        System.out.println("4 - Update Date of Birth");
        System.out.println("5 - Cancel Edit");

        int editChoice = input.nextInt();

        switch (editChoice) {
            case 1:
                super.setOwnerName(helper.getNameInput("Enter the updated owner's name: "));
                System.out.println("Owner's Name updated successfully.");
                break;

            case 2:
                setFatherName(helper.getNameInput("Enter the updated father's name: "));
                System.out.println("Father's Name updated successfully.");
                break;

            case 3:
                setMotherName(helper.getNameInput("Enter the updated mother's name: "));
                System.out.println("Mother's Name updated successfully.");
                break;

            case 4:
                setDOB(helper.getDateInput("Enter the updated date of birth (e.g., YYYY-MM-DD): "));
                System.out.println("Date of Birth updated successfully.");
                break;

            case 5:
                System.out.println("Edit canceled.");
                break;

            default:
                System.out.println("Invalid choice. Edit canceled.");
                break;
        }
        input.close();
    }

    

}
