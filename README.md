**Project Context:**
The Polymorphic Document Management System is envisioned to address specific challenges encountered at Kebele Offices, 
where diverse document creation and management tasks are inherent. Recognizing the need for a versatile and scalable solution, 
the project introduces a superclass named "Document" and extends it with three subclasses: "GovernmentId," "BirthCertificate," and "DeathCertificate."

**Attributes:**
1. **Document (Superclass):**
   - `documentNumber`: A unique identifier for each document.
   - `ownerName`: The name of the document owner.
   - `issueDate`: The date when the document was issued.

2. **GovernmentId (Subclass):**
   - Inherits attributes from the superclass (documentNumber, ownerName, issueDate).
   - `DOB` (Date of Birth): The birthdate of the document owner.
   - `placeOfBirth`: The birthplace of the document owner.
   - `expiryDate`: The expiration date of the government ID.

3. **BirthCertificate (Subclass):**
   - Inherits attributes from the superclass (documentNumber, ownerName, issueDate).
   - `DOB` (Date of Birth): The birthdate of the individual.
   - `placeOfBirth`: The birthplace of the individual.
   - `fathername` and `mothername`

4. **DeathCertificate (Subclass):**
   - Inherits attributes from the superclass (documentNumber, ownerName, issueDate).
   - `causeOfDeath`: specifies the cause of death.
   - `dateOfDeath`: The date of death of the individual.

**Polymorphic Methods:**
The application of polymorphism is manifested through the implementation of common methods across the document hierarchy.

1. **add() Method:**
   - **Document (Superclass):**
     - Prompts the user for essential details during document creation.
   - **GovernmentId (Subclass):**
     - Extends the superclass method to include the capture of Date of Birth, place of birth, and expiry date.
   - **BirthCertificate (Subclass):**
     - Enhances the superclass method to include Date of Birth and place of birth.
   - **DeathCertificate (Subclass):**
     - Further extends the superclass method to include the date of death.

2. **edit() Method:**
   - **Document (Superclass):**
     - Provides a framework for editing common attributes.
   - **GovernmentId (Subclass):**
     - Overrides the superclass method to allow editing of owner name, Date of Birth, place of birth, expiry date, address, and phone number.
   - **BirthCertificate (Subclass):**
     - Overrides the superclass method to enable the modification of owner name, Date of Birth, place of birth, and other relevant details.
   - **DeathCertificate (Subclass):**
     - Overrides the superclass method to permit edits to owner name, Date of Birth, place of birth, and date of death.
3. **Display Using GUI Method: **


**Differences in Polymorphic Methods:**
The polymorphic methods in each subclass accommodate the unique attributes associated with the specific document type. 
For example, the "edit" method in the "GovernmentId" subclass allows modifications to attributes like Date of Birth and expiry date, 
while the "BirthCertificate" subclass enables changes to Date of Birth and place of birth. This differentiation ensures that each 
document type is handled appropriately, reflecting the specific information relevant to its nature.

**Conclusion:**
The utilization of polymorphism in this document management system enhances adaptability, 
simplifies code maintenance, and ensures a cohesive approach to managing various document types encountered at Kebele Offices. 
The hierarchy of classes, with shared and specialized attributes, coupled with polymorphic methods, provides an elegant solution for 
the creation and management of diverse documents, catering to the unique requirements of each document type.
