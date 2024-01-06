import java.util.Scanner;

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
    }


    public void displayDetails() {
        System.out.println("Birth Certificate Details:");
        System.out.println("Document Number: " + super.getDocumentNumber());
        System.out.println("Owner Name: " + super.getOwnerName());
        System.out.println("Issue Date: " + super.getIssueDate());
        System.out.println("Father's Name: " + getFatherName());
        System.out.println("Mother's Name: " + getMotherName());
        System.out.println("Date of Birth: " + getDOB());
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
