import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,num=1;
      for(i=1;i<=n;i++)
      {
        num=num*i;
	}
      System.out.println(num);
}
}