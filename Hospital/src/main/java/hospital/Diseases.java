package hospital;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diseases {

	@Id
	private int id;
	private String Dname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	
}
