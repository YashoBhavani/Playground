import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[];
    list=new int[20];
    int sum1=0,sum2=0,sum3=0;
    for(int i=1;i<=n;i++)
    {
      list[i]=in.nextInt();
    }
    if(n%2==0)
    {
      for(int i=1;i<=3;i++)
        sum1=sum1+list[i];
      for(int i=4;i<=6;i++)
        sum2=sum2+list[i];
      if(sum1==sum2)
      {
        System.out.print("Perfect Batch");
        
      }
      else
      {
        System.out.print("Not a Perfect Batch");
    }
    }
    if(n>6)
    {
       for(int i=1;i<=3;i++)
        sum1=sum1+list[i];
      for(int i=4;i<=6;i++)
        sum2=sum2+list[i];
      for(int i=7;i<=9;i++)
        sum3=sum3+list[i];
      if(sum1==sum2&&sum1==sum3&&sum2==sum3)
        System.out.print("Perfect Batch");
      else
        System.out.print("Not a Perfect Batch");
    }
  }
}