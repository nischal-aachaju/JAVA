import java.util.Scanner;

public class Compound_Intrest {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double principal;
        int timesCompounded;
        double rate;
        double time;
        double amount;
        double CompoundIntrest;

        // principal
        System.out.print("Enter principal:");
        principal=scanner.nextDouble();

        //Rate
        System.out.print("Enter Rate:");
        rate=scanner.nextDouble()/100;

        // Time
        System.out.print("Enter time:");
        time=scanner.nextDouble();

        // Times compounded
        System.out.print("Enter Times compoumded:");
        timesCompounded=scanner.nextInt();

        // calculation of amount
        amount=principal*Math.pow(1+(rate/timesCompounded), timesCompounded*time);
        System.out.printf("The compound amount is %.2f \n",amount);

        // compound intrest
        CompoundIntrest=amount-principal;
        System.out.printf( "The compound intrest is %.2f" ,CompoundIntrest);
        scanner.close();

    }
    
}