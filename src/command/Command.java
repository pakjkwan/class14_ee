package command;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import handler.CommandHandler;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Command implements CommandHandler {
	@Getter @Setter
	protected String directory,action,page,searchWord,pageNo;
	@Getter
	protected String view;
	public Command(){}
	public Command(String directory,String action,String page){
		this.directory=directory;
		this.action=action;
		this.page=page;
		this.setView();
	}
	public void setView(){
		System.out.println("디렉토리: "+directory);
		this.view=
		(directory.equals("/home"))?
				"/WEB-INF/jsp/common/"+this.page+".jsp"
				:"/WEB-INF/jsp"+this.directory+"/"+this.page+".jsp";
	}
	@Override
	public void process(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException {
		
	}
}
