package chainOfResponsibilityPattern;

public class Client_ChainOfResponsibilityPattern {

	public static void main(String[] args) {
		
		
		int bankAccountNumber = 1000001;
		String subject = "Unable to transact";
		String description = "Transaction not possible online";
		CustomerComplaint complaint = new CustomerComplaint(bankAccountNumber, subject, description);
		
		// Define a chain of receiver objects having the responsibility
		FirstLevelComplaintHandler firstLevelHandler = new FirstLevelComplaintHandler();
		SecondLevelComplaintHandler secondLevelHandler = new SecondLevelComplaintHandler();
		ThirdLevelComplaintHandler thirdLevelComplaintHandler = new ThirdLevelComplaintHandler();
		CentralBankComplaintHandler centralBankComplaintHandler = new CentralBankComplaintHandler();
		
		firstLevelHandler.setNextLevelComplaintHandler(secondLevelHandler);
		secondLevelHandler.setNextLevelComplaintHandler(thirdLevelComplaintHandler);
		thirdLevelComplaintHandler.setNextLevelComplaintHandler(centralBankComplaintHandler);
		
		// depending on run-time conditions, to either 
		// handle a request or forward it to the next receiver on the chain (if any).
		firstLevelHandler.solveComplaint(complaint);
		
		
		
		

	}

}
