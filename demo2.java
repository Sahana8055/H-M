import java.util.Scanner;
class A
{
int id,age;
String name;
float salary;
String designation;
  A()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name ");
name=sc.next();

System.out.println("enter id ");
id=sc.nextInt();

System.out.println("age ");
age=sc.nextInt();

System.out.println("salary ");
salary=sc.nextFloat();

System.out.println("designation ");
designation=sc.next();
}
void display(){
System.out.println("id" +id);
System.out.println("name" +name);
System.out.println("age" +age);
System.out.println("salary" +salary);
System.out.println("designation" +designation);
}

}
public class demo2
{
public static void main(String args[]){
  System.out.println("hi njava");
  A a=new A();
  a.display();
}
}

