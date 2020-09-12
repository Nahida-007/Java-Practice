//Method overloading changing datatype of argument
class Adder
{
static int add(int a,int b)
{
return a+b;
}
static double add(double a,double b, double c)
{
return a+b+c;
}
}
class TestOverloading2
{
public static void main(String[] args)
{
System.out.println(Adder.add(45,78));
System.out.println(Adder.add(5.7,78.9,10.5));

}
}