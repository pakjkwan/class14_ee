package factory;
import command.Command;
import command.MoveCommand;
public class CommandFactory {
	public static Command createCommand(
			String directory,
			String action,
			String page){
		Command cmd=null;
		switch (action) {
		case "move": case "login": case "logout": case "mypage": case "register":
			cmd=new MoveCommand(directory, action, page);
			
			break;
		default:
			break;
		}
		return cmd;
	}
}
