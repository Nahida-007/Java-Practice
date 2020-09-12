class A
{
void msg()
{
System.out.println("Hello");
}
}
class B
{
void msg()
{
System.out.println("welcome");
}
}
class C extends A,B
{
void reply()
{
System.out.println("reply");
}
}
class MultipleInheritance
{
public static void main(String args[])
{
C obj=new C();
obj.msg();
}
}
