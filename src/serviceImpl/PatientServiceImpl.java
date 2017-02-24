package serviceImpl;

import domain.PatientBean;
import service.PatientService;
import dao.PatientDAO;
import daoImpl.PatientDAOImpl;
public class PatientServiceImpl implements PatientService{
	private PatientDAO dao;
	private PatientBean session;
	private static PatientServiceImpl instance=new PatientServiceImpl();
	public PatientBean getSession(){
		System.out.println("###세션ID:"+session.getPatID());
		return session;
	}
	public static PatientServiceImpl getInstance() {
		return instance;
	}
	private PatientServiceImpl(){
		dao=PatientDAOImpl.getInstance();
		session=new PatientBean();
	}
	@Override
	public int join(PatientBean patient) throws Exception{
		return dao.insert(patient);
	}

	@Override
	public PatientBean findById(String id) throws Exception{
		return dao.selectById(id);
	}

	@Override
	public PatientBean login(PatientBean patient)throws Exception {
		/*
		if(patient.getPatPass().equals(temp.getPassword())){
			flag=true;
		}*/
		session=this.findById(patient.getPatID());
		return session;
	}

	@Override
	public int change(PatientBean patient) throws Exception{
		return dao.update(patient);
	}

	@Override
	public int remove(PatientBean patient)throws Exception {
		return dao.delete(patient);
	}
	@Override
	public boolean logout() throws Exception {
		return true;
	}
	@Override
	public String getBirth(String patJumin) {
		String birth=session.getPatJumin();
		// String birth=patJumin;
		System.out.println("생년월일2"+birth);
		return birth;
	}

}
