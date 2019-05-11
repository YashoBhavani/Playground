import java.util.Scanner;
class Main{
  public static int power_of_num(int b,int e)
  {
    int result=1,i;
    for(i=1;i<=e;i++)
    {
      result=result*b;
    }
    return result;
  }
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exp=in.nextInt();
      int power=1;
      power=power_of_num(base,exp);
      System.out.println(power);
	}
}

