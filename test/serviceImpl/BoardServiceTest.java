package serviceImpl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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

	@Test 
	public void testFindOne() throws Exception {
		ArticleBean bean=new ArticleBean();
		bean.setSeq("1");
		assertTrue(service.findOne(bean).getId().equals("hong"));
	}

	@Test  @Ignore
	public void testFindSome() {
		fail("Not yet implemented");
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
