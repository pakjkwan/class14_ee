package factory;
import command.Command;
import command.ListCommand;
import command.MoveCommand;
public class CommandFactory {
	public static Command createCommand(
			String directory,
			String action,
			String page){
		Command cmd=null;
		switch (action) {
		case "move": case "login": case "logout": case "mypage": case "register":
		case "detail":
			cmd=new MoveCommand(directory, action, page);
			break;
		default:
			break;
		}
		return cmd;
	}
	public static Command createCommand(
			String directory,
			String action,
			String page,
			String pageNO){
		Command cmd=null;
		switch (action) {
		case "list":
			cmd=new ListCommand(directory,action,page,pageNO);
			break;
		default:
			break;
		}
		return cmd;
	}
}
