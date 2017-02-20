package serviceImpl;

import domain.PatientBean;
import service.PatientService;
import dao.PatientDAO;
import daoImpl.PatientDAOImpl;
public class PatientServiceImpl implements PatientService{
	private PatientDAO dao;
	private PatientBean session;
	private static PatientServiceImpl instance=new PatientServiceImpl();
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
	public boolean login(PatientBean patient)throws Exception {
		boolean flag=false;
		/*PatientBean temp=this.findById(patient.getPatID());
		if(patient.getPatPass().equals(temp.getPassword())){
			session=temp;
			flag=true;
		}*/
		PatientBean pat=this.findById(patient.getPatID());
		return flag;
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
		session=null;
		return true;
	}

}
