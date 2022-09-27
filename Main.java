import java.util.*;
import java.io.RandomAccessFile;
class Main {
  
 
    public static void writeToFile(String file, String data, int position)
            throws Exception {
 
        RandomAccessFile x = new RandomAccessFile(file, "rw");
        x.seek(position);
        x.writeUTF(data);
        x.close();
    }
public static int returnAverage(int x, List<List<Integer>> y){
      int average = 0;
      for(int i = 0; i < y.get(x).size(); i++){
        average += y.get(x).get(i);
      }
      return average/y.get(x).size();
    }
    
  public static void main(String[] args) {
    
    int highest = -200;
    int lowest = 200;
     ArrayList<String> names = new ArrayList<String>();
     Scanner input = new Scanner(System.in);
     boolean isgood = false;
      String hal = "";
      String kp = "";
      int stu = 0;
      int assi = 0;
      int position = -2;
      String grade= "";
      String lname = "";
      String fname = "";
      String assign = "";
      ArrayList<Students> listOfStu = new ArrayList<Students>();
      ArrayList<Integer> positions = new ArrayList<Integer>();
      ArrayList<List<Integer>> allGrades = new ArrayList<List<Integer>>();
       
      ArrayList<Integer> poggers = new ArrayList<Integer>();
      String blank = "                              ";

     while(!isgood){
     try{
      System.out.println("Input number of students:");
      hal = input.nextLine();
      stu = Integer.parseInt(hal);
      System.out.println("Input number of assignments per student:");
      kp = input.nextLine();
      assi = Integer.parseInt(kp);
      isgood = true;
     }
     catch(Exception e){
        System.out.println("Input Correct Values");
       
     }
     }
    int foo = 0; 
      for(int i = 0; i < stu; i++){  
        positions.add(position);
        position += 2;
        boolean iscool = false;
        while(!iscool){
        try{  
            System.out.println("First name:");
            fname = input.nextLine();
            writeToFile("kirsche.csv", fname, position);
            position += fname.length() + 2;
            System.out.println("Last name:");
            lname = input.nextLine();
            writeToFile("kirsche.csv", lname, position);
            position += lname.length() + 2;
            writeToFile("kirsche.csv", blank, position);
            position += blank.length() +2;
            System.out.println("Grade Level:");
            grade = input.nextLine();
            writeToFile("kirsche.csv", grade, position);
            position += grade.length() + 2;
            names.add(fname+" "+lname);
            allGrades.add(new ArrayList<Integer>());
            iscool = true;

        } catch (Exception e) {
           System.out.println("Input Correct Values");
        }
        }
      
        for(int j = 0; j < assi; j++){
          boolean iscoop = false;
          int counter = j+1;
          while(!iscoop){
          try{
            System.out.println("Assignment "+ counter +":");
            assign = input.nextLine();
            foo = Integer.parseInt(assign);
            if(foo >= 100 || foo <= 0) {
            throw new Exception(); }
            writeToFile("kirsche.csv", assign, position);
            position += assign.length()+2;
            
            
            iscoop = true;
          }
          catch (Exception e) {
             System.out.println("Input Correct Values between 0 and 100");
             
       }}
          
          poggers.add(foo);
          allGrades.get(i).add(foo);
              if(foo < lowest){
              lowest = foo;
              }
              if(foo > highest){
              highest = foo;
            }

        }
        try{
        writeToFile("kirsche.csv", "\n", position); 
        position +=1;
        }
        catch (Exception e) {
             System.out.println("Error writing");
        
     }
          Students a = new Students(fname, lname, grade);
          listOfStu.add(a);
          
            int yu = 0;
            for(int l = 0; l < poggers.size(); l++){
              yu += poggers.get(l);
            }
            yu = yu/poggers.size();
            listOfStu.get(i).addGrade(yu);
            poggers.clear();
        }
        int choice = 0;
       
        while(choice != 11){
          choice = 0;
        System.out.println(" .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------. ");
System.out.println("| .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. |");
System.out.println("| |  ____  ____  | || |      __      | || |     ______   | | | |    _____     | || |              | || |     ____     | |");
System.out.println("| | |_   ||   _| | || |     /  \\     | || |   .' ___  |  | | | |   / ___ `.   | || |              | || |   .'    '.   | |");
System.out.println("| |   | |__| |   | || |    / /\\ \\    | || |  / .'   \\_|  | | | |  |_/___) |   | || |              | || |  |  .--.  |  | |");
System.out.println("| |   |  __  |   | || |   / ____ \\   | || |  | |         | | | |   .'____.'   | || |              | || |  | |    | |  | |");
System.out.println("| |  _| |  | |_  | || | _/ /    \\ \\_ | || |  \\ `.___.'\\  | | | |  / /____     | || |      _       | || |  |  `--'  |  | |");
System.out.println("| | |____||____| | || ||____|  |____|| || |   `._____.'  | | | |  |_______|   | || |     (_)      | || |   '.____.'   | |");
System.out.println("| |              | || |              | || |              | | | |              | || |              | || |              | |");
System.out.println("| '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' |");
System.out.println(" '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------' "); 
        System.out.println("Welcome to HAC! You are logged in as: PHP Lover ZK."); 
        System.out.println("Please Use Numbers 1-11 to Navigate:"); 
        System.out.println("1: Add a Student to the Roster, another lost soul");
         System.out.println("2: Find the Average for a Student, you shouldn't have high expectations..."); 
          System.out.println("3: Add an Assignment for All the Students, lets make their life miserable "); 
           System.out.println("4: Output The Highest Grade, best cheater in the class"); 
            System.out.println("5: Output The Lowest Grade, HAHAHAHAHA rekt, so bad");
             System.out.println("6: Change a Student's Name, you should change their social security numbers while you are at it"); 
              System.out.println("7: Students Currently Failing the Class, execution list");
               System.out.println("8: Students who Have an A, Brayden Smith?");
                System.out.println("9: Return the Entire Class's Average, are you sure you want to see this?");
                 System.out.println("10: Output every student's average in a list, you sure this isn't the weather forecast for winter in the North Pole?");
                 System.out.println("11: Closes the Program, time to play geo guesser");
                  System.out.println("Note: Because my code is too efficent, it prints out information at 5.0GHZ, so you may have to scroll up for answer");
        try{
             String beanguy = input.nextLine();
             choice = Integer.parseInt(beanguy);
            
          }
          catch(Exception e){
            System.out.println("Enter a single number");
            System.out.println("");
          }
        
        if(choice ==1){
          boolean iscoood = false;
           System.out.println("Don't repeat names Please");
           while(!iscoood){
          try{
            System.out.println("First name:");
            fname = input.nextLine();
            writeToFile("kirsche.csv", fname, position);
            position += fname.length() + 2;
            System.out.println("Last name:");
            lname = input.nextLine();
            writeToFile("kirsche.csv", lname, position);
            position += lname.length() + 2;
            writeToFile("kirsche.csv", blank, position);
            position += blank.length() +2;
            System.out.println("Grade Level:");
            grade = input.nextLine();
            writeToFile("kirsche.csv", grade, position);
            position += grade.length() + 2;
            names.add(fname+" "+lname);
            Students a = new Students(fname, lname, grade);
            listOfStu.add(a);
            stu++;
            allGrades.add(new ArrayList<Integer>());
            iscoood = true;
            
          }
          catch(Exception e){
             System.out.println("Input Correct Values");
             System.out.println("");
     }}
          }
         
        
        else if(choice == 2){
          String name = "";
          try{
              System.out.println("Enter student's first and last name");
              name = input.nextLine();
          } 
          catch(Exception e){
            System.out.println("Incorrect Formating");
            System.out.println("");
          }
          int place = 100;

           for(int i = 0; i < names.size();i++){
              if(name.equals(names.get(i))){
                place = i;
           }}
           if(place == 100){
             System.out.println("Student does not exist");
             continue;
           }
          System.out.print(name+"'s average is: ");
          System.out.println(listOfStu.get(place).averages(0));
          System.out.println("");
        }
        else if(choice == 3){
          assi++;
          for(int i = 0; i < stu; i++){
            boolean iscook = false;
              while(!iscook){
          try{
            System.out.println("What is the score for "+ names.get(i)+ ":");
            String newAssi = input.nextLine();
            foo = Integer.parseInt(newAssi);
            allGrades.get(i).add(foo);
            writeToFile("kirsche.csv", names.get(i) + ":" + newAssi, position);
            position += newAssi.length()+names.get(i).length()+3;
            iscook = true;
            assi +=1 ;
          }
          catch(Exception e){
                  System.out.println("Input Correct Values");
                  System.out.println("");
          }}
            
            listOfStu.get(i).modGrade((listOfStu.get(i).averages(0)*(assi-1)+foo)/assi);
        } 
        try{
          writeToFile("kirsche.csv", "    ", position); 
        position +=5;
           writeToFile("kirsche.csv", "\n", position);
           position+=1;
        }
         catch(Exception e){
                  System.out.println("Error Writing");
                  System.out.println("");
              
          }
          
        }
        else if(choice == 4){
          System.out.println(highest);
        }
        
        else if(choice == 5){
          System.out.println(lowest);
        }
        
        else if(choice == 6){
          String lp = "";
          String name = "";
          int temp = 0;
          try{
              System.out.println("Enter student's first and last name");
              name = input.nextLine();
          } 
          catch(Exception e){
            System.out.println("Incorrect Formating");
            System.out.println("");
          }
           int po = 0;
           
         for(int j = 0; j < assi; j++){
                if(names.get(j) == name){
                  temp = positions.get(j);
                  po = j;
                }
          }
          boolean iscoom = false;
          while(!iscoom){
          try{
              System.out.println("New first name:");
              fname = input.nextLine();
              writeToFile("kirsche.csv", fname, temp);
              temp += fname.length() + 2;
              System.out.println("New last name:");
              lname = input.nextLine();
              writeToFile("kirsche.csv", lname, temp);
              listOfStu.get(po).changeName(fname, lname);
              iscoom = true;
          }
          catch(Exception e){
             System.out.println("Input Correct Values");
          }
          System.out.println("");
          }
          for(int i = temp; i < 30 - temp - po-2; i++){
              lp += " ";
          }
             try{
           writeToFile("kirsche.csv", " ", temp);
        }
         catch(Exception e){
                  System.out.println("Error Writing");
                  System.out.println("");
         
          }
           
          
        }
        else if(choice == 7){
          boolean fail = true;
           for(int j = 0; j < stu; j++){
                if(returnAverage(j, allGrades) <= 50){
                  System.out.println(listOfStu.get(j).getFname()+ " "+listOfStu.get(j).getLname());
                  fail = false;
                }
          }
          if(fail){
            System.out.println("Everyone is cheating, time to call the kill squad(No one is failing)");
          }
          System.out.println("");
        }
         
        else if(choice == 8){
          boolean fail = true;
           for(int j = 0; j < stu; j++){
                if(returnAverage(j, allGrades) >= 90){
                  System.out.println(listOfStu.get(j).getFname()+ " "+listOfStu.get(j).getLname());
                  fail = false;
                }
          }
          if(fail){
            System.out.println("The class would like a 20 point curve(No one has an A)");
          }
          System.out.println("");
        }
        else if(choice == 9){
           int ubt = 0;
           for(int i = 0; i < listOfStu.size();i++){
              ubt+= listOfStu.get(i).averages(0);
          
        }
         System.out.print("Class Average is: " );
         System.out.println(ubt/listOfStu.size());
        }
        else if(choice == 10){
          for(int i = 0; i < listOfStu.size();i++){
              System.out.print("The average for "+ names.get(i)+ " is ");
              System.out.println(listOfStu.get(i).averages(0));
            
          }
        }
        else{
          System.out.print("Enter a number from 1-9");
        }
         
        }
        
        
  
  }
  
}
    

  
