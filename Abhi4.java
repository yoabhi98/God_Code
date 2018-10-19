import java.util.*;
public class Abhi4
{

     
public static void main(String []args)
{
        
System.out.println("Enter Year");
        
Scanner sc=new Scanner(System.in);
       
int yy = sc.nextInt(); 

if(yy%4==0 && yy%100!=0 || yy%400==0)
System.out.println("yes"); 
else
System.out.println("no");     
}
}