/* 
WAP that take inputs radius of circle from user(int) and print
circle ciucumfarence and area using predefined constant Math.PI. 
use follow formula..
cicum = 2pir
area = pir(square)
*/
import java.util.Scanner;
public class CircleArea
{
	public static void main(String[] args)
	{
		int radius;
		float area;
		float circum;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Program to calculate area and circumfarence of circle..");
		System.out.println("Enter radius of circle: ");
		radius = s.nextInt();
		
		area = (float) (2 * Math.PI * radius);
		System.out.println("Circumfarence of circle is: " + area);

		circum = (float) (Math.PI * radius * radius);
		System.out.println("Circumfarence of circle is: " + circum);
		
		s.close();
	}
}
