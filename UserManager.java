package Kodlama.io;

public class UserManager {
  
     public void getall(User user){
       System.out.println(User.getname() + "İsimli kişi getirildi")
       
     }
     
     public void add(User user){
       System.out.println(User.getname() + "İsimli Kişi Eklendi")
     }
     
     public void delete(User user){
       System.out.println(User.getname() + "İsimli Kişi Silindi")
     }
     
     public void update(User user){
       System.out.println(User.getname() + "İsimli Kişi Güncellendi")
     }
}
