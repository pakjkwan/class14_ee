package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/patient/loginForm.do","/patient/registerForm.do","/admin/loginForm.do"})
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("====서블릿 진입 성공======");
		String path=request.getServletPath();
		System.out.println("리퀘스트객체가 걸어온 길:"+path);
		this.doPatient(path, request, response);
		
		
	}
	protected void doPatient(String path,HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException{
		String patPath="/WEB-INF/jsp/patient/";
		String extension=".jsp";
		String cmd="";
		switch (cmd) {
		case "login":
			request.getRequestDispatcher(patPath+"loginForm"+extension)
			.forward(request, response);
			break;
		case "regist":
			request.getRequestDispatcher(patPath+"registerForm"+extension)
			.forward(request, response);
			break;
		
		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
