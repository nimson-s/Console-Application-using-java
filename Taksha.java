import java.io.*;

class Taksha
{
public static void main(String args[]) throws IOException
{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 System.out.println("takshashila university");
 System.out.println("ongur, tindivanam");
 System.out.println("____________________");
 System.out.println("student mark list");
 System.out.println("__________________");
 System.out.println("enter enrollment no");
 String s1=br.readLine();
 int a=Integer.parseInt(s1);

 System.out.println("enter student name:");
 String s2 = br.readLine();

 System.out.println("enter java mark");
 String s3 = br.readLine();
 int m1 =Integer.parseInt(s3);

 System.out.println("enter os mark");
 String s4 = br.readLine();
 int m2 = Integer.parseInt(s4);

 System.out.println("enter cws mark");
 String s5 = br.readLine();
 int m3 = Integer.parseInt(s5);

 int Total= m1+m2+m3;
 System.out.println("Total mark"+Total);
 int Averge= Total/3;

 System.out.println("Averge mark"+Averge);
 System.out.println("________________");
}
}