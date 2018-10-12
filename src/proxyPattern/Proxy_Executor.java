package proxyPattern;

public class Proxy_Executor implements Subject_CommandExecutor{
	
	private boolean isAdmin;
	
	public Proxy_Executor(String user, String password){
		if(user.equals("Admin") && password.equals("admin@123"))
			isAdmin = true;
	}

	// The access to an object should be controlled.
	// Additional functionality should be provided when accessing an object.
	@Override
	public void executeCommand(String cmd) throws Exception{
		if(isAdmin){
			RealSubject_ExecutorImpl impl = new RealSubject_ExecutorImpl();
			impl.executeCommand(cmd);
		} else if(cmd.trim().startsWith("rm")){
			throw new Exception();
		} else {
			RealSubject_ExecutorImpl impl = new RealSubject_ExecutorImpl();
			impl.executeCommand(cmd);
		}
	
	}

}
