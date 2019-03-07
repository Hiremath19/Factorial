import java.util.Scanner;

public class
Factorial
{
    public static void main(String args[])
    {
        int n;
        int fact = 1;


        System.out.println("Enter the Factroial Number : ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        if(n<0)
            System.out.println("Factorial Number is  negative : ");
        else

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial Number is: " + fact);

    }
}
