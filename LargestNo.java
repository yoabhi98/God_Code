import java.util.*;
public class LargestNo
{

     
public static void main(String []args)
{
                
Scanner sc=new Scanner(System.in);
      
int a1 = sc.nextInt(); 

int b1 = sc.nextInt(); 

int c1 = sc.nextInt(); 

if(a1>b1 && a>c1)
System.out.println(a1); 
else if(b1>a && b1>c1)
System.out.println(b1);
else
System.out.println(c1);
           
}
}