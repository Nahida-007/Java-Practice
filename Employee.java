public class Employee {
   int id;
   String name;
   Address address;
   public Employee (int id,String name,Address address){
       this.id=id;
       this.name=name;
       this.address=address;
   }
   void display(){
       System.out.println(id+" "+name);
       System.out.println(address.city+" "+address.state+" "+address.country);
   }
   public static void main(String args[]) {
       Address address01=new Address("HYD","tel","india");
       Address address02=new Address("bbsr","odisha","inida");
       Employee E1=new Employee(101,"SATISH",address01);
       Employee E2=new Employee(102,"NARESH",address02);
       E1.display();
       E2.display();
   }
}
