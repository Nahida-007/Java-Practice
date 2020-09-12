class Student03
{
int id;
String name;
int age;
//creating two argument constructor
Student03(int i,String n)
{
id=i;
name=n;
}
//creating three argument constructor
Student03(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{

System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
Student03 s1=new Student03(12,"A");
Student03 s2=new Student03(13,"B",23);
s1.display();
s2.display();
}
}