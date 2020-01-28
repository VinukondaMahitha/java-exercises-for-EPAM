import java.util.*;
public class E23
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=a;
int rev=0,rem=0;
while(a>0)
{
rem=a%10;
rev=(rev*10)+rem;
a=a/10;
}
if(rev==b)
System.out.println(b+" is a palindrome");
else
System.out.println("not palindrome");
}

}