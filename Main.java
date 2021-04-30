package Kodlama.io;

public class Main {

	public static void main(String[] args) {

	
		System.out.println("   JAVA & REACT YAZILIM GELİŞTİRİCİ YETİŞTİRME KAMPI ");
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(1, " Engin Demiroð", 28, "email boşver", 1500, 50);
		instructorManager.add(instructor);
		instructor.setName("> ENGİN DEMİROĞ");
		instructorManager.update(instructor);
	
	
		StudentManager studentManager = new StudentManager();
		Student student = new Student(2, "Furkan Cengiz", 17, "boşver", 80, 10);
		studentManager.add(student);
		student.setName("Furkan Cengiz");
		studentManager.update();
		
		
		UserManager userManager = new UserManager();
		userManager.getAll(student);
		userManager.getAll(instructor);

	
  }

}
