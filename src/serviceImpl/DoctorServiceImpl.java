package serviceImpl;

import service.DoctorService;

public class DoctorServiceImpl implements DoctorService{
	private static DoctorServiceImpl instance=new DoctorServiceImpl();
	public static DoctorServiceImpl getInstance() {
		return instance;
	}
	private DoctorServiceImpl(){}

}
