package util;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Clock {
	public String now(){
		return new SimpleDateFormat("yyyy년MM월dd일 a hh:mm:ss")
				.format(new Date());
	}
}
