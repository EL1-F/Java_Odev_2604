package kampOdevIkinciGun;

import java.util.ArrayList;

public class EducatorManager {
	
ArrayList<Educator> educators= new ArrayList<Educator>();
	
	public void Add(Educator educator) {
		
		educators.add(educator);
		System.out.println("Eðitmen Eklendi..");
		
	}
	
	public void Delete(Educator educator) {
		
		educators.remove(educator);
		System.out.println("Eðitmen Silindi.");
	}
	
	public void ToList() {
		for(Educator educator: educators) {
			System.out.println("Eðitmen Adý: "+educator._name + " " +educator._lastName+"\n--------------");
		}
	}

}
