import java.util.*;
public class HelloWorld
{

     
public static void main(String []args)
{
        
System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
if(n==0)
         
System.out.println("Number is zero");
        else if(n>0)
         System.out.println("Number is Positive");
         
else
          
System.out.println("Number is Negative");
         
     
}
}