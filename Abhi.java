import java.util.*;
public class Abhi
{

     
public static void main(String []args)
{
 
try{       
System.out.println("Enter a Number");
        
Scanner sc=new Scanner(System.in);
       
 int n=sc.nextInt();
       
if(n%2==0)
         
System.out.println("Number is Even");
        
else        
System.out.println("Number is Odd");
 
}
catch(Exception e)
{
System.out.println("Invalid Number");
         
     
}        
}
}