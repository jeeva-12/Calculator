import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
     int a=0,b=0,option,ex;

     {
         Scanner sc=new Scanner(System.in);
                 System.out.println("Enter your choice");
                 System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division 5.Exit");
                 option=sc.nextInt();
     }

     switch (option)
     {
         case 1:System.out.println("Addition");
         case 2:System.out.println("Substraction");
         case 3:System.out.println("Mulitiplication");
         case 4:System.out.println("Division");
         default:System.out.println("Invalid choice");
     }

     }

}
