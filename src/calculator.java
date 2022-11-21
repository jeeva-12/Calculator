import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        int a,b,c;
        int option;
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter your choice");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 to Quit ");
            option=sc.nextInt();
     }

     switch (option)
     {
         case 1:
             System.out.println("Enter First Number");
             a= sc.nextInt();
             System.out.println("Enter second number");
             b=sc.nextInt();
             c=a+b;
             System.out.println("Sum="+c);
             break;

         case 2:
             System.out.println("Enter First Number");
             a= sc.nextInt();
             System.out.println("Enter second number");
             b=sc.nextInt();
             c=a-b;
             System.out.println("Substaction="+c);

         case 3:
             System.out.println("Enter First Number");
             a= sc.nextInt();
             System.out.println("Enter second number");
             b=sc.nextInt();
             c=a*b;
             System.out.println("Muliplication="+c);



     }

     }



    }


}
