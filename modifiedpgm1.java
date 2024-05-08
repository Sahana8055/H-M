import java.util.Scanner;
 
class Emp {
    String name;
    int id;
    int Age;
    String dg ;
    float Salary ;
 
    Emp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter ID");
        id = sc.nextInt();
        System.out.println("Enter Age");
        Age = sc.nextInt();
    }
    void display() {
        System.out.println("My name is:" + name);
        System.out.println("My Id is:" + id);
        System.out.println("My Salary is:" + Salary);
        System.out.println("My Age is:" + Age);
        System.out.println("My Designation is:" + dg);
    }
}
 
class Dev extends Emp {
    
 
    Dev() {
        String dg = "Developer";
        float Salary = 600000;
    }
}
 
class Clerk extends Emp {
    
 
    Clerk() {
        String dg = "Clerk";
    float Salary = 200000;
    }
}
 
public class modifiedpgm1 {
    public static void main(String args[]) {
        int ch = 0;
 
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1) Developer");
            System.out.println("2) Clerk");
            System.out.println("3) Exit");
            ch = sc.nextInt();
            if (ch == 1) {
                Dev d = new Dev();
                d.display();
            }
            if (ch == 2) {
                Clerk c = new Clerk();
                c.display();
            }
            if (ch == 3) {
                System.out.print("Thank you");
                System.exit(0);
            }
        } while (ch != 3);
    }
    if(ch1==2) 
    {
        d.display();

        
    }
    

    }
}
 
