import java.util.*;
class swap 
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner ar=new Scanner(System.in);

        System.out.println("Enter value of a ");
        a=ar.nextInt();
        System.out.println("Enter value of b ");
        b=ar.nextInt();
        c=a;a=b;b=c;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
        ar.close();
    }
}
