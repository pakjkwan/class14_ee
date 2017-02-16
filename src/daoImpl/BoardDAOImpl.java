package daoImpl;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import constants.Database;
import dao.BoardDAO;
import domain.ArticleBean;
import enums.Vendor;
import factory.DatabaseFactory;

public class BoardDAOImpl implements BoardDAO{
    public static BoardDAOImpl instance=new BoardDAOImpl();
	public static BoardDAOImpl getInstance() {
		return instance;
	}
	private BoardDAOImpl(){
		
	}
	@Override
	public int insert(ArticleBean param) throws Exception {
		int rs=0;
		String sql=String.format("%s", "");
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection().createStatement();
		rs=stmt.executeUpdate(sql);
		return rs;
	}

	@Override
	public ArticleBean selectBySeq(ArticleBean param) throws Exception {
		ArticleBean bean=null;
		System.out.println("=========="+param.getSeq());
		String sql=String.format("SELECT art_seq,id,title,content,regdate,readCount "
				+ " FROM Article WHERE art_seq='%s'", param.getSeq());
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection().createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.next()){
			bean=new ArticleBean();
			bean.setContent(rs.getString("content"));
			bean.setReadCount(rs.getString("readCount"));
			bean.setRegdate(rs.getString("regDate"));
			bean.setSeq(rs.getString("art_seq"));
			bean.setTitle(rs.getString("title"));
			bean.setId(rs.getString("id"));
		}
		return bean;
	}

	@Override
	public List<ArticleBean> selectByWord(String[] param) throws Exception {
		List<ArticleBean> list=new ArrayList<>();
		ArticleBean bean=null;
		String sql="SELECT art_seq,id,title,content,regdate,readCount "
				+ " FROM Article WHERE "+param[0]+" LIKE '%"+param[1]+"%'";
		System.out.println("DAO에서 실행된 쿼리:"+sql);
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection().createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			bean=new ArticleBean();
			bean.setContent(rs.getString("content"));
			bean.setReadCount(rs.getString("readCount"));
			bean.setRegdate(rs.getString("regDate"));
			bean.setSeq(rs.getString("art_seq"));
			bean.setTitle(rs.getString("title"));
			bean.setId(rs.getString("id"));
			list.add(bean);
		}
		return list;
	}

	@Override
	public List<ArticleBean> selectAll() throws Exception {
		List<ArticleBean> list=new ArrayList<>();
		ArticleBean bean=null;
		String sql=String.format("SELECT seq,id,title,content,regdate,readCount "
				+ " FROM %s","Article");
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection().createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			bean=new ArticleBean();
			bean.setContent(rs.getString("content"));
			bean.setReadCount(rs.getString("readCount"));
			bean.setRegdate(rs.getString("regDate"));
			bean.setSeq(rs.getString("seq"));
			bean.setTitle(rs.getString("title"));
			bean.setId(rs.getString("id"));
			list.add(bean);
		}
		return list;
	}

	@Override
	public int update(ArticleBean param) throws Exception {
		int rs=0;
		String sql=String.format("%s", "");
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection().createStatement();
		rs=stmt.executeUpdate(sql);
		return rs;
	}

	@Override
	public int delete(ArticleBean param) throws Exception {
		int rs=0;
		String sql=String.format("%s", "");
		Statement stmt=DatabaseFactory.createDatabase(Vendor.ORACLE,Database.USERNAME, Database.PASSWORD)
				.getConnection().createStatement();
		rs=stmt.executeUpdate(sql);
		return rs;
	}
	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
