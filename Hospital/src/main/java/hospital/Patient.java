package hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {

	@Id
	private int id;
	private String name;
	@ManyToMany
	private List<Diseases>Diseases;
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
	public List<Diseases> getDiseases() {
		return Diseases;
	}
	public void setDiseases(List<Diseases> diseases) {
		Diseases = diseases;
	}
	
}
