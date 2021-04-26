package kampOdevIkinciGun;

import java.util.ArrayList;


public class CourseManager {
	
	//Course course[]= {};
	ArrayList<Course> courses= new ArrayList<Course>();
	
	public void Add(Course course) {
		
		courses.add(course);
		System.out.println("Kurs Eklendi..");
		
	}
	
	public void Delete(Course course) {
		
		courses.remove(course);
		System.out.println("Kurs Silindi.");
	}
	
	public void ToList() {
		for(Course course: courses) {
			System.out.println("Kurs Adý: "+course._name + "\nEðitmen: "+ course._educator+"\n--------------");
		}
	}

}
