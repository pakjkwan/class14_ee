package serviceImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dao.BoardDAO;
import daoImpl.BoardDAOImpl;
import domain.ArticleBean;
import service.BoardService;
public class BoardServiceImpl implements BoardService{
    static BoardServiceImpl instance=new BoardServiceImpl();
	public static BoardServiceImpl getInstance() {
		return instance;
	}
	BoardDAO dao;
	private BoardServiceImpl() {
		dao=BoardDAOImpl.getInstance();
	}
	@Override
	public int add(ArticleBean param)throws Exception {
		int rs=0;
		rs=dao.insert(param);
		return rs;
	}

	@Override
	public ArticleBean findOne(ArticleBean param)throws Exception {
		ArticleBean article=new ArticleBean();
		article=dao.selectBySeq(param);
		return article;
	}

	@Override
	public List<ArticleBean> findSome(String[] param)throws Exception {
		List<ArticleBean> list=new ArrayList<ArticleBean>();
		System.out.println("서비스에 넘어간 파라미터1:"+param[0]);
		System.out.println("서비스에 넘어간 파라미터2:"+param[1]);
		list=dao.selectByWord(param);
		System.out.println("서비스에서 본 리스트 결과:"+list);
		return list;
	}

	@Override
	public List<ArticleBean> list(int[] pageArr)throws Exception {
		List<ArticleBean> list=new ArrayList<>();
		list=dao.selectAll(pageArr);
		System.out.println("=== 게시판 서비스 리스트==="+list);
		return list;
	}

	@Override
	public int update(ArticleBean param) throws Exception{
		int rs=0;
		rs=dao.update(param);
		return rs;
	}

	@Override
	public int delete(ArticleBean param)throws Exception {
		int rs=0;
		rs=dao.delete(param);
		return rs;
		
	}
	@Override
	public int count() {
		int count=0;
		try {
			count = dao.count();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
