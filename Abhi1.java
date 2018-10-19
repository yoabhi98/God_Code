import java.util.*;
public class Abhi1
{

     
public static void main(String []args)
{
        
System.out.println("Enter a Character");
        
Scanner sc=new Scanner(System.in);
       
char n = sc.next().charAt(0); 
if(Check(n)==1)
System.out.println("Entered Character is Vowel");

else if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
System.out.println("Entered character is Consonent"); 
else
System.out.println("Invalid Character");
        
}
public static int Check(char n)
{
int a=0;
char []candidates = new char[] { 'A', 'E','G','I','O','U','a','e','i','o','u'};
for (char c : candidates)
{       
if(n==c)
 
a=1;
}
return a;    
}
}