public class Inheritance{

private String name;
private int age;
private String address;

public  Inheritance(String name,int age,String address){
    
    this.name=name;
    this.age=age;
    this.address=address;
    
  }
public void setName(String name){
    
    this.name=name;
   }
  public void setAge(int  age){
    
    this.age=age;
   }
    public void setAddress(String address){
    
    this.address=address;
   }
    
public String getName()
{
   return name;
}
public int  getAge()
{
   return age;
}
public String getAddress()
{
   return address;
}
public String toString()
{
   return ("Student  name is "+this.getName()+"age is "+getAge()+"and address is "+this.getAddress());

}
   public static void main(String[] args) {
     
      Inheritance  Ajit = new Inheritance("Ajit kumar ",18,"18 East ,California ");
       
      System.out.println(Ajit.getName());
      System.out.println(Ajit.getAge());
      System.out.println(Ajit.getAddress());
    
    }

}  