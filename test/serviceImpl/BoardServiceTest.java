package serviceImpl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import domain.ArticleBean;

public class BoardServiceTest {
	BoardServiceImpl service=BoardServiceImpl.getInstance();
	@Test @Ignore
	public void testAdd() throws Exception {
		ArticleBean bean=new ArticleBean();
		assertTrue(service.add(bean)==1);
	}

	@Test @Ignore
	public void testFindOne() throws Exception {
		ArticleBean bean=new ArticleBean();
		bean.setSeq("1");
		assertTrue(service.findOne(bean).getId().equals("hong"));
	}

	@Test  
	public void testFindSome() throws Exception {
		String[] arr=new String[2];
		arr[0]="title";
		arr[1]="안";
		List<ArticleBean> list=new ArrayList<ArticleBean>();
		list=service.findSome(arr);
		
		assertTrue(list.get(0).getId().equals("hong"));
	}

	@Test  @Ignore
	public void testList() {
		fail("Not yet implemented");
	}

	@Test  @Ignore
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test  @Ignore
	public void testDelete() {
		fail("Not yet implemented");
	}

}
