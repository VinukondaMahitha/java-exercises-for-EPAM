import java.util.*;
import java.io.*;
class Box
{
int p, q, r;
void init(int x,int y, int z)
{
this.p=x;
this.q=y;
this.r=z;
}
int volume()
{
int vol=(p*q*r);
return vol;
}
}
public class pro41
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Box b=new Box();
System.out.println("enter length,width,height:");
int p=sc.nextInt();
int q=sc.nextInt();
int r=sc.nextInt();
b.init(p,q,r);
int v=b.volume();
System.out.println("vol : "+v);
}
}