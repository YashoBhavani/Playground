import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int n1=in.nextInt();
      int n2=in.nextInt();
       int is_matched=0,matched=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==n1)
        {
          System.out.println(i);
          is_matched=1;
          break;
      }
      }
           for(int i=0;i<n;i++)
      {
        if(a[i]==n2)
        {
          System.out.println(i);
          matched=1;
          break;
           }
      }
     if(is_matched==0)
     {
        System.out.println("-1");
     }
        if(matched==0)
        {
       System.out.println("-1");
        }
    }
}