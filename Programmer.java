class Employee{
float salary=50000;

}
class Programmer extends Employee{
int bonus=5000;
public static void main(String args[]){
Programmer p=new Programmer();
System.out.println("Programmer salary:"+p.salary);
System.out.println("Bonus of Programmer:"+p.bonus);
}
}