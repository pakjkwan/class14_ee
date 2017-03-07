package factory;
import util.Pagination;
public class PageHandler {
	public static Integer[] getAttribute(String pageNO,Integer count){
		Pagination page=new Pagination();
		page.setBlockSize(5);
		page.setRowCount(5);
		page.setCount(count);
		page.setPageNO(pageNO);
		page.setPageStart();
		page.setPageEnd();
		page.setPageCount();
		page.setBlockCount();
		page.setBlockStart();
		page.setPrevBlock();
		page.setNextBlock();
		page.setBlockEnd();
		return page.getAttribute();
	}
}
