

package daoImpl;
import dao.PatientDAO;
import domain.PatientBean;
import enums.Vendor;
import factory.DatabaseFactory;
import java.sql.*;
import constants.Database;
public class PatientDAOImpl implements PatientDAO{
	public static PatientDAOImpl getInstance() {return new PatientDAOImpl();}
	@Override
	public int insert(PatientBean member) throws Exception {
		return DatabaseFactory
				.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection()
				.createStatement()
				.executeUpdate("");
	}
	@Override
	public PatientBean selectById(String id) throws Exception{
		    PatientBean member=new PatientBean();
			ResultSet rs=DatabaseFactory
					.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
					.getConnection()
					.createStatement()
					.executeQuery("");
			
		return member;
	}
	
	@Override
	public int update(PatientBean member) throws Exception{
		return DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection()
				.createStatement()
				.executeUpdate("");
	}
	@Override
	public int delete(PatientBean member) throws Exception{
		return DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection()
				.createStatement()
				.executeUpdate("");
	}
}
