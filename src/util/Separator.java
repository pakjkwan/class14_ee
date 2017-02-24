package util;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import command.Command;
import factory.CommandFactory;
public class Separator {
	public static CommandFactory factory=new CommandFactory();
	public static Command command;
	public static void init(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException{
		String path=request.getServletPath();
		String directory=path.substring(0, path.indexOf("."));
		String action=request.getParameter("action");
		String page=request.getParameter("page");
		System.out.println("Separator PATH:"+path);
		System.out.println("Separator DIR:"+directory);
		System.out.println("Separator ACTION:"+action);
		System.out.println("Separator PAGE:"+page);
		command=CommandFactory.createCommand(directory, action, page);
	}
}
