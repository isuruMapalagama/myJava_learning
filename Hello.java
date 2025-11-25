public class Hello
{
       public static void main(String[] args){
        //int number = 10;
        //double pi = 3.14;
        //float e = 2.71f;
        //char letter = 'A';
        
        //System.out.println("The number is: " + number);
        //System.out.println("The double is: " + pi);
        //System.out.println("The float is: " + e);
        //System.out.println("The character is: " + letter);

        //---literals---

        //char c = 'a';
        //c++;
        //System.out.println(c);


        //---type casting---

        //byte b = 125;
        //int a = 512;
        //b = (byte)a;
        //byte k = (byte) a;
        //System.out.println(k);
         
        //float f = 7.9f;
        //int i = (int) f;
        //System.out.println(i);

        //---operators---

        //int num = 6;

        //num = num + 4;
        //num += 4;
        //num++;       //--Post Increment
        //++num;       //--Pre Increment

        // ----int result = num++; // fetcg the value and then increment
        // int result = ++num; // increment the value and then fetch
        //System.out.println(result);
        //System.out.println(num);

        //----logical operators----

        //int x = 5;
        //int y = 8;
        //int a = 9;
        //int b = 3;

        //boolean result = (x>y) || (a>b);
        // **System.out.println( ! //result);**

        //int x = 2;
        //int y = 6;
        //int z = 3;
        

        //if(x>y && x>z)
        //    System.out.println(x);
        //else if (y>z)
        //    System.out.println(y);
        //else
        //    System.out.println(z);
            
        //----Ternary Operator----
        //int a =10;
        //int result = 0;

        //result = a%2==0?10:20;
        //System.out.println(result);


        //----Switch Case Updated----
        //String  day = "Monday";
        //String result = "";

       // result = switch(day)
        //{
           // case "Monday" : yield "Start of the work week";
            //case "Wednesday" : yield "Midweek day";
            //case "Friday" : yield "End of the work week";
            //case "Saturday", "Sunday" : yield "Weekend!";
           // default : yield "Just another day";
        //}; 

        //System.out.println(result);
    
        

        //----Loops----
        
        //int i = 7;

        //do
        //{
            //System.out.println("Hi " + i);
            //i++;

        //}while(i<=5);
        
            //System.out.println("Bye " + i);

        // for(int i= 1 ;i<=10;i++)
        // {
        //     for(int j=1;j<=i;j++){
        //         System.out.print("@ ");
        //     }
        //     System.out.println();
        //     }



        //----Arrays----

        // int num[]={1,2,3,4,5};
        // num[2]=10;

        // int num[]= new int [4];
        // num[0]=5;
        // num[1]=10; 
        // num[2]=15;
        // num[3]=20;

        // for(int i=0;i<4;i++){

        //     System.out.println(num[i]);
        // }   


        // int num[][] = new int[3][4];
        // // ** Filling the 2D array with random numbers **
        // for(int i=0;i<3;i++){

        //     for(int j=0;j<4;j++)
        //     {
        //      num[i][j]=(int)(Math.random()*1000);   
        //     }
        // }

        // // ** Printing the 2D array **
        // for(int i=0;i<3;i++){

        //     for(int j=0;j<4;j++){

        //         System.out.print(num[i][j] + " ");
            
        //     }
        //     System.out.println();
        // }

        // // Enhanced for loop
        // for(int n[] : num){
        //     for(int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // int num[][] = new int[3][]; // Jagged array

        // num[0] = new int[2];
        // num[1] = new int[3];
        // num[2] = new int[4]; 

        // for(int i=0;i<num.length;i++)
        // {
        //     for(int j=0;j<num[i].length;j++)
        //     {
        //         num[i][j] = (int)(Math.random()*100);
        //     }
        // }
        
        // for(int n[]:num){   // Enhanced for loop
        //     for(int m:n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "Isuru";
        // s1.marks = 75;

        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "Nuwan";
        // s2.marks = 81;

        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "Medha";
        // s3.marks = 49;

        // Student students[] = new Student[3];
        //  students[0] = s1;
        //  students[1] = s2;
        //  students[2] = s3;


        //  for(Student s : students)
        //  {
        //     System.out.println(s.name + ": " + s.marks);
        //  }
        //  for(int i=0;i<students.length;i++)
        //  {
        //     System.out.println(students[i].name + ": " + students[i].marks);
        //  }


        // Enhanced for loop
        // int nums[] = new int[4];
        // nums[0]=10;
        // nums[1]=45;
        // nums[2]=62;
        // nums[3]=13;

        // for(int n : nums){

        //     System.out.println(n);
        // }

        // String name ="isuru";
        // System.out.println("hello" + name);

        //StringBuffer

        //    StringBuffer sb = new StringBuffer("Hello");
        //    sb.append(" World");
        //    sb.deleteCharAt(6);



        //    System.out.println(sb);

//         Mobile obj1 = new Mobile();
//         Mobile.brand = "Apple";
//         Mobile.model = "iPhone 13";
//         obj1.price = 999;

//         Mobile obj2 = new Mobile();
//         //obj2.brand = "Samsung";
//         //Mobile.model = "Galaxy S21";
//         obj2.price = 1999;

//         //Mobile.model ="OnePlus 9";

//         obj1.show();
//         obj2.show();
//     }
// }


//     class Mobile{
//     static String brand;
//     static String model;
//     int price;

//     public void show()
//     {
//         System.out.println(brand + " : " + price + " : " + model);
//     }

//     public static void show1(Mobile j){
//         System.out.println(brand + " : " + model + " : " + j.price );

// ---inheritance---


    // VeryAdvCalc obj = new VeryAdvCalc();
    // int r1 = obj.add(8,9);
    // int r2 = obj.sub(10,5);
    // int r3 = obj.multi(5,3);
    // int r4 = obj.div(8,2);
    // double r5 = obj.power(8,2);


    // System.out.println(r1 + " " + r2);
    // System.out.println(r3 + " " + r4);
    // System.out.println(r5);



    // B obj = new B(4);    SUPER AND THIS METHOD---

     }
}


// class Student{
//     int rollno;
//     String name;
//     int marks;
// }

// ---super and this method
// class A
// {
//     public A()
//     {
//     super();
//     System.out.println("in A");
//     }
//     public A(int n)
//     {
//     super();
//     System.out.println("in A INT");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         super();
//         System.out.println("in B");
//     }
//     public B(int n)
//     {
//         // super();
//         this();// execute the constructor of the same class (B())
//         System.out.println("in B INT");
//     }
// }


