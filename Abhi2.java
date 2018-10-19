import java.util.*;
public class Abhi2
{

     
public static void main(String []args)
{
        
System.out.println("Enter a Character");
        
Scanner sc=new Scanner(System.in);
       
char n = sc.next().charAt(0); 

if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
System.out.println("Alaphabet"); 
else
System.out.println("No");
           
}
}