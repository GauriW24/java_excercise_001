/* 
Area of triangle : sqrt(s*(s-a)*(s-b)*(s-c))
where s = (a+b+c)/2
side of triangle : a, b, c
*/
import java.util.Scanner;
public class TriangleArea
{
	public static void main(String[] args)
	{
		double a,b,c;
		double area,sides;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Program to calculate area of triangle ");
		
		System.out.println("Enter 1st side of triangle: ");
		a = s.nextFloat();
		System.out.println("Enter 2nd side of triangle: ");
		b = s.nextFloat();
		System.out.println("Enter 3rd side of triangle: ");
		c = s.nextFloat();
		
		sides = (a+b+c)/2;
		area = Math.sqrt((sides*(sides-a)*(sides-b)*(sides-c)));
		
		System.out.println("Area of triangle is: "+area);
		s.close();
	}
}
