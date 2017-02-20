package domain;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
public class ChartBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Getter @Setter
	private String charID,
				   treatID,
				   docID,
				   patID,
				   nurID,
				   chartContents;
}
