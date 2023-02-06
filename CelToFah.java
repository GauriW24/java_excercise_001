//Take input for temperature in celsius & print in fahrenheit.
//fah = 1.8*celcius + 32
import java.util.Scanner;
public class CelToFah
{
	public static void main(String args[])
	{
		double cel_temp;
		double cel_to_fah;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter temperature into celsius: ");
		cel_temp = s.nextFloat();
		
		cel_to_fah =  (1.8f * cel_temp + 32);
		
		System.out.println("Celsius to fahrenheit temperature is: "+ cel_to_fah);
		
		s.close();
	}
}
