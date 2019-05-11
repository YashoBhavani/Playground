import java.util.Scanner;
class Main{
  public static int grt_of_3no(int num1,int num2,int num3)
  {
    int great=0;
    if(num1>num2)
    {
      great=num1;
    }
    else if(num2>num1)
    {
      great=num2;
    }
    if(great>num3)
    {
      return great;
    }
    else
    {
      return num3;
    }
  }
      
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int greatest=grt_of_3no(n1,n2,n3);
      System.out.println(greatest);
	}
}