import java.util.*;
class Number
{
    public static void main(String[] args)
    {
        int i=1;
        int num;
        int sum=0;
        int avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num=sc.nextInt();
        while(i<=num)
        {
            System.out.print(" "+i);
            if(i%2!=0)
            {
                sum=i+sum;
            }
            i++;
        }
        avg=sum/i;
        System.out.println("Sum : "+sum);
        System.out.println("Avg : "+avg);
        sc.close();
    }
}
