import java.util.*;
class E32
{
public static void main(String args[])
{
if(args.length==4)
{
int max=0;
System.out.println("given array is:");
for(int i=0;i<args.length;i++)
{
System.out.print(Integer.parseInt(args[i]));
if(i==1)
System.out.println();
}
System.out.println("reversed array is:");
for(int i=args.length-1;i>=0;i--)
{
System.out.print(Integer.parseInt(args[i]));
if(i==2)
System.out.println();
}
}
}
}
