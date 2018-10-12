package chainOfResponsibilityPattern;

public class CustomerComplaint {
	
	private int bankAccountNumber;
	private String subject;
	private String description;
	
	public CustomerComplaint(int bankAccountNumber, String subject, String description){
		this.bankAccountNumber = bankAccountNumber;
		this.subject = subject;
		this.description = description;
	}
	
	public int getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}
