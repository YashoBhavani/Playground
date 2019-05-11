import java.util.Scanner;
class Main
{
  public static int sum_of_no(int num)
  {
   int i,sum=0;
    for(i=0;i<=num;i++)
    {
      sum=sum+i;
  }
     return sum;
}
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sod;
      sod=sum_of_no(n);
      System.out.println(sod);
      
    } 
}