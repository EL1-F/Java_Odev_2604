package kampOdevIkinciGun;

public class Main {

	public static void main(String[] args) {
		
		
		//Kurslar
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demirog");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demirog");
		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs","Engin Demirog");
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Add(course3);
		
		courseManager.ToList();
		
		courseManager.Delete(course3);
		courseManager.ToList();
		
		
		//Kategoriler
		Category category1 = new Category(1, "Programlama");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.Add(category1);
		
		categoryManager.ToList();
		
		
		//E�itmenler
		Educator educator1 = new Educator(1, "Engin", "Demirog");
		
		EducatorManager educatorManager= new EducatorManager();
		educatorManager.Add(educator1);
		
		educatorManager.ToList();

	}

}
