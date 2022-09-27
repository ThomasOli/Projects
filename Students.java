import java.util.*;
import java.io.*;
public class Students {
  
  private String lastName;
  private String firstName;
  private String gradeLevel;
 
  private ArrayList<Integer> totalGrades = new ArrayList<Integer>();
  public Students(String y, String x, String z) {
          this.lastName= x;   
          this.firstName = y; 
          this.gradeLevel = z; 
          
  }

  public void changeName(String x, String y){
      this.lastName = y;
      this.firstName = x;
  }
   public int averages(int p){
      return this.totalGrades.get(p);
  }


  
     public String getFname(){

        return this.firstName;
    
     }
       public String getLname(){

         return this.lastName;
    
     }
  public void addGrade(int a){
    this.totalGrades.add(a);
  }
   public void modGrade(int a){
    this.totalGrades.set(0,a);
  }
  
}