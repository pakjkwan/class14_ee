package domain;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
public class DoctorBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Getter @Setter
	private String docID,
				   docPass,	
	 			   majorTreat,
	 			   docName,
	 			   docGen,
	 			   docPhone,
	 			   docEmail,
	 			   docPosition;
	

}
