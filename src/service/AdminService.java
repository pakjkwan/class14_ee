package service;
import domain.MemberBean;
import java.util.*;
public interface AdminService {
	// create
	public void regist(MemberBean member);
	// read
	public MemberBean findById(String id);
	public List<MemberBean> findByName(String name);
	public Map<String,MemberBean> mapFindByName(String name);
	public List<MemberBean> memberlist();
	public List<String> keylist();
	public int count();
	// update
	public void update(MemberBean member);
	// delete
	public void remove(String id);
}
