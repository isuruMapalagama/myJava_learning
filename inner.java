// how to access inner class
// outer classes cannot be static
class A
{
    public void show()
        {
            System.out.println("in claas A");
        }
    
    class B // IF THIS CLASS STATIC, NO NEED T0 MENTION OBJ
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}

public class inner {
    
    public static void main(String[] arg)
    {
        // ----inner class--
        // A obj = new A();
        // obj.show();

        // A.B obj1 = new A.B(); THIS HAPPEN ONLY CLASS B (THE INNER CLASS) IS STATIC
        // A.B obj1 = obj.new B();
        // obj1.config();
        //--- anonymous inner class---
        A obj = new A()
        {
           public void show()
           {
            System.out.println("in new Show");
           } 
        }; // <---anonymous inner class
        // You can do this also to Abstrsct classes
        obj.show();
    }
}
