import java.io.*;

class EB Bill
{
    public static void main(String arg[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Government of Tamil Nadu");
        System.out.println("Electricity Board");
        System.out.println("_________________");
        System.out.println("Bill Receipt Date: 10.02.2026");
        System.out.println("_____________________");

        System.out.println("Enter the EB-No");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);

        System.out.println("Customer Name");
        String s2 = br.readLine();

        System.out.println("Enter the Previous Reading");
        String s3 = br.readLine();
        int pre = Integer.parseInt(s3);

        System.out.println("Enter Current Reading");
        String s4 = br.readLine();
        int cur = Integer.parseInt(s4);

        System.out.println("Report");

        int Total = cur - pre;
        System.out.println("Unit consumed in January " + Total + " unit");

        int Amount = Total * 5;
        System.out.println("Amount to be paid " + Amount);
    }
}