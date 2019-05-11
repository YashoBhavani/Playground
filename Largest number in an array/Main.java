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
      int temp=0;
      for(int i=0;i<n;i++)
      {
        for(int j=1;j<n;j++)
        {
        if(a[i]<a[j])
        {
           temp=a[j];
          a[i]=a[j];
        }
      }
      }
      for(int i=0;i<1;i++)
      System.out.println(a[i]);
    }
}