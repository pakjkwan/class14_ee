package util;

import dao.MemberDAO;
import daoImpl.MemberDAOImpl;
import domain.MemberBean;
public class DAOTest {
	public static void main(String[] args) {
		MemberDAO dao=new MemberDAOImpl();
		MemberBean member=new MemberBean();
		try {
			member = MemberDAOImpl.getInstance().selectById("hong");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("회원이름:"+member.getName());
	}
}
