public class BirthCertificate extends Document {
    private String fatherName;
    private String motherName;
    private String DOB;

    // Constructor, other methods, and fields...

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
        setFatherName(helper.getNameInput("Enter your father's name"));
        setMotherName(helper.getNameInput("Enter your mother's name: "));
        setDOB(helper.getDateInput("Enter your date of birth (e.g., YYYY-MM-DD): "));
    }


    public void displayDetails() {
        System.out.println("Birth Certificate Details:");
        System.out.println("Document Number: " + getDocumentNumber());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Issue Date: " + getIssueDate());
        System.out.println("Father's Name: " + getFatherName());
        System.out.println("Mother's Name: " + getMotherName());
        System.out.println("Date of Birth: " + getDOB());
    }

    // The edit method you mentioned
    public void edit() {
        // Implementation of the edit method
    }
}
