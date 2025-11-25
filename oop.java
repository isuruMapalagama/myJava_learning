// class Calculator{
//     public int add(int n1,int n2){
//         return n1 +n2;
//     }
//     public int sub(int n1, int n2){
//         return n1-n2;
//     }
//     public int mult(int n1, int n2){
//         return n1*n2;
//     }
//     public double divide(int n1, int n2){
//         return (double)n1/n2;
//     }
// }
// public class oop{
//     public static void main(String[] args) { 
//         Calculator obj = new Calculator();
//         int r1 =obj.add(3,5);
//         int r2 =obj.sub(17,5);
//         int r3 =obj.mult(7,98);
//         double r4 =obj.divide(144,12);


//         System.out.println(r1);
//         System.out.println(r2);
//         System.out.println(r3);
//         System.out.println(r4);

//     }
// }
 
// class Car{
//     String brand;
//     String color;
//     double speed;

//     public void drive(){
//         System.out.println(brand + " is driving at " + speed + "km/h");
//     }

//     public void stop(){
//         System.out.println(brand + " has stopped. ");
//     }
// }

// public class oop{
//     public static void main(String[] args){
//         Car car1 = new Car();
//         car1.brand = "Nissan";
//         car1.color = "Blue";
//         car1.speed = 140.5;

//         car1.drive();
//         //car1.stop();

//     }

// ---- Encapsulation
// class Human{
//     private int age;
//     private String name;

//     public Human()
//     {
//         age = 12;
//         name="john";
//     }

//     public int getAge()
//     {
//         return age;
//     }
//     public void setAge(int a)
//     {
//         age = a;
//     } 
//     public String getName()
//     {
//         return name;
//     }
//     public void setName(String n)
//     {
//         name = n;
//     }
// }

// public class oop{
//     public static void main(String[] args){    

//         Human obj = new Human();
        // Human obj2 = new Human();
        // obj.setAge(30);
        // obj.setName("isuru");

//         System.out.println(obj.getName() + " : " + obj.getAge());
//     }
// }