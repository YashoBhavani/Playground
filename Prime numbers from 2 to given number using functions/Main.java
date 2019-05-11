import java.util.*;
class Main
{
public static void checkPrime(int n){  
  int i,m=0,flag=0;      
  m=n/2;      
   for(i=2;i<=m;i++)
   {      
    if(n%i==0)
    {      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0) 
   { 
     System.out.println(n);
   }  
  }   
 public static void main(String args[])
 {  
   Scanner in=new Scanner(System.in);
   int num=in.nextInt();
   for(int i=2;i<=num;i++)
   {
  checkPrime(i);
     
   }
 
} 
}
   