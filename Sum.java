import java.util.*;
public class Sum
{

     
public static void main(String []args)
{
               
Scanner sc=new Scanner(System.in);

int sum=0;
int n = sc.nextInt();
int arr[]=new int[n];       
int a=sc.nextInt(); 

for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0;i<a;i++)
sum+=arr[i];
System.out.println(sum);      
}
}