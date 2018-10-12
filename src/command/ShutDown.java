package command;

public class ShutDown implements ICommand {
	
	// Receiver object stored in the command object by aggregation. 
	private Computer computer;

	public ShutDown(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void execute() {
		this.computer.shutDown();
	}

}
