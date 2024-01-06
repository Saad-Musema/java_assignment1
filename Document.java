public abstract class Document {
    private String documentNumber;
    private String ownerName;
    private String issueDate;

    DocumentHelper helper = new DocumentHelper();

 
    // Getters and Setters

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }


    public void setOwnerName(String ownerName) {
        try {
            if (ownerName == null || ownerName.trim().isEmpty()) {
                throw new IllegalArgumentException("Owner name cannot be null or empty.");
            }
    
            this.ownerName = ownerName;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            // Optionally, you can log the exception or take other actions
        }
    }
    

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    // Polymorphic methods
    public void add(){
        setDocumentNumber("1234");
        setOwnerName(helper.getNameInput("Enter your full name: "));
        setIssueDate("2023");
    }

    public abstract void edit();
}

