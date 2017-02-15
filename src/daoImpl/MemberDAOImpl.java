package daoImpl;
import dao.MemberDAO;
import domain.MemberBean;
import enums.Vendor;
import factory.DatabaseFactory;
import java.sql.*;
import constants.Database;
public class MemberDAOImpl implements MemberDAO{
	public static MemberDAOImpl getInstance() {return new MemberDAOImpl();}
	@Override
	public int insert(MemberBean member) throws Exception {
		return DatabaseFactory
				.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection()
				.createStatement()
				.executeUpdate(String.format("INSERT INTO Member"
						+ " (id,name,ssn,password,profileImg,phone,email,rank) "
						+ " VALUES('%s','%s','%s','%s','%s','%s','%s','%s')", 
						member.getId(),member.getName(),member.getSsn(),
						member.getPassword(),member.getProfileImg(),member.getPhone(),
						member.getEmail(),member.getRank()));
	}
	@Override
	public MemberBean selectById(String id) throws Exception{
		    MemberBean member=new MemberBean();
			ResultSet rs=DatabaseFactory
					.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
					.getConnection()
					.createStatement()
					.executeQuery(
							String.format("SELECT id,name,ssn,password,profileImg,phone,email,rank \n"
									+ " FROM Member WHERE id='%s'", id));
			if(rs.next()){
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setSsn(rs.getString("ssn"));
				member.setPassword(rs.getString("password"));
				member.setProfileImg(rs.getString("profileImg"));
				member.setPhone(rs.getString("phone"));
				member.setRank(rs.getString("rank"));
				member.setEmail(rs.getString("email"));
			}
		return member;
	}
	
	@Override
	public int update(MemberBean member) throws Exception{
		return DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection()
				.createStatement()
				.executeUpdate(
						String.format(
							"UPDATE Member SET "
							+ " password='%s' ,"
							+ " profileImg='%s' ,"
							+ " phone='%s' ,"
							+ " email='%s' "
							+ " WHERE id='%s'", member.getPassword(),
							member.getProfileImg(), member.getPhone(),
							member.getEmail(),member.getId()));
	}
	@Override
	public int delete(MemberBean member) throws Exception{
		return DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection()
				.createStatement()
				.executeUpdate(
						String.format(
								"DELETE FROM Member WHERE id='%s'",
								member.getId()));
	}
}
