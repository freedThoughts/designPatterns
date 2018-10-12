package chainOfResponsibilityPattern;

public class SecondLevelComplaintHandler extends ComplaintHandler{

	@Override
	public void solveComplaint(CustomerComplaint complaint) {
		
		System.out.println(" Processing complaint at Second Level. It may take some more time .. Keep patient");
		
		if(this.isTimeEscalated()){
			complaint.setDescription(complaint.getDescription() + " SecondLevel comment:- Time limit Escalated ");
			System.out.println(" Second Level Time Escalated, forwaring complaint to next level");
			this.getNextLevelComplaintHandler().solveComplaint(complaint);
		}
		else {
			System.out.println(" Complaint resolved at Second Level ");
		}
	}

}
