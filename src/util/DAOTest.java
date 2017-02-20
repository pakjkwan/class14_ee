package util;

import dao.PatientDAO;
import daoImpl.PatientDAOImpl;
import domain.PatientBean;
public class DAOTest {
	public static void main(String[] args) {
		PatientDAO dao=new PatientDAOImpl();
		PatientBean patient=new PatientBean();
		try {
			patient = PatientDAOImpl.getInstance().selectById("hong");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("회원이름:"+patient.getPatName());
	}
}
