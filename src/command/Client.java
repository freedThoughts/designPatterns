package command;

public class Client {

	public static void main(String[] args) {
		
		// Receiver.
		// We may have more than one Receiver classes and may dynamically choose one 
		Computer computer = new Computer();
		
		// Commands
		// All Commands are kept as type of common Interface ICommand. Actual type will be resolved at runtime
		ICommand switchOn = new SwitchOn(computer);
		ICommand shutDown = new ShutDown(computer);
		ICommand logOff = new LogOff(computer);
		ICommand sleep = new Sleep(computer);
		ICommand restart = new Restart(computer);
		
		//Invoker
		Invoker invoker = new Invoker();
		
		
		invoker.storeAndExecute(switchOn);
		invoker.storeAndExecute(restart);
		invoker.storeAndExecute(logOff);
		invoker.storeAndExecute(shutDown);
		invoker.storeAndExecute(switchOn);
		
	}

}
