import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[20];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=0)
        {
          System.out.print(arr[i]);
          System.out.print(" ");
        }
      }
      int countz=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==0)
        {
          countz++;
        }
      }
      for(int i=0;i<countz;i++)
      {
        System.out.print("0");
        System.out.print(" ");
      }
    }
}


