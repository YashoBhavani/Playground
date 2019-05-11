import java.util.Scanner;
public class Main{
  public static int gcd_of_3no(int n1,int n2)
  {
		if (n2 == 0)
			return n1;
		else
			return gcd_of_3no(n2, n1 % n2);
	}

	public static int gcd_of_3no(int n1, int n2, int n3) {

		return gcd_of_3no(gcd_of_3no(n1, n2), n3);
    }

	public static void main (String[] args)
	{
	   Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int num2=in.nextInt();
      int num3=in.nextInt();
      int gcd=gcd_of_3no(num1,num2,num3);
      System.out.println(gcd);
	}
}