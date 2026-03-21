import java.util.Scanner;

public class mad_libs {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String adjective1;
        String verb1;
        String noun1;
        System.out.print("Enter adjective :");
        adjective1=scanner.nextLine();
        System.out.print("Enter verb( is/am/are):");
        verb1=scanner.nextLine();
        System.out.print("Enter noun (person name):");
        noun1=scanner.nextLine();
        
        System.out.println("\nHello, His name " +verb1+" "+noun1+".");
        System.out.println(noun1+" "+ verb1+" a "+ adjective1+" programmer");
        scanner.close();

    }
}
