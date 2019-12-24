import java.io.*;
import java.util.*;
class Patient
{
double BMI(double w,double h)
{
double d=(w/(h*h))*703;
return d;             
}
}
public class pro43
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Patient p=new Patient();
System.out.println("Enter weight in kgs:");
double we=(sc.nextDouble())*2.205;
System.out.println("Enter height in feet:");
double he=(sc.nextDouble())*12;
System.out.println(p.BMI(we,he));
}
}