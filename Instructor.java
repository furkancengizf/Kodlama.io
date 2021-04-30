package Kodlama.io;
 
 public class Instructor extends User {
   private int numberOfsStudent;
   private int numberOfCourses;
   
   public Instructor(int id, String name, int age, String email, int numberOfStudent, int numberOfCourses){
     super(id, name, age, email);
    this.numberOfStudent = numberOfstudent;
    this.numberOfCourses = numberOfCourses;

   }
   
   public int getnumberOfStudent(){
     return numberOfStudent;
   }
    
   public int setnumberOfStudent(int numberOfStudent){
     this.numberOfStudent = numberOfStudent
   }
   
   public int getnumberOfcourses(){
     return numberOfCourses
   }
   
   public int setnumberOfcourses(int numberOfCourses){
     this.numberOfCourses = numberOfCourses
   }
     
   
 }
 
