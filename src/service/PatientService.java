package service;

import domain.PatientBean;

public interface PatientService {
	// DAO 값을 토스해 주는 로직
	public int join(PatientBean member)throws Exception;
	public PatientBean findById(String id)throws Exception;
	public PatientBean login(PatientBean member)throws Exception;
	public boolean logout()throws Exception;
	public int change(PatientBean member)throws Exception;
	public int remove(PatientBean member)throws Exception;
	// 추가된 로직
	public String getBirth(String patJumin);
	public PatientBean getSession();
}
