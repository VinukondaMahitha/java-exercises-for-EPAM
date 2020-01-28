import java.util.*;
class E31
{
public static void main(String args[])
{
if(args.length==9)
{
int max=0;
for(int i=0;i<args.length;i++)
{
System.out.print(Integer.parseInt(args[i]));
if(i==2 || i==5)
System.out.println();
if(Integer.parseInt(args[i])>max)
max=(Integer.parseInt(args[i]));
}
System.out.println("greatest element is"+max);
}
}
}
