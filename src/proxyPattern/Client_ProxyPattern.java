package proxyPattern;

public class Client_ProxyPattern {
	public static void main(String arg[]) throws Exception{
		Subject_CommandExecutor executor = new Proxy_Executor("Admin", "admin@123");
		executor.executeCommand("rm filename.txt");
	}
}
