//initialize the object through a reference variable
//class Student
//{
//int id;
//String name;
//public static void main(String args[])
//{
//Student s1=new Student();
//System.out.println(s1.id);
//System.out.println(s1.name);
//} 
//}


//initialize by multiple objects and store information through referance variable

class Student
{
int id;
String name;

Class TestStudent3
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.id=101;
s2.name="archana";
s2.id=102;
s1.name="archu";
System.out.println(s1.id+" "+s2.id);
System.out.println(s2.name+" "+s2.id);
}

