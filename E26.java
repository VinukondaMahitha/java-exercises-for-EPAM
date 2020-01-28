import java.util.*;
 class E26
{
public static void main(String args[])
{
if(args.length>0)
{
int a=Integer.parseInt(args[0]);
int fact=1,i=1;

do
{
fact=fact*i;
i++;
}while(i<=a);
System.out.println(fact);
}

}
}