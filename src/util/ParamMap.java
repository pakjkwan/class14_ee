package util;
import javax.servlet.http.HttpServletRequest;

public class ParamMap {
	public static String getValues(HttpServletRequest request,String name){
		String rs="";
		String[] values=(String[]) request.getParameterMap().get(name);
	//	StringBuffer buff=new StringBuffer();
		for(String s:values){
			rs+=s+",";
		}
		System.out.println("버퍼에 담긴 내용 :"+rs);
		rs=rs.substring(0,1);
		return rs;
	}
}
