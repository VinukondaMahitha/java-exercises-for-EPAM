import java.util.*;
import java.io.*;
class Calculator
{
static int powerInt(int num1,int num2)
{
return (int)Math.pow(num1,num2);
}
static double powerDouble(double num1,double num2)
{
return Math.pow(num1,num2); 
}
}
public class pro42
{
public static void main(String args[])
{
System.out.println(Calculator.powerInt(10,2));
System.out.println(Calculator.powerDouble(10,2));
}

}