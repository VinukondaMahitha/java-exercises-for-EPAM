import java.util.*;
class E21
{
public static void main(String args[])
{

if(args.length>0)
{
int i=Integer.parseInt(args[0]);
if(i>0)
System.out.println(i+" is positive");
else if(i<0)
System.out.println(i+" is negative");
else
System.out.println(i+" is neither positive nor negative");
}
else
{
System.out.println("An integer number as argument is expected");

}
}
}