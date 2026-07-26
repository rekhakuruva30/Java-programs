import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a first number");
    int a=sc.nextInt();
    System.out.println("Enter a second number");
    int b=sc.nextInt();
    System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
    int chioce=sc.nextInt();
    switch(chioce)
    {
        case 1:
            System.out.println("Result"+(a+b));
            break;
        case 2:
            System.out.println("Result"+(a-b));
            break;
        case 3:
            System.out.println("Result"+(a*b));
            break;
        case 4:
            System.out.println("Result"+(a/b));
            break;
            default:
        System.out.println("Invalid choice");
    }
    }

}