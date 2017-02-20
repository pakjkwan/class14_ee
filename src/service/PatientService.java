package service;

import domain.PatientBean;

public interface PatientService {
	public int join(PatientBean member)throws Exception;
	public PatientBean findById(String id)throws Exception;
	public boolean login(PatientBean member)throws Exception;
	public boolean logout()throws Exception;
	public int change(PatientBean member)throws Exception;
	public int remove(PatientBean member)throws Exception;
}
