package dao;
import domain.MemberBean;

public interface MemberDAO {
	public int insert(MemberBean member)throws Exception;
	public MemberBean selectById(String id) throws Exception;
	public int update(MemberBean member)throws Exception;
	public int delete(MemberBean member)throws Exception;
}
