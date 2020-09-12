//Method overloading changing no. of arguments
//in this example, we are creating static methods so that we don't need to create instance for calling methods

class Adder
{
static int add(int a,int b)
{
return a+b;
}
static int add(int a,int b,int c)
{
return a+b+c;
}
}
class TestOverloading1
{
public static void main(String[] args)
{
System.out.println(Adder.add(34,90));
System.out.println(Adder.add(23,45,67));
}
}




