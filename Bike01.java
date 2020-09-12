//java method overriding

//creating a parent class
class Vehicle
{
void run()
{
System.out.println("Vehicle is running");
}
//creating a child class
class Bike01 extends Vehicle
{
//defining same method as in parent class
void run()
{
System.out.println("Bike is running safely");
}
public static void main(String[] args)
{
//creating object
Bike01 b=new Bike01();
b.run();
}
}
