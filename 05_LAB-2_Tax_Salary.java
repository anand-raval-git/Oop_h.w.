import java.util.*;
class Salary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int basic_salary;
        int da;
        int hra;
        int gross_salary;
        int annual_salary;
        int tax;
        System.out.print("Enter basic salary of employee : ");
        basic_salary = sc.nextInt();
        da=(60*basic_salary)/100;
        hra=(basic_salary*25)/100;
        gross_salary=basic_salary+da+hra;
        annual_salary=basic_salary*12;
        if(gross_salary>=300000 && gross_salary<=499999)
        {
            tax=(10*annual_salary)/100;
        }
        else if(gross_salary>=500000 && gross_salary<=999999)
        {
            tax=(15*annual_salary)/100;
        }
        else
        {
            tax=(25*annual_salary)/100;
        }
        System.out.println("DA is : "+da);
        System.out.println("HRA is : "+hra);
        System.out.println("Gross salary is : "+gross_salary);
        System.out.println("Annual salary is : "+annual_salary);
        System.out.println("Tax is : "+tax);
        sc.close();
    }
}