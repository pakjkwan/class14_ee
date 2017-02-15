package util;

public class Ssn {
	public String getGender(String param) {
		String ssn=param;
		char ch = ssn.charAt(7);
		String gender = "";
		switch (ch) {
		case '1':case '3':
			gender="남자";break;
		case '2':case '4':
			gender="여자";break;
		case '5':case '6':
			gender="외국인";break;
		}
		return gender;
	}
}
