package command;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Command{
	@Getter @Setter
	protected String directory,action,page,pageNO,searchWord;
	@Getter
	protected String view;
	
	public void setView(){
		System.out.println("디렉토리: "+directory);
		this.view=
		(directory.equals("/home"))?
				"/WEB-INF/jsp/common/"+this.page+".jsp"
				:"/WEB-INF/jsp"+this.directory+"/"+this.page+".jsp";
	}
}
