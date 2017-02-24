package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.DoctorBean;
import domain.PatientBean;
import service.DoctorService;
import service.PatientService;
import serviceImpl.DoctorServiceImpl;
import serviceImpl.PatientServiceImpl;
import util.DispatcherServlet;
import util.Separator;

/**
 * Servlet implementation class DoctorController
 */
@WebServlet("/doctor.do")
public class DoctorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response)
					throws ServletException, IOException { 
		HttpSession session=request.getSession();
		
		DoctorService service=DoctorServiceImpl.getInstance();
		DoctorBean bean=new DoctorBean();
		Separator.init(request, response);
		switch (Separator.command.getAction()) {
		case "move":DispatcherServlet.send(request, response);
			break;
		
		default:
			break;
		}
	}
}
