package command;

public class SwitchOn implements ICommand {
	
	// Receiver object stored in the command object by aggregation. 
	private Computer computer;

	public SwitchOn(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void execute() {
		this.computer.switchOn();
	}

}
