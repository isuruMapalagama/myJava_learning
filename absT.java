abstract class Car{

    public abstract void fly();
    public abstract void  drive();

    public void playmusic()
    {
        System.out.println("play music");
    }
}

class WagonR extends Car
{

    public void fly()
    {
        System.out.println("Flying..");
    }
    public void drive()
    {
        System.out.println("Driving..");
    }
}

public class absT
{
    public static void main(String[] args)
    {
        Car obj= new WagonR();
        obj.drive();
        obj.playmusic();
        obj.fly();
        
        
    }
}
// must have to define all the abstract methods
// cannot create objects of abstract class


// ----- This is for abstract and anoynmous inner class-----
    //    {
    //        public void fly()
    //        {
    //         System.out.println("in new Show 1");
    //        } 
    //        public void drive()
    //        {
    //         System.out.println("in new show 2");
    //        }
    //     }