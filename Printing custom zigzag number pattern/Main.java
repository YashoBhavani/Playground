import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    int i,j,num=1;
	
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.print(num+1);
		}
		for(j=1;j<n;j++)
		{
		System.out.print(num);
		}
		if(i%2!=0)
		{
System.out.print(num+1);
		}
		num++;
		System.out.print("\n");
	}
    }
}