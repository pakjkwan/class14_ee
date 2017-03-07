package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import serviceImpl.BoardServiceImpl;
import util.DispatcherServlet;
import util.Pagination;
import util.Separator;
import domain.ArticleBean;
import handler.PageHandler;
import service.BoardService;

@WebServlet("/board.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Separator.init(request, response);
		ArticleBean bean=new ArticleBean();
		Pagination page=new Pagination();
		Map<String,String>params=new HashMap<>();
		PageHandler handler=new PageHandler();
		System.out.println("게시판 서블릿");
		java.util.List<ArticleBean> list=new ArrayList<>();
		service.BoardService service=BoardServiceImpl.getInstance();
		switch (Separator.command.getAction()) {
			case "move":DispatcherServlet.send(request, response);break;
			case "list":
				params.put("pageNO", request.getParameter("pageNO"));
				params.put("count", String.valueOf(service.count()));
				handler.process(params);
				int[] pageArr={handler.getAttribute()[3],handler.getAttribute()[4]};
				list=service.list(pageArr);
				String[]arr={"count","pageCount","pageNO","pageStart","pageEnd",
						"blockStart","blockEnd","prevBlock","nextBlock"};
				for(int i=0;i<9;i++){
					request.setAttribute(arr[i],handler.getAttribute()[i] );
				}
				request.setAttribute("list", list);
			break;
			case "detail":
				String seq=request.getParameter("seq");
				bean.setSeq(seq);
			try {
				bean=service.findOne(bean);
				request.setAttribute("article", bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				break;
		}
		DispatcherServlet.send(request, response);
	}

}
