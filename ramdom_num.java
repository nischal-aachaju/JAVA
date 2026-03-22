import java.util.Random;

public class ramdom_num {
    public static void main(String[] args){
        Random random =new Random();
        int num=random.nextInt();
        System.out.println(num);

        double num_dbl=random.nextDouble();
        System.out.println(num_dbl);

        boolean isHead;

        isHead=random.nextBoolean();
        System.out.println(isHead);

        if (isHead){
            System.out.println("It is Head");
        }

        else{
            System.out.println("It is Tail");
        }

        
        
    }
}
