package chainOfResponsibilityPattern;

public class CentralBankComplaintHandler extends ComplaintHandler{

	@Override
	public void solveComplaint(CustomerComplaint complaint) {
		System.out.println(" Processing complaint at Central Bank. For more details, connect to Central bank portal.");
	}

}
