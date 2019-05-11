import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n=in.nextInt();
      int i ,j,count=1;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(count%2==0)
          {
          System.out.print("#");
            count=1;
          }
          else
          {
            System.out.print("*");
            count++;
          }
    }
        System.out.print("\n");
}
    }
}