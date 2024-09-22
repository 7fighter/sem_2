/*
// // write a program to find the salary per hour
// import java.util.Scanner;
// public class Sec {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Welcome to the Salary calculator ");
//         System.out.println("Enter the number of hours you work  ");
//         int hour = sc.nextInt();
//         System.out.println("Enter you pay ");
//         int pay = sc.nextInt();
//         if (hour <= 40){
//            double total_pay = pay * hour;
//            System.out.println("total pay that is being received is "+ total_pay); 
//         }
//         else{
//             double total_pay =  (hour - 40)*(1.5*pay) + (40 * pay);
//             System.out.println("total pay is being received is"+total_pay);
            

//         }
        
//     } 

// }
/**
 * new comment check kr rah hoon 
 * yh v sahii hain 
 * 
 */


/*//   input string from the keyboard
 import java.util.Scanner;
public class Sec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String first_name = sc.nextLine();
        System.out.println("Enter your second name ");
        String second_name = sc.nextLine();
        //  double equal is matching the memory addressess that's why below code is not true for if condition
        // if (first_name == second_name){
        //     System.out.println(first_name+"is same as second name "+second_name);
        // }
        // else{
        //     System.out.println(first_name+"not equal != "+second_name);
        // }
        //  over here equal method is checking directly alphabets and is not chechking memory addresses
        if(first_name.equals(second_name)){
             System.out.println(first_name+"is same as second name "+second_name);
         }
         else{
            System.out.println(first_name+"not equal != "+second_name);        }
    } 
}*/



/*// assigning the variable constant value specially string 
public class Sec{
    public static void main(String[] args) {
        String name = new String("abbas");
        System.out.println(name);
        
    }
}*/


// public class Sec{
//     public class chair{
//         String type;
//         Boolean handrest;
    
//     }
//     public static void main(String[] args) {
        
    
//     chair c1 = new chair();
//     c1.type = "office chair";
//     c1.handrest = true;
// }
// }

// public class Sec{


//     public static void main(String[] args) {
//             int a = 10;
//             int b = 20;
//             System.out.println( (a>b)? "True":"False");
       
//     }
// }

import Lab.Assi;

public class Sec {
    
    public static void main(String[] args) {
        int num = 10;
        Sec a = new Sec(); // created an insatance to access non statacic
        a.modifyPrimitive(num);
        System.out.println("After method call: " + num); // Output: 10
    }

    public int modifyPrimitive(int n) {
       return n = 20;
    }
}



