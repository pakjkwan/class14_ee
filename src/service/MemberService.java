package service;

import domain.MemberBean;

public interface MemberService {
	public int join(MemberBean member)throws Exception;
	public MemberBean findById(String id)throws Exception;
	public boolean login(MemberBean member)throws Exception;
	public boolean logout()throws Exception;
	public int change(MemberBean member)throws Exception;
	public int remove(MemberBean member)throws Exception;
}
