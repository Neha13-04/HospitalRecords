package hospital;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Record {

	@Id
	private int id;
	private String name;
    private  String time;
    private String Symtoms;
    @ManyToOne
    Patient p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSymtoms() {
		return Symtoms;
	}
	public void setSymtoms(String symtoms) {
		Symtoms = symtoms;
	}
	public Patient getP() {
		return p;
	}
	public void setP(Patient p) {
		this.p = p;
	}
    
}
