class A{
    static int x=100;
    static void display()
    {
        System.out.println("hi disp");
    }

    
}
class abstraction1{
    public static void main(String args[])
    { System.out.println( A.x);
        A.display();
        
    }
}