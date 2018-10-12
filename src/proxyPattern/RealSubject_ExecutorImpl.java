package proxyPattern;

public class RealSubject_ExecutorImpl implements Subject_CommandExecutor{

	@Override
	public void executeCommand(String cmd) {
		System.out.println("Comand Executed");
		
	}

}
