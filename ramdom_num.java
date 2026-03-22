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
        System.out.println(Math.E);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.max(12, 20));
        System.out.println(Math.min(12,20));
        System.out.println(Math.abs(-5));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.ceil(3.11));
        System.out.println(Math.floor(3.11));
        System.out.println(Math.round(3.11));
        System.out.println(Math.round(3.55));
        
        String name="SpongeBob"; //%s
        char firstLetter='S'; //%c
        int age=20; //%d
        double height=4.5; //%f output=4.500000 and %.1f output=4.5
        boolean isEmployee=true; //%b
        //%[flags][width][.precision][specifier-character]
        System.out.printf("Hello %s, your first letter is %c and you are %d. Height is %.2f and Employee: %b",name,firstLetter,age,height,isEmployee);

        
    }
}
