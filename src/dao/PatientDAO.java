package dao;
import domain.PatientBean;

public interface PatientDAO {
	public int insert(PatientBean member)throws Exception;
	public PatientBean selectById(String id) throws Exception;
	public int update(PatientBean member)throws Exception;
	public int delete(PatientBean member)throws Exception;
}
