package command;

public class Restart implements ICommand {
	
	// Receiver object stored in the command object by aggregation. 
	private Computer computer;

	public Restart(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void execute() {
		this.computer.restart();
	}

}
