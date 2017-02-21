package command;

import handler.CommandHandler;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Command implements CommandHandler{
	@Getter @Setter
	protected String directory,action,page;
	@Getter
	protected String view;
	public Command(String directory,String action,String page){
		this.directory=directory;
		this.action=action;
		this.page=page;
		this.setView();
	}
	@Override
	public Command process() {
		Command cmd=null;
		switch (action) {
		case "move":
			cmd=new Command(directory, action, page);
			break;

		default:
			break;
		}
		return cmd;
	}
	public void setView(){
		this.view="/WEB-INF/jsp"+this.directory+"/"+this.page+".jsp";
	}

}
