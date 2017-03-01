package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.PatientBean;
import service.PatientService;
import serviceImpl.PatientServiceImpl;
import util.DispatcherServlet;
import util.Separator;

@WebServlet("/patient.do")
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException { 
		HttpSession session=request.getSession();
		PatientService service=PatientServiceImpl.getInstance();
		PatientBean bean=new PatientBean();
		Separator.init(request, response);
		switch (Separator.command.getAction()) {
		case "move":DispatcherServlet.send(request, response);break;
		case "mypage":
			String birth=service.getBirth(service.getSession().getPatJumin());
			System.out.println("생년월일:"+birth);
			request.setAttribute("birth", birth);
			DispatcherServlet.send(request, response);
			break;
		case "login":
			String pw=request.getParameter("password");
			System.out.println("DB 가기 전 비번:"+pw);
			bean.setPatID(request.getParameter("id"));
			
			try {
				PatientBean temp=service.login(bean);
				System.out.println("DB 다녀온 후 아이디:"+temp.getPatID());
				System.out.println("DB 다녀온 후 비번:"+temp.getPatPass());
				if(!temp.getPatID().equals("FAIL")&&temp.getPatPass().equals(pw)){
						System.out.println("====로그인 성공===");
						session.setAttribute("user", temp);
						DispatcherServlet.send(request, response);
				}else{
					System.out.println("====로그인 실패===");
					Separator.command.setPage("loginForm");
					Separator.command.setView();
					DispatcherServlet.send(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "register":
			String id=request.getParameter("id");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			String mBirth=request.getParameter("birth");
			String month=request.getParameter("month");
			String date=request.getParameter("date");
			String telecom=request.getParameter("telecom");
			String phoneNo=request.getParameter("phoneNo");
			String rdBtn=request.getParameter("rdBtn");
			String[] ckbox=(String[]) request.getParameterMap().get("ckbox");
			ArrayList<String> list=new ArrayList<>();
			list.add(id);
			list.add(email);
			list.add(password);
			list.add(mBirth);
			list.add(month);
			list.add(date);
			list.add(telecom);
			list.add(phoneNo);
			list.add(rdBtn);
			String ckbox2="";
			for(String s:ckbox){
				ckbox2+=s+",";
			}
			list.add(ckbox2);
			System.out.println(list);
			break;
		default:
			break;
		}
	}
}
