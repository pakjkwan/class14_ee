package factory;

import command.Command;

public class CommandFactory {
	public Command createCommand(String directory,String action,String page){
		return new Command(directory,action,page);
	}
}
