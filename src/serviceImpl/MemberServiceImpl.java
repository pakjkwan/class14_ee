package serviceImpl;

import domain.MemberBean;
import service.MemberService;
import dao.MemberDAO;
import daoImpl.MemberDAOImpl;
public class MemberServiceImpl implements MemberService{
	private MemberDAO dao;
	private MemberBean session;
	private static MemberServiceImpl instance=new MemberServiceImpl();
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	private MemberServiceImpl(){
		dao=MemberDAOImpl.getInstance();
		session=new MemberBean();
	}
	@Override
	public int join(MemberBean member) throws Exception{
		return dao.insert(member);
	}

	@Override
	public MemberBean findById(String id) throws Exception{
		return dao.selectById(id);
	}

	@Override
	public boolean login(MemberBean member)throws Exception {
		boolean flag=false;
		MemberBean temp=this.findById(member.getId());
		if(member.getPassword().equals(temp.getPassword())){
			session=temp;
			flag=true;
		}
		return flag;
	}

	@Override
	public int change(MemberBean member) throws Exception{
		return dao.update(member);
	}

	@Override
	public int remove(MemberBean member)throws Exception {
		return dao.delete(member);
	}
	@Override
	public boolean logout() throws Exception {
		session=null;
		return true;
	}

}
