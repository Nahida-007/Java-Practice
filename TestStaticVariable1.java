//java program to demonstrate the use of static variable
class Student06{
int rollno;//instance variable
String name;
static String college="BPUT";//static variable
// constructor
Student06(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);}
}
//test class to show the values of objects
public class TestThis1
{
public static void main(String args[])
{
Student06 s1=new Student06(34,"Kareena");
Student06 s2=new Student06(56,"Vishal");
Student06 s3=new Student06(25,"Dinema");
Student06.college="IIT";
s1.display();
s2.display();
s3.display();
}
}