class Student01{
int id;
String name;
//methods to display the the value of id and name
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
//object creation
Student01 s1=new Student01();
Student01 s2=new Student01();
//displaying values of the object
s1.display();
s2.display();
}
}