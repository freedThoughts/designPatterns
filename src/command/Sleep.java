package command;

public class Sleep implements ICommand {
	
	// Receiver object stored in the command object by aggregation. 
	private Computer computer;

	public Sleep(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void execute() {
		this.computer.sleep();
	}

}
