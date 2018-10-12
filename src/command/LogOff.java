package command;

public class LogOff implements ICommand {
	
	// Receiver object stored in the command object by aggregation. 
	private Computer computer;

	public LogOff(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void execute() {
		this.computer.logOff();
	}

}
