package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class HospitalData {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Neha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Scanner sc=new Scanner(System.in);
	Hospital Hs=new Hospital();
	Hs.setId(1);
	Hs.setName("Apollo");
	
	Branches b=new Branches();
	b.setId(1);
	b.setBranchname("pune");
	
	Branches b1=new Branches();
	b1.setId(2);
	b1.setBranchname("mumbai");
	
	
	Branches b2=new Branches();
	b2.setId(3);
	b2.setBranchname("andaman");
	
	List<Branches>branches=new ArrayList<Branches>();
   branches.add(b);
    branches.add(b1);
    branches.add(b2);
    Hs.setBranches(branches);
    
    Address a=new Address();
    a.setId(1);
    a.setPincode(416329);
    Address a1=new Address();
    a1.setId(2);
    a1.setPincode(416082);
    Address a2=new Address();
    a2.setId(3);
    a2.setPincode(10329);
    
    b.setA(a);
    b1.setA(a1);
    b2.setA(a2);
   
  
   
    Patient p=new Patient();
    p.setId(1);
    p.setName("A");
   
    Patient p1=new Patient();
    p1.setId(2);
    p1.setName("B");
   
    Patient p2=new Patient();
    p2.setId(3);
    p2.setName("C");
    
    Record record=new Record();
    record.setId(1);
	record.setName("flu");
	record.setTime("2-2-2022");
    record.setSymtoms("high temperature");
    record.setP(p);
	 Record record1=new Record();
	   record1.setId(2);
		record1.setName("cold");
		record1.setTime("4-6-2022");
		record1.setSymtoms("headache");
		record1.setP(p);
		 Record record2=new Record();
		   record2.setId(3);
			record2.setName("backpain");
			record2.setTime("23-11-2022");
			record2.setSymtoms("pain");
			record2.setP(p);
	List<Record>records=new ArrayList<Record>();
    records.add(record);
    records.add(record1);
    records.add(record2);
    
    b.setRecord(records);
   
    
    
    Diseases D=new Diseases();
    D.setId(1);
    D.setDname("flu");
    
    Diseases D1=new Diseases();
    D1.setId(2);
    D1.setDname("cold");
    
    Diseases D2=new Diseases();
    D2.setId(3);
    D2.setDname("backpain");
    
    List<Diseases>Disease=new ArrayList();
    Disease.add(D);
    Disease.add(D1);
    Disease.add(D2);
    
    p.setDiseases(Disease);
    p1.setDiseases(Disease);
    p2.setDiseases(Disease);
   
    et.begin();
   em.persist(Hs);
   em.persist(b);
   em.persist(b1);
   em.persist(b2);
   em.persist(a);
   em.persist(a1);
   em.persist(a2);
   em.persist(D);
   em.persist(D1);
   em.persist(D2);
   em.persist(p);
   em.persist(p1);
   em.persist(p2);
   em.persist(record);
   em.persist(record1);
   em.persist(record2);

   et.commit();
}


}
