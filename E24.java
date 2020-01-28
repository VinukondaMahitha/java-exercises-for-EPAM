import java.util.*;
public class E24
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=a;
int rev=0,rem=0;
while(a>0)
{
rem=a%10;
rev=(rev)+rem;
a=a/10;
}
System.out.println("the sum of digits is "+b+" is "+rev);
}

}