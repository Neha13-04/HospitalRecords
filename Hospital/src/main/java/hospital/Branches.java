package hospital;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branches {

	    @Id
		private int id;
		private String branchname;
		
		@OneToOne
		Address A;
		
		@OneToMany
		private List<Record>record;
		public List<Record> getRecord() {
			return record;
		}

		public void setRecord(List<Record> record) {
			this.record = record;
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBranchname() {
			return branchname;
		}

		public void setBranchname(String branchname) {
			this.branchname = branchname;
		}

		
		public Address getA() {
			return A;
		}

		public void setA(Address a) {
			A = a;
		}

		
}
