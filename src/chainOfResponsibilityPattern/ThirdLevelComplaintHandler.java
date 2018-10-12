package chainOfResponsibilityPattern;

public class ThirdLevelComplaintHandler extends ComplaintHandler{

	@Override
	public void solveComplaint(CustomerComplaint complaint) {
		
		System.out.println(" Processing complaint at Third Level. It may take some more time .. Keep patient");
		
		if(this.isTimeEscalated()){
			complaint.setDescription(complaint.getDescription() + " ThirdLevel comment:- Time limit Escalated ");
			System.out.println(" Third Level Time Escalated, forwaring complaint to next level");
			this.getNextLevelComplaintHandler().solveComplaint(complaint);
		}
		else {
			System.out.println(" Complaint resolved at Third Level ");
		}
	}

}
