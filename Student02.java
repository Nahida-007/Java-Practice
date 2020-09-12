class Student02
{
String id;
String name;
//creating parameterized constructor
Student02(String i,String n)
{
id=i;
name=n;
}
//mthod to display the values
void display()
{
System.out.println(id+"--->"+name);
}
public static void main(String args[])
{
//creating objects and passing values
Student02 s1=new Student02("SY-50","Archana");
Student02 s2=new Student02("SY-51","Pradhan");
//calling method to display the values of object
s1.display();
s2.display();
}
} 
