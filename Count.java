import java.util.*;
public class Count
{

     
public static void main(String []args)
{
               
Scanner sc=new Scanner(System.in);

int count=0;
int n = sc.nextInt();
while(n!=0)
{
n/=10;
count++;
} 
System.out.println(count);     
}
}