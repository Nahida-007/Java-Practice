class Student{  
 int rollno;  
 String name;  
 void insertRecord(int r, String n){  
  rollno=r;  
  name=n;  
 }  
 void displayInformation(){System.out.println(rollno+" "+name);}  
}  
class TestStudent4{  
 public static void main(String args[]){  
  Student s1=new Student();  
  Student s2=new Student();  
  s1.insertRecord(10,"jasmeen");  
  s2.insertRecord(20,"bhawaya");  
  s1.displayInformation();  
  s2.displayInformation();  
 }  
}  

