import java.util.Scanner;

public class shopping_cart {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("What item would you like to buy ? : ");
        String item=scanner.nextLine();
        System.out.print("What is the price for each? :");
        double price=scanner.nextDouble();
        System.out.print("How many would you like to buy? :");
        int quantity=scanner.nextInt();

        System.out.println("\nYou buy "+quantity+ " "+item);
        double total=price* quantity;
        System.out.println("Total = $"+total);

        scanner.close();
    }
}
