package util;
import java.lang.reflect.*;
import java.util.*;
public class Reflect {
	public static void main(String[] args) {
		try {
			Class klass=Class.forName("domain.DatabaseBean");
			Method[] arr=klass.getDeclaredMethods();
			Set<String> set=new HashSet<String>();
			for(Method s:arr){
				set.add(s.getName());
			}
			System.out.println(set.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
