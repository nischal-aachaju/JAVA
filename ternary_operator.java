import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=14;
        String canCastVote=(age>=18)?"You can vote":"You cannot vote";
        System.out.println(canCastVote);
        
        String name= "";
        while(name.isEmpty()){
            System.out.print("Enter name: ");
            name=scanner.nextLine();
        }
        System.out.print("Name:"+name);
        
        scanner.close();
    }
}
