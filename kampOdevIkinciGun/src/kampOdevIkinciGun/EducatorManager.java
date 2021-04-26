package kampOdevIkinciGun;

import java.util.ArrayList;

public class EducatorManager {
	
ArrayList<Educator> educators= new ArrayList<Educator>();
	
	public void Add(Educator educator) {
		
		educators.add(educator);
		System.out.println("E�itmen Eklendi..");
		
	}
	
	public void Delete(Educator educator) {
		
		educators.remove(educator);
		System.out.println("E�itmen Silindi.");
	}
	
	public void ToList() {
		for(Educator educator: educators) {
			System.out.println("E�itmen Ad�: "+educator._name + " " +educator._lastName+"\n--------------");
		}
	}

}
