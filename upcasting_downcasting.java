class A
{
    public void show1()
    {
        System.out.println("in A method");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("in B method");
    }
}


public class upcasting_downcasting {
    
    public static void main(String[] args){

        A obj = new B();
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();
    }
}
