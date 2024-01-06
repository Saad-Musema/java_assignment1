public class DeathCertificate extends Document {
    private String causeOfDeath;
    private String dateOfDeath;

    // Constructor, other methods, and fields...

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
    }

    public void displayDetails() {
        System.out.println("Death Certificate Details:");
        System.out.println("Document Number: " + getDocumentNumber());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Issue Date: " + getIssueDate());
        System.out.println("Cause of Death: " + getCauseOfDeath());
        System.out.println("Date of Death: " + getDateOfDeath());
    }

    // The edit method you mentioned
    public void edit() {
        // Implementation of the edit method
    }
}

