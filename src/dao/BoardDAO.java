package dao;

import java.util.List;

import domain.ArticleBean;

public interface BoardDAO {
	public int insert(ArticleBean param)throws Exception;
	public ArticleBean selectBySeq(ArticleBean param)throws Exception; 
	public List<ArticleBean> selectByWord(String[] param)throws Exception;
	public List<ArticleBean> selectAll()throws Exception;
	public int update(ArticleBean param)throws Exception;
	public int delete(ArticleBean param)throws Exception;
	public int count() throws Exception;
}
