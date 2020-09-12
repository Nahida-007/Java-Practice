//method overloading is not possible by changing return type

class Adder
{
static int add(int a,int b)
{
return a+b;
}
static double add(int a,int b)
{
return a+b;
}
}
class TestOverloading3
{
public static void main(String[] args)
{
System.out.println(Adder.add(12,12));
}
}


complile time error
