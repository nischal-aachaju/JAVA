// import java.util.Scanner;

// public class Main {
//     public static void main(String[]args)
//     {
//         int value;
//         double pi=3.1415;
//         char a='y';
//         String he;
//         value=3;
//         he="hello";
//         boolean isStudent=true;

//         System.out.println("Hello world");
//         System.out.println("integer:"+value);
//         System.out.println("string:"+he);
//         System.out.println("double:"+pi);
//         System.out.println("char:"+a);
//         System.out.println("Boolean:"+isStudent);
//         if (isStudent){   
//             System.out.println("you are student");
        
//         }
//         else{
//             System.out.println("you are not student");
//         }

//         Scanner scanner=new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age=scanner.nextInt(); // for inteher input
//         scanner.nextLine();
//         System.out.print("Enter your name: ");
//        // String name=scanner.next(); take first word only
//         String name=scanner.nextLine();// take all the words 

//         System.out.print("Enter yor gpa:");
//         double gpa=scanner.nextDouble();
//         System.out.print("Are you student ?(true/false)");
//         isStudent=scanner.nextBoolean();
//         System.out.println("Dear, " +name);
//         System.out.println("You are "+age+" years old");
//         System.out.println("You scored "+gpa+" GPA");
//         System.out.println("Student:"+isStudent);

//         if (isStudent){
//             System.out.println("You can enrolled in this course");
//         }
//         else{
//             System.out.println("You can't enrolled in this course");
//         }

//         scanner.close();


//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Area of rectriangle");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Length:");
        double length=input.nextDouble();
        System.out.print("Enter Breath:");
        double breath=input.nextDouble();
  
        double area=length*breath;
        System.out.println("Area of rectriangle:"+area+"cm²");
        input.close();

    }
    

}