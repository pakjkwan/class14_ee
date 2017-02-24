

package daoImpl;
import dao.PatientDAO;
import domain.PatientBean;
import enums.Vendor;
import factory.DatabaseFactory;
import java.sql.*;
import constants.Database;
public class PatientDAOImpl implements PatientDAO{
    final String prop="pat_id,nur_id,doc_id,pat_pass,pat_name,"
    		+ "pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job";
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
					.executeQuery("SELECT "+prop+ " FROM Patient WHERE pat_id='"+id+"'");
			System.out.println("SELECT "+prop+ " FROM Patient WHERE pat_id='"+id+"'");
			if(rs.next()){
//patID,nurID,docID,patPass,patName,patGen,patJumin,patAddr,patPhone,patEmail,patJob
				member.setPatID(rs.getString("pat_id"));
				member.setNurID(rs.getString("nur_id"));
				member.setDocID(rs.getString("doc_id"));
				member.setPatPass(rs.getString("pat_pass"));
				member.setPatName(rs.getString("pat_name"));
				member.setPatGen(rs.getString("pat_gen"));
				member.setPatJumin(rs.getString("pat_jumin"));
				member.setPatAddr(rs.getString("pat_addr"));
				member.setPatPhone(rs.getString("pat_phone"));
				member.setPatEmail(rs.getString("pat_email"));
				member.setPatJob(rs.getString("pat_job"));
				System.out.println("SUCCESS");
			}else{
				System.out.println("FAIL");
				member.setPatID("FAIL");
			}
			
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
