import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=in.nextInt();
    }
    int max=0;
    for(int i=0;i<n;i++)
    {
      if(max<list[i])
      {
        max=list[i];
      }
   
    }
    for(int i=0;i<n;i++)
    {
      if(max==list[i])
      {
        System.out.print(i);
      }
    }
  }
}