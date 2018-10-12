package chainOfResponsibilityPattern;

public class FirstLevelComplaintHandler extends ComplaintHandler{

	@Override
	public void solveComplaint(CustomerComplaint complaint) {
		
		System.out.println(" Processing complaint at First Level. It may take some more time .. Keep patient");
		
		if(this.isTimeEscalated()){
			complaint.setDescription(complaint.getDescription() + " FirstLevel comment:- Time limit Escalated ");
			System.out.println(" First Level Time Escalated, forwaring complaint to next level");
			this.getNextLevelComplaintHandler().solveComplaint(complaint);
		}
		else {
			System.out.println(" Complaint resolved at First Level ");
		}
	}

}
