import java.io.*;

class Employee
{
    public static void main(String arg[]) throws Exception
    {	
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Divagar AM International Pvt. Ltd");
        System.out.println("T.Nagar, Chennai, Tamil Nadu");
        System.out.println("____________________________");
        System.out.println("Employee Payroll System");
        System.out.println("____________________________");

        System.out.println("Enter the Employee ID:");
        String s1 = br.readLine();
        int empid = Integer.parseInt(s1);

        System.out.println("Enter the Employee Name:");
        String name = br.readLine();

        System.out.println("Enter the Salary:");
        String s3 = br.readLine();
        int salary = Integer.parseInt(s3);

        System.out.println("\nIncome");

        int bonus = salary * 20 / 100;
        System.out.println("Bonus (20% of salary) = " + bonus);

        int increment = salary * 10 / 100;
        System.out.println("Increment (10% of salary) = " + increment);

        int grosspay = salary + bonus + increment;
        System.out.println("Gross Pay = " + grosspay);

        System.out.println("\nExpenditure");

        int rental = salary * 3 / 100;
        System.out.println("Rental (3% of salary) = " + rental);

        int rate = salary * 2 / 100;
        System.out.println("Rate (2% of salary) = " + rate);

        int deduction = rental + rate;

        int netpay = grosspay - deduction;
        System.out.println("Net Pay (Take Home) = " + netpay);
    }
}