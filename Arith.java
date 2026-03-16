import java.io.*;
 
class Arith
{
 public static void main(String args[])throws IOException
{
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   
	System.out.println("Arithmatic operation");
	System.out.println("_____________________");
	System.out.println("enter the first number");
	String s1=br.readLine();
	int a=Integer.parseInt(s1);
	
	System.out.println("enter the second number");
	String s2=br.readLine();
	int b=Integer.parseInt(s2);

	System.out.println("Result");
	int c= a + b;
	System.out.println("add="+ c);
	int d=  a - b;
	System.out.println("sub="+ d);
	int e= a * b;
	System.out.println("mutl="+ e);
	int f= a/ b;
	System.out.println("div="+ f);
	}
      }