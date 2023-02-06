import java.util.Scanner;
public class WallPainting 
{
	public static void main(String args[])
	{
		float length, width, height;
		int no_of_doors, no_of_windows;
		double totalSurfaceArea, floorArea, windowArea, doorArea, totalPaintArea, requirePaint;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter length of the floor: ");
		length = s.nextFloat();
		
		System.out.println("Enter width of the floor: ");
		width = s.nextFloat();
		
		System.out.println("Enter height of the floor: ");
		height = s.nextFloat();
		
		System.out.println("Enter number of doors: ");
		no_of_doors = s.nextInt();
		
		System.out.println("Enter number of windows : ");
		no_of_windows = s.nextInt();
		
		totalSurfaceArea = 2*((length*width)+(length*height)+(height*width));
		
		floorArea = length * width;
		
		windowArea = 15 * no_of_windows;
		
		doorArea = 20 * no_of_doors;
		
		totalPaintArea = totalSurfaceArea - floorArea - windowArea - doorArea;
		
		requirePaint = totalPaintArea / 350;
		
		System.out.println("Require paint is: "+requirePaint);
		
		s.close();
	}
}
