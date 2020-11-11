package ExamBPractice;

public class Contact {

    // fields
    private String name;
    private String socialSecurityNumber;
    private String emailAddress;

    /**
     * @param name
     * @param socialSecurityNumber
     * @param emailAddress
     */
    public Contact(String name, String socialSecurityNumber, String emailAddress) {
	super();
	this.name = name;
	this.socialSecurityNumber = socialSecurityNumber;
	this.emailAddress = emailAddress;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the socialSecurityNumber
     */
    public String getSocialSecurityNumber() {
	return socialSecurityNumber;
    }

    /**
     * @param socialSecurityNumber the socialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
	return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
	return "\nName: " + getName() + "\nSSN #: " + getSocialSecurityNumber() + "\nEmail: " + getEmailAddress();
    }

}
