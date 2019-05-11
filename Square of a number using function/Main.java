import java.util.Scanner;
class Main
{
  public static int square_of_no(int num)
  {
    num=num*num;
    return num;
  }
    public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sqr=0;
      sqr=square_of_no(n);
      System.out.println(sqr);
      
}
}
