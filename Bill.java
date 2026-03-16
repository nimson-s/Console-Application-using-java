import java.io.*;

class Bill
{
  public static void main (String arg[]) throws Exception
  { 
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.println("Divagar computer education");
    System.out.println("no 22.,lawspet,pudhucherry");
    System.out.println("__________________________");
    System.out.println("Bill Receipt");
    System.out.println("__________________________");

    System.out.println("enter the product no:");
    String s1 = br.readLine();
    int a = Integer.parseInt(s1);

    System.out.println("enter the particulars:");
    String s2 = br.readLine();

    double amount;
    double gst;
    double total;
    int quantity;

    System.out.println("enter the rate");
    String s3 = br.readLine();
    int rate = Integer.parseInt(s3);

    System.out.println("enter the quantity");
    String s4 = br.readLine();
    quantity = Integer.parseInt(s4);

    amount = rate * quantity;
    System.out.println("product amount " + amount);

    gst = amount * 12 / 100;
    System.out.println("gst " + gst);

    total = amount + gst;
    System.out.println("total amount " + total);

    System.out.println("____________________");
  }
}