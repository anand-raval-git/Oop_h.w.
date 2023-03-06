import java.util.*;
class sum
{
    public static void main(String[] args)
    {
        int a=0,b=0;
        Scanner ar =  new Scanner(System.in);
        System.out.println("Enter value of a ");
        a=ar.nextInt();
        System.out.println("Enter value of b ");
        b=ar.nextInt();
        int add=a+b;
        int sub=a-b;
        int div=a/b;
        int multi=a*b;
        System.out.println("a+b="+add);
        System.out.println("a-b="+sub);
        System.out.println("a/b="+div);
        System.out.println("a*b="+multi);
        ar.close();
    }    
}
