package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	List<ICommand> list = new ArrayList<ICommand>();
	
	void storeAndExecute(ICommand command){
		list.add(command);  // optionally does bookkeeping
		command.execute();
	}

}
