package kampOdevIkinciGun;

import java.util.ArrayList;

public class CategoryManager {
	
ArrayList<Category> categories= new ArrayList<Category>();
	
	public void Add(Category category) {
		
		categories.add(category);
		System.out.println("Kategori Eklendi..");
		
	}
	
	public void Delete(Category category) {
		
		categories.remove(category);
		System.out.println("Kategori Silindi.");
	}
	
	public void ToList() {
		for(Category category: categories) {
			System.out.println("Kategori Adý: "+category._name +"\n--------------");
		}
	}

}
