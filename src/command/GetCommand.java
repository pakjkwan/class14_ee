package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handler.CommandHandler;
import util.DispatcherServlet;

public class GetCommand extends Command implements CommandHandler{
    public GetCommand(String directory,
    		String action,String page,String searchWord,String pageNo){
    	super.directory=directory;
		super.action=action;
		super.page=page;
		super.searchWord=searchWord;
		super.pageNo=pageNo;
		super.setView();
    }

    @Override
	public void process(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException {
	}
}
